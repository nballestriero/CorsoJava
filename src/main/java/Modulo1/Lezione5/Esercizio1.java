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


public class Esercizio1 {
    public void acquisisci() {
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[5];
        int i = 0;
        do {
            System.out.print("Inserisci numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
            i++;
        } while (i < 5);

        System.out.println("Hai inserito:");
        i = 0;
        do {
            System.out.println(numeri[i]);
            i++;
        } while (i < 5);
    }
}
