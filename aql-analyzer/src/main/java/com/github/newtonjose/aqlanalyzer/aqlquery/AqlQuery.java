package com.github.newtonjose.aqlanalyzer.aqlquery;

import com.newtonjose.aqlquery.AqlLexer;
import com.newtonjose.aqlquery.AqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class AqlQuery {
    private AqlParser.QueryContext queryContext = null;

    public AqlQuery(final String query) {

        ANTLRInputStream inputStream = new ANTLRInputStream(query);

        try {
            AqlLexer aqlLexer = new AqlLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(aqlLexer);
            AqlParser aqlParser = new AqlParser(tokenStream);
            aqlParser.setBuildParseTree(true);
            this.queryContext = aqlParser.query();
        } catch (Exception exp) {
            throw new RuntimeException(exp.toString());
        }

    }

//    public void main (String args...) {
//        FromStmt fStmt = this.getFromStmt();
//
//    }

    public FromStmt getFromStmt() {
        return new FromStmt(queryContext.from());
    }
}
