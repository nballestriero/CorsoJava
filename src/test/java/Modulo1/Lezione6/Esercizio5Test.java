package Modulo1.Lezione6;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio5Test {
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
    void testTrovaMinMax() {
        String input = "4\n15\n3\n22\n8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Esercizio5 e = new Esercizio5();
        e.trovaMinMax();

        String output = outContent.toString();
        assertTrue(output.contains("Minimo: 3"));
        assertTrue(output.contains("Massimo: 22"));
    }
}
