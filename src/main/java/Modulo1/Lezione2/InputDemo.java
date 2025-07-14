package Modulo1.Lezione2;

/**
 *
 * @author Nicolo
 */
import java.util.Scanner;

public class InputDemo {
    public void leggiDati() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();

        System.out.print("Inserisci la tua media scolastica: ");
        double media = input.nextDouble();

        input.nextLine(); // consuma il newline

        System.out.print("Sei promosso? (true/false): ");
        boolean promosso = input.nextBoolean();

        System.out.println("\nRiepilogo:");
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("Media: " + media);
        System.out.println("Promosso: " + promosso);

        input.close();
    }
}
