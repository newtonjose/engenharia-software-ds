package com.github.newtonjose.autocloseable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Classe que implementa a inteface AutoCloseable sobrescrevendo o método
 * close.
 */
public class FileInputStreamAutoCloseable extends FileInputStream implements
        AutoCloseable {

    public FileInputStreamAutoCloseable(String s) throws FileNotFoundException {
        super(s);
    }


    /**
     * Método sobrescrevendo o close default de FileInputStream.
     *
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        super.close();
        throw new RuntimeException("método close chamado");
    }
}
