package Modulo1.Lezione3;

import java.util.Scanner;
/**
 *
 * @author Nicolo
 */
public class Esercizio4 {
    
    public void controlla() {
        Scanner input = new Scanner(System.in);
        int eta = input.nextInt();

        if (eta < 0 || eta > 120) {
            System.out.println("Età non valida");
        } else {
            System.out.println("Età accettata");
        }
    }
}