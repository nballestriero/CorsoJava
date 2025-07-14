
package Modulo1.Lezione5;
/**
 *
 * @author Nicolo
 */

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class LetturaArrayTest {

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
    void testEseguiConInputValido() {
        String simulatedInput = "3\n10\n20\n30";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        LetturaArray programma = new LetturaArray();
        programma.esegui();

        String output = outContent.toString();
        assertTrue(output.contains("Hai inserito:"));
        assertTrue(output.contains("10"));
        assertTrue(output.contains("20"));
        assertTrue(output.contains("30"));
    }
}
