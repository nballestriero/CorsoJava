package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */
 
public class Esercizio4Test {
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
    void testEtaAccettata() {
        System.setIn(new ByteArrayInputStream("25\n".getBytes()));
        new Esercizio4().controlla();
        Assertions.assertTrue(outContent.toString().contains("Età accettata"));
    }

    @Test
    void testEtaNonValida() {
        System.setIn(new ByteArrayInputStream("-1\n".getBytes()));
        new Esercizio4().controlla();
        Assertions.assertTrue(outContent.toString().contains("Età non valida"));
    }
}
