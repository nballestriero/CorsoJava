package Modulo1.Lezione8;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio2 {
    public void mediaNumeri() {
        Scanner input = new Scanner(System.in);
        int somma = 0;
        int count = 0;
        String risposta = "s";

        while (risposta.equalsIgnoreCase("s")) {
            System.out.print("Inserisci un numero: ");
            int numero = input.nextInt();
            somma += numero;
            count++;

            System.out.print("Vuoi continuare? (s/n): ");
            risposta = input.next();
        }

        if (count > 0) {
            double media = (double) somma / count;
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nessun numero inserito.");
        }
    }
}
