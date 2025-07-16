package Modulo1.Lezione3;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio6Test {
    
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
    void testPasswordCorretta() {
        System.setIn(new ByteArrayInputStream("JavaRocks\n".getBytes()));
        new Esercizio6().login();
        Assertions.assertTrue(outContent.toString().contains("Accesso riuscito"));
    }

    @Test
    void testPasswordSbagliata() {
        System.setIn(new ByteArrayInputStream("Ciao123\n".getBytes()));
        new Esercizio6().login();
        Assertions.assertTrue(outContent.toString().contains("Accesso negato"));
    }
}
