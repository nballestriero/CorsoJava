/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.Lezione7;

/**
 * Classe generica per effettuare la ricerca lineare su un array di tipo T.
 * 
 * @param <T> il tipo degli elementi dell'array
 */
public class RicercaLineareGenerica<T> {

    /**
     * Ricerca un elemento all'interno di un array usando la ricerca lineare.
     *
     * @param array l'array di elementi di tipo T
     * @param target l'elemento da cercare
     * @return l'indice del primo elemento corrispondente a target oppure -1 se non trovato o se l'array è nullo
     */
    public int cerca(T[] array, T target) {
        if (array == null || array.length == 0 || target == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (target.equals(array[i])) {
                return i;
            }
        }

        return -1; // Elemento non trovato
    }
}