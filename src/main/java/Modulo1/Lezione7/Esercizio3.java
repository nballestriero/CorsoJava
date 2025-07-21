package Modulo1.Lezione7;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio3 {
    public void stampaPari() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();

        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            numeri[i] = input.nextInt();
        }

        for (int num : numeri) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}