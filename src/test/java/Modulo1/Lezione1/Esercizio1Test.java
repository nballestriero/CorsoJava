
package Modulo1.Lezione1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;


public class Esercizio1Test {
    
    
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
    public void testStampaVariabili() {
        Esercizio1 tp = new Esercizio1();
        tp.stampaVariabili();
        String expected = "Studenti: 25" + System.lineSeparator()
                        + "Media: 7.8" + System.lineSeparator()
                        + "Promosso: true" + System.lineSeparator()
                        + "Voto: B" + System.lineSeparator()
                        + "Eta: 17" + System.lineSeparator()
                        + "Altezza: 1.75"+ System.lineSeparator();
        
        assertEquals(expected, output.toString());
    }
        
}
