package Modulo1.Lezione5;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Nicolo
 */

public class Esercizio2Test {
    
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testCalcolaSomma() {
        String inputSimulato = "3\n8\n-1\n10\n9\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio2 vs = new Esercizio2();
        vs.calcolaSomma();
        assertTrue(outContent.toString().contains("Somma: 27"));
    }
}
