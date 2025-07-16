package Modulo1.Lezione4;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio1Test {
    
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test void testNumeroPositivo() {
        System.setIn(new ByteArrayInputStream("-3\n0\n7\n".getBytes()));
        new Esercizio1().richiedi();
        String output = outContent.toString();
        Assertions.assertTrue(output.contains("Hai inserito: 7"));
    }
}