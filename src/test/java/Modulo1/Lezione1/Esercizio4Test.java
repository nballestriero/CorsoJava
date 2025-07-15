package Modulo1.Lezione1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio4Test {
    @Test
    void testQuiz() {
        String output = new Esercizio4().quiz();
        assertTrue(output.contains("a: -128")); // overflow del byte
        assertTrue(output.contains("!x: true"));
        assertTrue(output.contains("(int)c: 65"));
    }
}
