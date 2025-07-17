package Modulo1.Lezione4;

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

    @BeforeEach void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test void testAccesso() {
        System.setIn(new ByteArrayInputStream("pippo\nadmin123\n".getBytes()));
        new Esercizio2().accedi();
        Assertions.assertTrue(outContent.toString().contains("Accesso riuscito"));
    }
}

