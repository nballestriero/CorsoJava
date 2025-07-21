package Modulo1.Lezione7;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio2Test {
    @Test
    void testLeggiPositivo() {
        String simulatedInput = "-3\n0\n4\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outContent));

        new Esercizio2().leggiPositivo();

        System.setIn(originalIn);
        System.setOut(originalOut);

        assertTrue(outContent.toString().contains("Hai inserito: 4"));
    }
}
