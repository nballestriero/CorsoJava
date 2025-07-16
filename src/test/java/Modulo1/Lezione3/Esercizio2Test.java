package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio2Test {

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
    void testMaggiore() {
        System.setIn(new ByteArrayInputStream("7\n5\n".getBytes()));
        new Esercizio2().confronta();
        Assertions.assertTrue(outContent.toString().contains("Il maggiore è: 7"));
    }

    @Test
    void testUguali() {
        System.setIn(new ByteArrayInputStream("4\n4\n".getBytes()));
        new Esercizio2().confronta();
        Assertions.assertTrue(outContent.toString().contains("I numeri sono uguali"));
    }
}

