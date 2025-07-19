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

public class Esercizio2 {
    
    public void calcolaSomma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti voti vuoi inserire? ");
        int n = input.nextInt();
        int[] voti = new int[n];
        int somma = 0;
        int i = 0;
        do {
            System.out.print("Inserisci voto (0-10): ");
            int voto = input.nextInt();
            if (voto >= 0 && voto <= 10) {
                voti[i] = voto;
                somma += voto;
                i++;
            } else {
                System.out.println("Voto non valido.");
            }
        } while (i < n);
        System.out.println("Somma: " + somma);
    }
}