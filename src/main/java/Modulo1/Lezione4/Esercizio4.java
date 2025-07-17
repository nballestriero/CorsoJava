/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo1.Lezione4;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio4 {
    
    public void seleziona() {
        Scanner input = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("1. Gioca  2. Impostazioni  3. Esci");
            System.out.print("Scegli: ");
            scelta = input.nextInt();
            if (scelta < 1 || scelta > 3) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta < 1 || scelta > 3);

        String voce = switch (scelta) {
            case 1 -> "Gioca";
            case 2 -> "Impostazioni";
            case 3 -> "Esci";
            default -> "";
        };
        System.out.println("Hai scelto: " + voce);
    }
}