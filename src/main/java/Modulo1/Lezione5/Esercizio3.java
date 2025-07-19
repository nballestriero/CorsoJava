package Modulo1.Lezione5;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */



public class Esercizio3 {
    public void filtraPari() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();
        int[] numeri = new int[n];
        int i = 0;
        do {
            System.out.print("Inserisci numero: ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < n);

        System.out.println("Numeri pari:");
        i = 0;
        do {
            if (numeri[i] % 2 == 0) {
                System.out.println(numeri[i]);
            }
            i++;
        } while (i < n);
    }
}