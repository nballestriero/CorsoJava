package Modulo1.Lezione6;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio1Test {
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
    void testStampaValori() {
        String input = "3\n10\n20\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Esercizio1 e = new Esercizio1();
        e.stampaValori();

        String output = outContent.toString();
        assertTrue(output.contains("10"));
        assertTrue(output.contains("20"));
        assertTrue(output.contains("30"));
    }
}

