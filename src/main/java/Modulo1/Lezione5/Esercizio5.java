package Modulo1.Lezione5;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio5 {
    
    public void verifica() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti punteggi vuoi inserire? ");
        int n = input.nextInt();
        int[] punteggi = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci punteggio (0-100): ");
            int p = input.nextInt();
            if (p >= 0 && p <= 100) {
                punteggi[i] = p;
                i++;
            } else {
                System.out.println("Punteggio non valido.");
            }
        } while (i < n);
        System.out.println("Punteggi inseriti:");
        for (int j = 0; j < n; j++) {
            System.out.println(punteggi[j]);
        }
    }
}