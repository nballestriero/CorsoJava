package Modulo1.Lezione3;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio3 {
    
    public void valuta() {
        Scanner input = new Scanner(System.in);
        int voto = input.nextInt();

        if (voto >= 9) {
            System.out.println("Ottimo");
        } else if (voto >= 6) {
            System.out.println("Sufficiente");
        } else {
            System.out.println("Insufficiente");
        }
    }
}
