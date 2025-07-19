package Modulo1.Lezione5;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio4Test {

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testCalcolaMedia() {
        String inputSimulato = "3\n6.0\n7.0\n9.0\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio4 mn = new Esercizio4();
        mn.calcolaMedia();
        String output = outContent.toString();
        assertTrue(output.contains("Media: 7.333"));
    }
}
