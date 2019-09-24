## Design de Software

#### Exercícios aula semana 23/09

a) Qual a diferença entre new String(“Goiânia”) e apenas “Goiânia”?

```new String("Goiânia")``` representa a criação de uma instancia da classe
`String` e armazena na memória. A criação de uma váriável `"Goiânia"` em Java,
usa o conceito de _pool_ de string para caso está seja definida novamente, será
usada a mesma referência na memória.
