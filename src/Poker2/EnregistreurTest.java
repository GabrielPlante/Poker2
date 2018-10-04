package Poker2;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EnregistreurTest {

    @org.junit.Test
    public void convertisseurIndice() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);

        assertEquals(paquet.convertisseurIndice("4"),3);
        assertEquals(paquet.convertisseurIndice("D"), 11);
        assertEquals(paquet.convertisseurIndice("Z"), 0);
    }

    @org.junit.Test
    public void checkDoublons() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);
        assertEquals(paquet.checkDoublons(new Carte(4, "Pi")), true);
        assertEquals(paquet.checkDoublons(new Carte(15, "Pi")), false);
    }
}