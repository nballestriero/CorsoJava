package Modulo1.Lezione4;

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

    @BeforeEach void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test void testRispostaTrue() {
        System.setIn(new ByteArrayInputStream("boh\nTRUE\n".getBytes()));
        new Esercizio5().leggiRisposta();
        Assertions.assertTrue(outContent.toString().contains("Risposta registrata: true"));
    }
}
