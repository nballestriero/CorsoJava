package Modulo1.Lezione8;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio1 {
    public void contaNumeriPositivi() {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.print("Inserisci un numero (negativo per terminare): ");
        int numero = input.nextInt();

        while (numero >= 0) {
            count++;
            System.out.print("Inserisci un numero (negativo per terminare): ");
            numero = input.nextInt();
        }

        System.out.println("Numeri positivi inseriti: " + count);
    }
}

