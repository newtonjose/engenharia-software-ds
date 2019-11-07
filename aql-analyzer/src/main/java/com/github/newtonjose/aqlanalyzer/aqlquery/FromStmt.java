package com.github.newtonjose.aqlanalyzer.aqlquery;

import com.newtonjose.aqlquery.AqlParser;


public class FromStmt extends AqlStatement {
    FromStmt(AqlParser.FromContext ctx) {
        this.context = ctx;
    }
}
