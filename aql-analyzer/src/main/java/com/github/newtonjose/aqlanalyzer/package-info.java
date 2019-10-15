/**
 * Description: Módulo responsável para receber como entrada
 * uma string ou path para um arquivo.aql.
 *
 * Design class:
 * (a) {@link com.github.newtonjose.aqlanalyzer.inputquery.CreateStatement}
 * Classe responsável por fornecer uma interface pública para receber consultas
 * em formato String ou aquivo.aql e com esses dados, fará uma conversão para o formato que será
 * usado pela pelo modulo aqlparser.
 * * Design methods:
 * * - CreateStatement().parseString(queryStr="SELECT e/ehr_id/value as id FROM EHR e;")
 * * - CreateStatement().parseFile(filePath="path/to/file.aql")
 */
package com.github.newtonjose.aqlanalyzer;
