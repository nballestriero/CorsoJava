/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo1.Lezione5;
import java.util.Scanner;

/**
 *
 * @author Nicolo
 */

public class Esercizio6 {
    
    public void leggiRisposte() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quante domande? ");
        int n = input.nextInt();
        boolean[] risposte = new boolean[n];
        int i = 0;
        do {
            System.out.print("Risposta alla domanda " + (i + 1) + " (true/false): ");
            risposte[i] = input.nextBoolean();
            i++;
        } while (i < n);

        System.out.println("Riepilogo risposte:");
        i = 0;
        do {
            System.out.println("Domanda " + (i + 1) + ": " + risposte[i]);
            i++;
        } while (i < n);
    }
}
