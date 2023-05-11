//Név: Róth József
//Csoport: I/1/N
//Dátum: 2023.05.11.

import org.junit.jupiter.api.Test;

public class KiszamolTeszt {
    @Test
    public void testTerfogatSzamol() {

        System.out.println("Név: Róth Jószef");
        System.out.println("Csoport: SZOFT I/1/N");
        System.out.println("Dátum: 2023.05.11.");

        double hossz = 2.5;
        double szelesseg = 3.0;
        double magassag = 4.5;
        double itelTerfogat = 30.375;

        double tenylegesTerfogat = terfogatSzamol(hossz, szelesseg, magassag);

        assertEquals(itelTerfogat, tenylegesTerfogat, 0.001);
    }

    private double terfogatSzamol(double hossz, double szelesseg, double magassag) {
        return hossz * szelesseg * magassag;
    }

    @Test
    public void testBemenetEllenorzo() {
        double hossz = 2.5;
        double szelesseg = 3.0;
        double magassag = 4.5;

        assertTrue(BemenetEllenorzo.testInput(hossz, szelesseg, magassag));
    }

    private void assertTrue(boolean feltetel) {
        assertTrue(feltetel);
    }

    private void assertEquals(double itel, double tenyleges, double delta) {
        assertEquals(itel, tenyleges, delta);
    }
}