# Módulo Estrutura de dados para AQL

## Descrição do módulo

Uma consulta em AQL é “similar” ou “parecida” com uma consulta SQL.
O objetivo é obter uma estrutura de dados que represente a consulta e facilite a posterior análise e execução.
Convém destacar que há compilador disponível para a AQL (analisador léxico e sintático).

## Requisitos Funcionais

- R01 - O módulo recebe como entrada uma sequência de caracteres ou arquivo.aql 
correspondente ao conteúdo de uma consulta em AQL e produzir uma estrutura de 
dados equivalente à consulta;
- R02 - O módulo é capaz de verificar se a consulta AQL está sintaticamente correta. 
Em caso de não conformidade, então o módulo deverá sinalizar por meio de mensagem 
de erro adequada, a não conformidade da consulta recebida; 
- R03 - O módulo será capaz de receber a estrutura de dados válida e converter
 para a estrutura de dados e retornar para análise e execução posteriormente;
- R04 - A estrutura de dados gerada de uma a consulta válida não porderá ter perda ou 
acréscimo de dados.


#### Notas

- Especificação:

| #        |      Nome     |  Descrição |
|----------|:-------------:|-----------:|
| ES01     | R01            | Uma consulta deverá ter uma ou mais palavras-chaves da AQL: FOR, RETURN, FILTER, SEARCH, SORT, LIMIT, LET, COLLECT, INSERT, UPDATE, REPLACE, REMOVE, UPSERT. |
| ES02     | R02            | Para validação da sintaxe, será usado um compilador para AQL (analisador léxico e sintático). |
| ES03     | R03            | Será retornado uma Árvore Sintática Abstrata (_AST_) em formato JSON.
| ES03     | R04            | A estrutura de dados proposta deverá ser bem definida e com padrão estabelecido.


## Requisitos Não Funcionais

- R01 - O módulo terá uma classe pública para uso das funcionalidades
proposta.
- R02 - O módulo usará a biblioteca ANTL4 para criar as _AST_ e verificar se
a arvore criada a partir da consulta é valida.
 consulta AQL.
 
 #### Notas
 
 - Especificação:
 
 | #        |      Nome     |  Descrição |
 |----------|:-------------:|-----------:|
 | ES01     | R01           | A Classe terá dois métodos: um para validar se uma sequência de caracters ou arquivo .aql representa uma consulta válida. E segundo que receberá uma estrutura de dados e retornará a sequência de caractéres correspondente.
 | ES02     | R02           | Um compilador viável que poderá ser adotado: [openEHR](https://github.com/openEHR/archie).