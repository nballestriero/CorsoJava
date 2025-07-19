package Modulo1.Lezione6;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio3 {
    public void contaMaggioriDiDieci() {
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

        int conta = 0;
        for (int valore : numeri) {
            if (valore > 10) {
                conta++;
            }
        }

        System.out.println("Numeri maggiori di 10: " + conta);
    }
}