package Modulo1.Lezione7;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio3Test {
    @Test
    void testStampaPari() {
        String simulatedInput = "4\n2\n3\n6\n9\n";
        InputStream originalIn = System.in;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outContent));

        new Esercizio3().stampaPari();

        System.setIn(originalIn);
        assertTrue(outContent.toString().contains("2"));
        assertTrue(outContent.toString().contains("6"));
        assertFalse(outContent.toString().contains("3"));
        assertFalse(outContent.toString().contains("9"));
    }
}
