package com.newtonjose.aqlanalyser.aqlquery;

import com.github.newtonjose.aqlanalyzer.aqlquery.AqlQuery;
import com.github.newtonjose.aqlanalyzer.aqlquery.FromStmt;
import org.junit.jupiter.api.Test;

public class AqlQueryTest {

    @Test
    void testCreateQuery() {
        String query = "SELECT TOP 10 e/ehr_id/value as  FROM EHR e;";
        AqlQuery aq = new AqlQuery(query);

        FromStmt fStmt = aq.getFromStmt();

        System.out.printf(fStmt.toString());

    }
}
