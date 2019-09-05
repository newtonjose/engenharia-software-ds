package com.github.newtonjose.factory.newinstance;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessorTest {

    @Test
    void atividadeExercida() throws ClassNotFoundException,
            InvocationTargetException, InstantiationException,
            NoSuchMethodException, IllegalAccessException {

        Professor professor = Factory.newInstance(
                "com.github.newtonjose.factory.newinstance.Professor"
        );

        assertEquals("educar", professor.atividadeExercida());
    }
}