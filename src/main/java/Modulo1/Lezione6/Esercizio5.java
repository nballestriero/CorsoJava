package Modulo1.Lezione6;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio5 {
    public void trovaMinMax() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();

        int[] numeri = new int[n];
        int i = 0;
        do {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < n);

        int min = numeri[0];
        int max = numeri[0];

        for (int valore : numeri) {
            if (valore < min) min = valore;
            if (valore > max) max = valore;
        }

        System.out.println("Minimo: " + min);
        System.out.println("Massimo: " + max);
    }
}
