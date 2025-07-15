package Modulo1.Lezione1;

/**
 *
 * @author Nicolo
 */
public class Esercizio2 {
    public String conversioni() {
        int a = 100;
        double b = a;
        int c = (int) b;
        double d = 9.75;
        int e = (int) d;
        byte f = (byte) 130;

        return "a: " + a + "\n" +
               "b: " + b + "\n" +
               "c: " + c + "\n" +
               "d: " + d + "\n" +
               "e: " + e + "\n" +
               "f: " + f + "\n";
    }
}
