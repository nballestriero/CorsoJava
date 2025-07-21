package Modulo1.Lezione7;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio4 {
    public void indiceMassimo() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            numeri[i] = input.nextInt();
        }

        int max = numeri[0];
        int indice = 0;
        for (int i = 1; i < n; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
                indice = i;
            }
        }

        System.out.println("Indice massimo: " + indice);
    }
}