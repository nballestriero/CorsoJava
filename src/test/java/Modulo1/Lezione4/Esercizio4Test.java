package Modulo1.Lezione4;

import org.junit.jupiter.api.*;
import java.io.*;

/**
 *
 * @author Nicolo
 */

public class Esercizio4Test {
    
public class MenuSceltaTest {
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

    @Test void testSceltaMenu() {
        System.setIn(new ByteArrayInputStream("9\n0\n2\n".getBytes()));
        new Esercizio4().seleziona();
        Assertions.assertTrue(outContent.toString().contains("Hai scelto: Impostazioni"));
    }
}
}
