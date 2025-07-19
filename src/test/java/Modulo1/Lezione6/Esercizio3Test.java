package Modulo1.Lezione6;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio3Test {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testContaMaggioriDiDieci() {
        String input = "4\n5\n12\n8\n15\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Esercizio3 e = new Esercizio3();
        e.contaMaggioriDiDieci();

        String output = outContent.toString();
        assertTrue(output.contains("Numeri maggiori di 10: 2"));
    }
}