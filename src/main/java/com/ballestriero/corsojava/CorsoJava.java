/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ballestriero.corsojava;
import Modulo2.Lezione6.RicercaLineare;

/**
 *
 * @author user
 */
public class CorsoJava {

    public static void main(String[] args) {
      int [] array = {1,2,3,4};
      int result;
      RicercaLineare cerca = new RicercaLineare();
      result = cerca.cerca(array,2);
      System.out.println(result);
    }
}
