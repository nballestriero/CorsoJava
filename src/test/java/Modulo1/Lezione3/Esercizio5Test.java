package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio5Test {

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
    void testPari() {
        System.setIn(new ByteArrayInputStream("8\n".getBytes()));
        new Esercizio5().verifica();
        Assertions.assertTrue(outContent.toString().contains("Pari"));
    }

    @Test
    void testDispari() {
        System.setIn(new ByteArrayInputStream("3\n".getBytes()));
        new Esercizio5().verifica();
        Assertions.assertTrue(outContent.toString().contains("Dispari"));
    }
}