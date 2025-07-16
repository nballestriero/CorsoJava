package Modulo1.Lezione3;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio5 {
    
    public void verifica() {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Pari");
        } else {
            System.out.println("Dispari");
        }
    }
}

