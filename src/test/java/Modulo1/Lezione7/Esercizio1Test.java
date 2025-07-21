package Modulo1.Lezione7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

class Esercizio1Test {
    @Test
    void testSommaNumeri() {
        String simulatedInput = "5\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outContent));

        new Esercizio1().sommaNumeri();

        System.setIn(originalIn);
        System.setOut(originalOut);

        assertTrue(outContent.toString().contains("Somma: 15"));
    }
}