package Modulo1.Lezione7;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio5 {
    public void convalidaArray() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] valori = new int[n];

        for (int i = 0; i < n; i++) {
            int numero;
            do {
                numero = input.nextInt();
            } while (numero > 0);
            valori[i] = numero;
        }

        for (int v : valori) {
            if (v < 0) {
                System.out.println(v);
            }
        }
    }
}