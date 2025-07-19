package Modulo1.Lezione5;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio4 {
    
    public void calcolaMedia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti valori vuoi inserire? ");
        int n = input.nextInt();
        double[] valori = new double[n];
        double somma = 0;
        int i = 0;
        do {
            System.out.print("Inserisci valore: ");
            valori[i] = input.nextDouble();
            somma += valori[i];
            i++;
        } while (i < n);
        double media = somma / n;
        System.out.println("Media: " + media);
    }
}
