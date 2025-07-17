package Modulo1.Lezione4;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio5 {

    public void leggiRisposta() {
        Scanner input = new Scanner(System.in);
        boolean rispostaValida = false;
        boolean risposta = false;

        do {
            System.out.print("Sei d’accordo? (true/false): ");
            String valore = input.nextLine();
            if (valore.equalsIgnoreCase("true") || valore.equalsIgnoreCase("false")) {
                risposta = Boolean.parseBoolean(valore);
                rispostaValida = true;
            } else {
                System.out.println("Input non valido. Inserisci 'true' o 'false'.");
            }
        } while (!rispostaValida);

        System.out.println("Risposta registrata: " + risposta);
    }
}
