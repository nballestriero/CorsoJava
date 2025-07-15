package Modulo1.Lezione2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Nicolo
 */


public class Esercizio6Test {
    @Test
    public void testRispostaCorretta() {
        String input = "true\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio6().verificaRisposta();

        assertEquals("Il sole è una stella? (true/false)\nRisposta corretta\n", out.toString());
    }
}