package Modulo1.Lezione2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Nicolo
 */


public class Esercizio2Test {
    @Test
    public void testSomma() {
        String input = "4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio2().somma();

        assertEquals("La somma e': 9" + System.lineSeparator(), out.toString());
    }
}
