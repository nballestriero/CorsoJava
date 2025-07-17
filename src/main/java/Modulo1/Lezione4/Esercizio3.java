package Modulo1.Lezione4;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio3 {

    public void valida() {
        Scanner input = new Scanner(System.in);
        int eta;
        do {
            System.out.print("Inserisci la tua età: ");
            eta = input.nextInt();
            if (eta < 0 || eta > 120) {
                System.out.println("Età non valida. Riprova.");
            }
        } while (eta < 0 || eta > 120);
        System.out.println("Età valida: " + eta);
    }
}