package com.github.newtonjose.autocloseable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileInputStreamAutoCloseableTest {

    @Before
    public void criarArquivo() throws IOException {
        Files.createFile(Paths.get("test.java"));
    }

    @Test
    public void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try (FileInputStreamAutoCloseable obj = new FileInputStreamAutoCloseable("test.java")) {
            }
        });
    }

    @After
    public void removeArquivo() throws IOException {
        Files.deleteIfExists(Paths.get("test.java"));
    }
}
