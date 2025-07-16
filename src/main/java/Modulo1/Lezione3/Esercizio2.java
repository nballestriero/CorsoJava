/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo1.Lezione3;

import java.util.Scanner;

/**
 *
 * @author Nicolo
 */
public class Esercizio2 {
    
    public void confronta() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Il maggiore è: " + a);
        } else if (b > a) {
            System.out.println("Il maggiore è: " + b);
        } else {
            System.out.println("I numeri sono uguali");
        }
    }
}