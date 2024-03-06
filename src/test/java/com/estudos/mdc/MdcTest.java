package com.estudos.mdc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MdcTest {

    @Test
    void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int obtido = Mdc.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = Mdc.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcParesP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = Mdc.mdc(a, b);

        // assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }

    @Test
    void testMdcP3() {
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = Mdc.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcANegativoP3() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = Mdc.mdc(a, b);

        assertEquals(esperado, obtido);

    }

    @Test
    void testMdcMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = Mdc.mdc(a*m,b*m);
        final int obtido = m * Mdc.mdc(a, b);

        assertEquals(esperado, obtido);
    }
}