package Modulo1.Lezione2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Nicolo
 */


public class Esercizio4Test {
    @Test
    public void testLeggiStudente() {
        String input = "Marco\n5A\n8.2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio4().leggiStudente();

        String output = out.toString();
        assertTrue(output.contains("Nome: Marco"));
        assertTrue(output.contains("Classe: 5A"));
        assertTrue(output.contains("Media: 8.2"));
    }
}
