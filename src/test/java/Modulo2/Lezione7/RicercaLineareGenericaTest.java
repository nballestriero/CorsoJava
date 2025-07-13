/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modulo2.Lezione7;

import Modulo2.Lezione7.RicercaLineareGenerica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe di test per RicercaLineareGenerica<T>
 */
public class RicercaLineareGenericaTest {

    /**
     * Test con array di String.
     */
    @Test
    public void testRicercaStringhe() {
        RicercaLineareGenerica<String> ricerca = new RicercaLineareGenerica<>();
        String[] nomi = {"Luca", "Anna", "Marco", "Giulia"};

        assertEquals(0, ricerca.cerca(nomi, "Luca"));   // primo elemento
        assertEquals(3, ricerca.cerca(nomi, "Giulia")); // ultimo elemento
        assertEquals(-1, ricerca.cerca(nomi, "Paolo")); // elemento non presente
    }

    /**
     * Test con array di Integer.
     */
    @Test
    public void testRicercaNumeriInteri() {
        RicercaLineareGenerica<Integer> ricerca = new RicercaLineareGenerica<>();
        Integer[] numeri = {10, 20, 30, 40};

        assertEquals(2, ricerca.cerca(numeri, 30));
        assertEquals(-1, ricerca.cerca(numeri, 99));
    }

    /**
     * Test con oggetti di una classe personalizzata.
     */
    @Test
    public void testRicercaOggettiPersonalizzati() {
        RicercaLineareGenerica<Persona> ricerca = new RicercaLineareGenerica<>();
        Persona[] persone = {
            new Persona("Anna", 25),
            new Persona("Luca", 30),
            new Persona("Marco", 28)
        };

        assertEquals(1, ricerca.cerca(persone, new Persona("Luca", 30)));  // match completo su nome e età
        assertEquals(-1, ricerca.cerca(persone, new Persona("Luca", 31))); // stessa persona con età diversa
    }

    /**
     * Test su array vuoto e null.
     */
    @Test
    public void testRicercaArrayVuotoENull() {
        RicercaLineareGenerica<String> ricerca = new RicercaLineareGenerica<>();

        assertEquals(-1, ricerca.cerca(new String[]{}, "test"));
        assertEquals(-1, ricerca.cerca(null, "test"));
        assertEquals(-1, ricerca.cerca(new String[]{"a", "b"}, null));
    }

    // Classe interna di esempio
    private static class Persona {
        String nome;
        int eta;

        public Persona(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Persona persona = (Persona) obj;
            return eta == persona.eta && nome.equals(persona.nome);
        }

        @Override
        public int hashCode() {
            return nome.hashCode() + eta;
        }
    }
}
