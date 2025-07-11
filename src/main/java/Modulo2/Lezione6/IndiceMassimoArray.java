
package Modulo2.Lezione6;

/**
 * Classe per trovare l'indice del massimo elemento in un array di interi.
 */
public class IndiceMassimoArray {

    /**
     * Metodo che restituisce l'indice del valore massimo nell'array.
     * @param array Array di interi.
     * @return Indice del massimo valore, -1 se l'array è vuoto o nullo.
     */
    public static int trovaIndiceMassimo(int[] array) {
        if (array == null || array.length == 0) return -1;

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}