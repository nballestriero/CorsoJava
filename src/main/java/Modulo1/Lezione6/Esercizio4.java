package Modulo1.Lezione6;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */
    
public class Esercizio4 {
    public void calcolaMedia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti voti vuoi inserire? ");
        int n = input.nextInt();

        double[] voti = new double[n];
        int i = 0;
        do {
            System.out.print("Voto " + (i + 1) + ": ");
            voti[i] = input.nextDouble();
            i++;
        } while (i < n);

        double somma = 0;
        for (double v : voti) {
            somma += v;
        }

        double media = somma / n;
        System.out.println("Media: " + media);
    }
}
