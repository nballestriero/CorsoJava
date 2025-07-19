package Modulo1.Lezione6;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */


public class Esercizio4Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testCalcolaMedia() {
        String input = "3\n6.0\n7.0\n8.0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Esercizio4 e = new Esercizio4();
        e.calcolaMedia();

        String output = outContent.toString();
        assertTrue(output.contains("Media: 7.0"));
    }
}
