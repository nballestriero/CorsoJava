package Modulo1.Lezione1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio3Test {
    @Test
    void testDivisione() {
        Esercizio3 e3 = new Esercizio3();
        double risultato = e3.divisioneInteraEReale();
        assertEquals(3.3333, risultato, 0.0001);
    }
}