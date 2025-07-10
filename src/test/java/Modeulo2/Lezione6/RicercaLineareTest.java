import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe di test per la ricerca lineare.
 * Verifica diversi casi in cui l'algoritmo viene applicato a differenti array.
 */
public class RicercaLineareTest {

    /**
     * Test: verifica che la funzione restituisca l'indice corretto
     * quando il valore è presente all'interno dell'array.
     */
    @Test
    public void testElementoPresente() {
        int[] array = {5, 10, 15, 20, 25};
        int risultato = RicercaLineare.cerca(array, 15);
        assertEquals(2, risultato, "L'indice dovrebbe essere 2");
    }

    /**
     * Test: verifica che la funzione restituisca -1
     * quando il valore cercato non è presente nell'array.
     */
    @Test
    public void testElementoAssente() {
        int[] array = {1, 2, 3, 4, 5};
        int risultato = RicercaLineare.cerca(array, 10);
        assertEquals(-1, risultato, "L'elemento non è presente, dovrebbe restituire -1");
    }

    /**
     * Test: verifica il comportamento dell'algoritmo
     * quando l'array è vuoto.
     */
    @Test
    public void testArrayVuoto() {
        int[] array = {};
        int risultato = RicercaLineare.cerca(array, 5);
        assertEquals(-1, risultato, "Un array vuoto dovrebbe restituire -1");
    }

    /**
     * Test: verifica che venga restituito l'indice 0
     * quando l'elemento cercato si trova in prima posizione.
     */
    @Test
    public void testElementoInPrimaPosizione() {
        int[] array = {42, 13, 7, 5};
        int risultato = RicercaLineare.cerca(array, 42);
        assertEquals(0, risultato, "L'elemento si trova in posizione 0");
    }

    /**
     * Test: verifica che venga restituito l'indice corretto
     * quando l'elemento cercato è in ultima posizione.
     */
    @Test
    public void testElementoInUltimaPosizione() {
        int[] array = {2, 4, 6, 8, 10};
        int risultato = RicercaLineare.cerca(array, 10);
        assertEquals(4, risultato, "L'elemento si trova in ultima posizione");
    }
}