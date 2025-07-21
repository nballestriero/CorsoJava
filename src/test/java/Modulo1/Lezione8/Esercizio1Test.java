package Modulo1.Lezione8;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio1Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testContaNumeriPositivi() {
        String inputSimulato = "3\n5\n0\n-1\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));

        Esercizio1 es = new Esercizio1();
        es.contaNumeriPositivi();

        String risultato = output.toString();
        Assertions.assertTrue(risultato.contains("Numeri positivi inseriti: 3"));
    }
}