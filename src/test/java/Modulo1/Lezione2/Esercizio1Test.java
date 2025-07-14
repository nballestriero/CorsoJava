package Modulo1.Lezione2;

/**
 *
 * @author Nicolo
 */
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Esercizio1Test {
    @Test
    public void testSalutaUtente() {
        String input = "Luca\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio1().salutaUtente();

        assertEquals("Ciao, Luca!" + System.lineSeparator(), out.toString());
    }
}