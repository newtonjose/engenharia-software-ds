package com.github.newtonjose.factory.newinstance;

import java.lang.reflect.InvocationTargetException;

public class Professor implements Trabalhador {
    private static final String ATIVIDADE = "educar";

    /**
     * @return String Atividade exercida.
     */
    public String atividadeExercida() {
        return ATIVIDADE;
    }
}
