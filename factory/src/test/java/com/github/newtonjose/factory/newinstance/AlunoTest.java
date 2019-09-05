package com.github.newtonjose.factory.newinstance;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void atividadeExercida() throws ClassNotFoundException,
            InvocationTargetException, InstantiationException,
            NoSuchMethodException, IllegalAccessException {

        Aluno aluno = Factory.newInstance(
                "com.github.newtonjose.factory.newinstance.Aluno"
        );

        assertEquals("estudar", aluno.atividadeExercida());
    }
}