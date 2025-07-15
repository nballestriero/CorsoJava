
package Modulo1.Lezione1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolo
 */

class Esercizio5Test {
    @Test
    void testStampaLimiti() {
        String out = new Esercizio5().stampaLimiti();
        assertTrue(out.contains("Byte max: 127"));
        assertTrue(out.contains("Float max: ")); // non testiamo il numero preciso, troppo lungo
    }
}