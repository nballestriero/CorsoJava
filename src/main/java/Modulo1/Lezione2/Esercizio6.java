package Modulo1.Lezione2;
/**
 *
 * @author Nicolo
 */
import java.util.Scanner;

public class Esercizio6 {
    public void verificaRisposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Il sole è una stella? (true/false)");
        boolean risposta = scanner.nextBoolean();

        if (risposta) {
            System.out.println("Risposta corretta");
        } else {
            System.out.println("Risposta sbagliata");
        }
    }
}