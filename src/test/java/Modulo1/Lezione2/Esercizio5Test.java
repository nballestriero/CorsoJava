/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modulo1.Lezione2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Nicolo
 */


public class Esercizio5Test {
    @Test
    public void testInverti() {
        String input = "ciao\nmondo\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Esercizio5().inverti();

        String output = out.toString();
        assertTrue(output.contains("Seconda parola: mondo"));
        assertTrue(output.contains("Prima parola: ciao"));
    }
}