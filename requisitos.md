# Módulo Estrutura de dados para AQL

## Descrição do módulo

Uma consulta em AQL é “similar” ou “parecida” com uma consulta SQL.
O objetivo é obter uma estrutura de dados que represente a consulta e facilite a posterior análise e execução.
Convém destacar que há compilador disponível para a AQL (analisador léxico e sintático).

## Requisitos

- R1 - O módulo recebe como entrada uma sequência de caracteres ou arquivo.aql 
correspondente ao conteúdo de uma consulta em AQL e produzir uma estrutura de 
dados equivalente à consulta;
- R2 - O módulo é capaz de verificar se a consulta AQL está sintaticamente correta. 
Em caso de não conformidade, então o módulo deverá sinalizar por meio de mensagem 
de erro adequada, a não conformidade da consulta recebida; 
- R3 - O módulo será capaz de receber a estrutura de dados válida e converter
 para a estrutura de dados e retornar para análise e execução posteriormente;
- R4 - A estrutura de dados gerada de uma a consulta válida não porderá ter perda ou 
acréscimo de dados.


## Notas

- Especificação:

| #        |      Nome     |  Descrição |
|----------|:-------------:|-----------:|
| ES01     | R1            | Uma consulta deverá ter uma ou mais palavras-chaves da AQL: FOR, RETURN, FILTER, SEARCH, SORT, LIMIT, LET, COLLECT, INSERT, UPDATE, REPLACE, REMOVE, UPSERT. |
| ES02     | R2            | Para validação da sintaxe, será usado um compilador para AQL (analisador léxico e sintático). |
| ES03     | R3            | Será retornado uma Árvore Sintática Abstrata (_AST_) em formato JSON.
| ES03     | R4            | A estrutura de dados proposta deverá ser bem definida e com padrão estabelecido.
