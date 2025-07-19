package Modulo1.Lezione5;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio6Test {

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setup() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testLeggiRisposte() {
        String inputSimulato = "2\ntrue\nfalse\n";
        System.setIn(new ByteArrayInputStream(inputSimulato.getBytes()));
        Esercizio6 p = new Esercizio6();
        p.leggiRisposte();
        String output = outContent.toString();
        assertTrue(output.contains("Domanda 1: true"));
        assertTrue(output.contains("Domanda 2: false"));
    }
}

