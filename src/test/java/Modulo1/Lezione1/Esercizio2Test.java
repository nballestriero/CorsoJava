package Modulo1.Lezione1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio2Test {
    @Test
    void testConversioni() {
        Esercizio2 e2 = new Esercizio2();
        String result = e2.conversioni();

        assertTrue(result.contains("a: 100"));
        assertTrue(result.contains("b: 100.0"));
        assertTrue(result.contains("c: 100"));
        assertTrue(result.contains("d: 9.75"));
        assertTrue(result.contains("e: 9"));
        assertTrue(result.contains("f: -126")); // overflow del byte
    }
}