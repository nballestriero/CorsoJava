package Modulo1.Lezione6;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio2 {
    public void somma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi sommare? ");
        int n = input.nextInt();

        int[] numeri = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < n);

        int somma = 0;
        for (int valore : numeri) {
            somma += valore;
        }

        System.out.println("La somma è: " + somma);
    }
}