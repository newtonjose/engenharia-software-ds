package com.newtonjose.aqlanalyser.aqlparser;

import com.newtonjose.aqlparser.AqlLexer;
import com.newtonjose.aqlparser.AqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import com.newtonjose.aqlparser.AqlParser.QueryContext;
import com.github.newtonjose.aqlanalyzer.aqlparser.AqlQueryVisitor;

public abstract class AbstractAqlQueryTest {

	protected abstract String aqlQueryString();

	protected String visit(ANTLRInputStream inputStream) {
		AqlLexer aqlLexer = new AqlLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(aqlLexer);
		AqlParser aqlParser = new AqlParser(tokenStream);
		aqlParser.setBuildParseTree(true);
		aqlParser.setProfile(true);
		// aqlParser.setTrace(true);
		QueryContext queryContext = aqlParser.query();
		// ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		// AqlListener aqlListener = new AqlListener();
		// parseTreeWalker.walk(aqlListener, queryContext);
		AqlQueryVisitor aqlQueryVisitor = new AqlQueryVisitor();
		String result = aqlQueryVisitor.visit(queryContext);
		return result;
	}

	@Test
	public void testQuery() {
		String queryString = aqlQueryString();
		ANTLRInputStream inputStream = new ANTLRInputStream(queryString);
		String result = visit(inputStream);
		System.out.println(result);
	}
}
