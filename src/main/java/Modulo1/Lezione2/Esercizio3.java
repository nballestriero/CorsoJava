package Modulo1.Lezione2;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio3 {
    public void verifica() {
        Scanner scanner = new Scanner(System.in);
        int eta = scanner.nextInt();
        if (eta >= 18) {
            System.out.println("Sei maggiorenne");
        } else {
            System.out.println("Sei minorenne");
        }
    }
}