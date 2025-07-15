package Modulo1.Lezione2;
import java.util.Scanner;
/**
 *
 * @author Nicolo
 */

public class Esercizio4 {
    public void leggiStudente() {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        String classe = scanner.nextLine();
        double media = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Media: " + media);
    }
}