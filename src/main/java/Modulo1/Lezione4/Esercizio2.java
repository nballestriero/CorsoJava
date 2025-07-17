package Modulo1.Lezione4;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio2 {

    public void accedi() {
        Scanner input = new Scanner(System.in);
        String pwd;
        do {
            System.out.print("Inserisci password: ");
            pwd = input.nextLine();
            if (!pwd.equals("admin123")) {
                System.out.println("Password errata. Riprova.");
            }
        } while (!pwd.equals("admin123"));
        System.out.println("Accesso riuscito");
    }
}