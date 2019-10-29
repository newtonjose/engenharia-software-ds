package com.newtonjose.aqlanalyser.aqlparser;

public class SimpleEhrQueryTest extends AbstractAqlQueryTest {

	@Override
	protected String aqlQueryString() {
		return "SELECT TOP 10 e/ehr_id/value as id FROM EHR e;";
	}
}

