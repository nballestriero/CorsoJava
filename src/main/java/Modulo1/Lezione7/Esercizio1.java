package Modulo1.Lezione7;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio1 {
    public void sommaNumeri() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = input.nextInt();

        int somma = 0;
        for (int i = 1; i <= n; i++) {
            somma += i;
        }

        System.out.println("Somma: " + somma);
    }
}
