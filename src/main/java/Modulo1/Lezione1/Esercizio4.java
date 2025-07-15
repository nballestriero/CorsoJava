package Modulo1.Lezione1;

/**
 *
 * @author Nicolo
 */

public class Esercizio4 {
    public String quiz() {
        byte a = 127;
        a++;
        boolean x = false;
        char c = 'A';

        return "a: " + a + "\n" +
               "!x: " + (!x) + "\n" +
               "(int)c: " + (int)c + "\n";
    }
}
