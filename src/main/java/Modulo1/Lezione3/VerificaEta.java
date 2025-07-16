
package Modulo1.Lezione3;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */


public class VerificaEta {
    public void controllaEta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();

        if (eta >= 18) {
            System.out.println("Accesso consentito");
        } else {
            System.out.println("Accesso negato");
        }
    }
}