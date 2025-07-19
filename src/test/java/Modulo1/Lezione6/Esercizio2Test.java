package Modulo1.Lezione6;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio2Test {
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
    void testSomma() {
        String input = "3\n4\n5\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Esercizio2 e = new Esercizio2();
        e.somma();

        String output = outContent.toString();
        assertTrue(output.contains("La somma è: 12"));
    }
}
