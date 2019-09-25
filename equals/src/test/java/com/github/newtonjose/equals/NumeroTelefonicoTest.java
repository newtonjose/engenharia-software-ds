package com.github.newtonjose.equals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeroTelefonicoTest {

    NumeroTelefonico nt = new NumeroTelefonico("+55", "62",
            "89999-9999");

    Set<NumeroTelefonico> numeroTelefonicos = new HashSet<>();

    @Test
    void testReflexive() {
        assertTrue(nt.equals(nt));
    }

    @Test
    void isNotInstanceof() {
        assertFalse(nt.equals(new String("Test not is instance")));
    }

    @Test
    void testSymmetric() {
        numeroTelefonicos.add(nt);
        NumeroTelefonico ntCopy = new NumeroTelefonico("+55", "62",
                "89999-9999");

        assertTrue(numeroTelefonicos.contains(ntCopy));
    }
}
