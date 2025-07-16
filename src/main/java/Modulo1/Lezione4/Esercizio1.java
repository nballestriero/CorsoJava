package Modulo1.Lezione4;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio1 {
    
    public void richiedi() {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Inserisci un numero maggiore di zero: ");
            numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("Numero non valido. Riprova.");
            }
        } while (numero <= 0);
        System.out.println("Hai inserito: " + numero);
    }
}