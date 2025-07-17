package Modulo1.Lezione4;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author user
 */
public class Esercizio3Test {
    
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

    @Test void testEtaValida() {
        System.setIn(new ByteArrayInputStream("-1\n130\n25\n".getBytes()));
        new Esercizio3().valida();
        Assertions.assertTrue(outContent.toString().contains("Età valida: 25"));
    }
}