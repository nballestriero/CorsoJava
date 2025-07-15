package Modulo1.Lezione2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author Nicolo
 */


public class Esercizio3Test {
    @Test
    public void testMinorenne() {
        String input = "17\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio3().verifica();

        assertEquals("Sei minorenne" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testMaggiorenne() {
        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio3().verifica();

        assertEquals("Sei maggiorenne" + System.lineSeparator(), out.toString());
    }
}
