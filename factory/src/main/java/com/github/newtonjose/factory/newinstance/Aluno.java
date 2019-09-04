package com.github.newtonjose.factory.newinstance;

public class Aluno implements Trabalhador {
    private static final String ATIVIDADE = "estudar";

    /**
     * @return String Atividade exercida.
     */
    public String atividadeExercida() {
        return ATIVIDADE;
    }
}
