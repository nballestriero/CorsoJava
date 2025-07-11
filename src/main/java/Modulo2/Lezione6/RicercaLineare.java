package Modulo2.Lezione6;

/**
 * Classe che implementa la ricerca lineare su un array di interi.
 */
public class RicercaLineare {

    /**
     * Esegue una ricerca lineare dell'elemento target all'interno dell'array.
     *
     * @param array  L'array di interi in cui cercare
     * @param target Il valore da cercare
     * @return L'indice dell'elemento se trovato, -1 altrimenti
     */
    public static int cerca(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            // Confronta ogni elemento con il target
            if (array[i] == target) {
                return i; // trovato
            }
        }
        return -1; // non trovato
    }
}
