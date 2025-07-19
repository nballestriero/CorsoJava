package Modulo1.Lezione6;
import java.util.Scanner;
/**
 *
 * @author Nicolo
 */

public class Esercizio1 {
    
    public void stampaValori() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();

        int[] numeri = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < n);

        System.out.println("Hai inserito:");
        for (int valore : numeri) {
            System.out.println(valore);
        }
    }
}
