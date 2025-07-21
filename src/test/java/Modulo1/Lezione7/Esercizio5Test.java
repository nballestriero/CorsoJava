package Modulo1.Lezione7;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */



class Esercizio5Test {
    @Test
    void testConvalidaArray() {
        String simulatedInput = "3\n-1\n0\n-5\n";
        InputStream originalIn = System.in;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outContent));

        new Esercizio5().convalidaArray();

        System.setIn(originalIn);
        String output = outContent.toString();
        assertTrue(output.contains("-1"));
        assertTrue(output.contains("-5"));
    }
}
