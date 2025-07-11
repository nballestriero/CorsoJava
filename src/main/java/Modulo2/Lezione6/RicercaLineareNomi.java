
package Modulo2.Lezione6;

/**
 * Classe per effettuare una ricerca lineare in un array di stringhe.
 */
public class RicercaLineareNomi {

    /**
     * Metodo che esegue la ricerca lineare di un nome nell'array.
     * @param nomi Array di nomi.
     * @param target Nome da cercare.
     * @return L'indice del nome se trovato, altrimenti -1.
     */
    public static int cerca(String[] nomi, String target) {
        if (nomi == null || nomi.length == 0) return -1;

        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }
} 