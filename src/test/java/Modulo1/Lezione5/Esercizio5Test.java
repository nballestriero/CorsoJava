package Modulo1.Lezione5;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio5Test {
    
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testVerifica() {
        String inputSimulato = "3\n101\n90\n-5\n80\n70\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio5 pv = new Esercizio5();
        pv.verifica();
        String output = outContent.toString();
        assertTrue(output.contains("Punteggi inseriti:"));
        assertTrue(output.contains("90"));
        assertTrue(output.contains("80"));
        assertTrue(output.contains("70"));
        assertFalse(output.contains("101"));
        assertFalse(output.contains("-5"));
    }
}
