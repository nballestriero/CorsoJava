package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio3Test {
    
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testOttimo() {
        System.setIn(new ByteArrayInputStream("10\n".getBytes()));
        new Esercizio3().valuta();
        Assertions.assertTrue(outContent.toString().contains("Ottimo"));
    }

    @Test
    void testSufficiente() {
        System.setIn(new ByteArrayInputStream("6\n".getBytes()));
        new Esercizio3().valuta();
        Assertions.assertTrue(outContent.toString().contains("Sufficiente"));
    }

    @Test
    void testInsufficiente() {
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        new Esercizio3().valuta();
        Assertions.assertTrue(outContent.toString().contains("Insufficiente"));
    }
}
