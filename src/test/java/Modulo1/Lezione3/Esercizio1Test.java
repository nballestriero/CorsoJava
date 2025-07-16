package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;
/**
 *
 * @author user
 */


public class Esercizio1Test {
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
    void testPositivo() {
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        new Esercizio1().verifica();
        Assertions.assertTrue(outContent.toString().contains("Positivo"));
    }

    @Test
    void testNegativo() {
        System.setIn(new ByteArrayInputStream("-3\n".getBytes()));
        new Esercizio1().verifica();
        Assertions.assertTrue(outContent.toString().contains("Negativo"));
    }

    @Test
    void testZero() {
        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        new Esercizio1().verifica();
        Assertions.assertTrue(outContent.toString().contains("Zero"));
    }
}
