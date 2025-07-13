
package Modulo1.Lezione1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class TipiPrimitiviTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testStampa() {
        TipiPrimitivi tp = new TipiPrimitivi();
        tp.stampa();
        // Windows va a capo con \r\n Linux \n
        String expected = "Eta: 16" + System.lineSeparator()
                        + "Studenti: 20" + System.lineSeparator()
                        + "Media: 7.5" + System.lineSeparator()
                        + "Iniziale: J" + System.lineSeparator()
                        + "Promosso: true" + System.lineSeparator();

        assertEquals(expected, output.toString());
    }
}