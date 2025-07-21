package Modulo1.Lezione8;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio2Test {
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
    void testMediaNumeri() {
        String inputSimulato = "6\ns\n8\ns\n10\nn\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));

        Esercizio2 es = new Esercizio2();
        es.mediaNumeri();

        String risultato = output.toString();
        Assertions.assertTrue(risultato.contains("Media: 8.0"));
    }
}
