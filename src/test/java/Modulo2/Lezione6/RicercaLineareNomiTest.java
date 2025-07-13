
package Modulo2.Lezione6;

import Modulo2.Lezione6.RicercaLineareNomi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test per la classe RicercaLineareNomi.
 */
public class RicercaLineareNomiTest {

    /**
     * Verifica che il nome venga trovato all'inizio dell'array.
     */
    @Test
    public void testNomeInizio() {
        String[] nomi = {"Anna", "Luca", "Marco"};
        assertEquals(0, RicercaLineareNomi.cerca(nomi, "Anna"));
    }

    /**
     * Verifica che il nome venga trovato in mezzo all'array.
     */
    @Test
    public void testNomeInMezzo() {
        String[] nomi = {"Anna", "Luca", "Marco"};
        assertEquals(1, RicercaLineareNomi.cerca(nomi, "Luca"));
    }

    /**
     * Verifica che il nome non venga trovato se non presente.
     */
    @Test
    public void testNomeNonPresente() {
        String[] nomi = {"Anna", "Luca", "Marco"};
        assertEquals(-1, RicercaLineareNomi.cerca(nomi, "Giulia"));
    }

    /**
     * Verifica il comportamento con array vuoto.
     */
    @Test
    public void testArrayVuoto() {
        String[] nomi = {};
        assertEquals(-1, RicercaLineareNomi.cerca(nomi, "Anna"));
    }
} 