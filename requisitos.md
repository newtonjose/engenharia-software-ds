# Módulo Estrutura de dados para AQL

## Descrição do módulo

Uma consulta em AQL é “similar” ou “parecida” com uma consulta SQL.
O objetivo é obter uma estrutura de dados que represente a consulta e facilite a posterior análise e execução.
Convém destacar que há compilador disponível para a AQL (analisador léxico e sintático).

## Requisitos

- R1 - O módulo recebe como entrada uma sequência de caracteres ou arquivo.aql 
correspondente ao conteúdo de uma consulta em AQL;
- R2 - O módulo é capaz de verificar se a consulta AQL está sintaticamente correta. 
Em caso de não conformidade, então o módulo deverá sinalizar por meio de mensagem 
de erro adequada, a não conformidade da consulta recebida;
- R3 - O módulo deverá receber a consulta AQL e produzir uma estrutura de dados 
equivalente à consulta;
- R4 - Todas as consultas validas e convertida para a estrutura de dados
serão retornadas para análise e execução posteriormente;
- R5 - O módulo será capaz de receber a estrutura de dados válida e converter
para a sequência de caracteres sem perda ou acréscimo de dados. 


## Notas

- Especificação:

| #        |      Nome     |  Descrição |
|----------|:-------------:|-----------:|
| ES01     | R1.           | Uma consulta deverá ter uma ou mais palavras-chaves: FOR, RETURN, FILTER, SEARCH, SORT, LIMIT, LET, COLLECT, INSERT, UPDATE, REPLACE, REMOVE, UPSERT. |
| ES02     | R2            | Para validação da sintaxe, será usado um compilador para AQL. |
