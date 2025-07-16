package Modulo1.Lezione3;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio6 {
    
    public void login() {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        if (password.equals("JavaRocks")) {
            System.out.println("Accesso riuscito");
        } else {
            System.out.println("Accesso negato");
        }
    }
}

