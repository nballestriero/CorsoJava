package Modulo1.Lezione3;

/**
 *
 * @author Nicolo
 */

import java.util.Scanner;

public class Esercizio1 {
    public void verifica() {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}