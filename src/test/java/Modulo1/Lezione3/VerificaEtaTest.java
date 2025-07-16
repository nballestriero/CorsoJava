
package Modulo1.Lezione3;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class VerificaEtaTest {
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
    void testAccessoConsentito() {
        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new VerificaEta().controllaEta();

        String output = outContent.toString();
        assertTrue(output.contains("Accesso consentito"));
    }

    @Test
    void testAccessoNegato() {
        String input = "15\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new VerificaEta().controllaEta();

        String output = outContent.toString();
        assertTrue(output.contains("Accesso negato"));
    }
}
