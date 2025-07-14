package Modulo1.Lezione2;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */
public class Esercizio1 {
    public void salutaUtente() {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Ciao, " + nome + "!");
    }
}

