package com.github.newtonjose.factory.newinstance;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    public static <T> T newInstance(String className)
            throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {

        Class<?> classe = Class.forName(className);

        return (T) classe.getDeclaredConstructor().newInstance();
    }
}
