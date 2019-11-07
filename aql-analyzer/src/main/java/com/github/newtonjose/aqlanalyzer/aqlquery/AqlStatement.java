package com.github.newtonjose.aqlanalyzer.aqlquery;

import org.antlr.v4.runtime.ParserRuleContext;

abstract class AqlStatement {

    ParserRuleContext context = null;

    @Override
    public String toString() {
        return this.context.getText();
    }
}
