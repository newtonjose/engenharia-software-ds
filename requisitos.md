# Módulo Estrutura de dados para AQL

## Descrição do módulo

Uma consulta em AQL é “similar” ou “parecida” com uma consulta SQL.
O objetivo é obter uma estrutura de dados que represente a consulta e facilite a posterior análise e execução.
Convém destacar que há compilador disponível para a AQL (analisador léxico e sintático).

## Requisitos

- R1 O módulo recebe como entrada uma sequência de caracteres correspondente ao conteúdo de uma consulta em AQL.
- R2 O módulo é capaz de verificar se a consulta AQL está sintaticamente correta. Em caso de não conformidade, 
então o módulo deverá sinalizar por meio de mensagem de erro adequada, a não conformidade da consulta recebida.
- R3 O módulo deverá receber a consulta AQL e produzir uma estrutura de dados equivalente à consulta, ou seja, 
a consulta pode ser convertida na estrutura de dados e, no sentido inverso, a estrutura de dados pode ser 
convertida na sequência de caracteres sem perda ou acréscimo de dados, em ambos os sentidos.

## Notas
- Especificação:

| #        |      Nome     |  Descrição |
|----------|:-------------:|------:|
| RF01     | Estruturas sintáticas e léxicas em AQL. | Estruturas que serão compiladas |
| RF02     |                | 
