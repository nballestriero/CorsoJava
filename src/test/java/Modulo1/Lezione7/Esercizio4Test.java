package Modulo1.Lezione7;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */


class Esercizio4Test {
    @Test
    void testIndiceMassimo() {
        String simulatedInput = "5\n10\n7\n15\n4\n9\n";
        InputStream originalIn = System.in;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outContent));

        new Esercizio4().indiceMassimo();

        System.setIn(originalIn);
        assertTrue(outContent.toString().contains("Indice massimo: 2"));
    }
}