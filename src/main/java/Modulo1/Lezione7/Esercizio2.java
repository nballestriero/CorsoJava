package Modulo1.Lezione7;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio2 {
    public void leggiPositivo() {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Inserisci un numero positivo: ");
            numero = input.nextInt();
        } while (numero <= 0);

        System.out.println("Hai inserito: " + numero);
    }
}