package Modulo1.Lezione5;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio3Test {

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void Esercizio3() {
        String inputSimulato = "4\n1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio3 np = new Esercizio3();
        np.filtraPari();
        String output = outContent.toString();
        assertTrue(output.contains("2"));
        assertTrue(output.contains("4"));
        assertFalse(output.contains("1"));
    }
}
