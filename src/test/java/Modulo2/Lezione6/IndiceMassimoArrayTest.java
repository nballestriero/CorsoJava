/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modulo2.Lezione6;
import Modulo2.Lezione6.IndiceMassimoArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test per la classe IndiceMassimoArray.
 */
public class IndiceMassimoArrayTest {

    /**
     * Verifica l'indice corretto quando il massimo è in mezzo.
     */
    @Test
    public void testMassimoInMezzo() {
        int[] array = {2, 10, 5};
        assertEquals(1, IndiceMassimoArray.trovaIndiceMassimo(array));
    }

    /**
     * Verifica il comportamento con array decrescente.
     */
    @Test
    public void testMassimoInizio() {
        int[] array = {10, 5, 2};
        assertEquals(0, IndiceMassimoArray.trovaIndiceMassimo(array));
    }

    /**
     * Verifica il comportamento con valori uguali.
     */
    @Test
    public void testTuttiUguali() {
        int[] array = {7, 7, 7};
        assertEquals(0, IndiceMassimoArray.trovaIndiceMassimo(array));
    }

    /**
     * Verifica il comportamento con array vuoto.
     */
    @Test
    public void testArrayVuoto() {
        int[] array = {};
        assertEquals(-1, IndiceMassimoArray.trovaIndiceMassimo(array));
    }
} 