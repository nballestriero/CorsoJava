package Modulo1.Lezione5;
import java.util.Scanner;
/**
 *
 * @author Nicolo
 */

public class LetturaArray {
    public void esegui() {
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
        i = 0;
        do {
            System.out.println(numeri[i]);
            i++;
        } while (i < n);
    }
}