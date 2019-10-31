package com.newtonjose.aqlanalyser.aqlparser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newtonjose.aqlparser.AqlLexer;
import com.newtonjose.aqlparser.AqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Test para criação de uma estrutura JSON. Ref.: https://stackoverflow.com/questions/49116223/convert-antlr-parse-tree-to-json
 */
class TestANTLtoJSON {
    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Gson GSON = new Gson();

    private static String toJson(ParseTree tree) {
        return toJson(tree, true);
    }

    private static String toJson(ParseTree tree, boolean prettyPrint) {
        return prettyPrint ? PRETTY_PRINT_GSON.toJson(toMap(tree)) : GSON.toJson(toMap(tree));
    }

    private static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    private static void traverse(ParseTree tree, Map<String, Object> map) {

        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", token.getType());
            map.put("text", token.getText());
        }
        else {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                traverse(tree.getChild(i), nested);
            }
        }
    }

    @Test
    void testCriaJsonFromANTL(){
        ANTLRInputStream inputStream = new ANTLRInputStream("SELECT e/ehr_id/value as id FROM EHR e;");

        AqlLexer aqlLexer = new AqlLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(aqlLexer);
        AqlParser aqlParser = new AqlParser(tokenStream);
        aqlParser.setBuildParseTree(true);
        aqlParser.setProfile(true);
        // aqlParser.setTrace(true);
        AqlParser.QueryContext queryContext = aqlParser.query();
        System.out.println(toJson(queryContext));
    }
}
