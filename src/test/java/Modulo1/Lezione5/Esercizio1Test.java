package Modulo1.Lezione5;
/**
 *
 * @author Nicolo
 */

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

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
    void testAcquisisci() {
        String inputSimulato = "1\n2\n3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio1 c = new Esercizio1();
        c.acquisisci();
        String output = outContent.toString();
        assertTrue(output.contains("Hai inserito:"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("5"));
    }
}
