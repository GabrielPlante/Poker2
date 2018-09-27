package Poker2;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EnregistreurTest {

    @org.junit.Test
    public void convertisseur_indice() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);

        assertEquals(paquet.convertisseur_indice("4"),3);
        assertEquals(paquet.convertisseur_indice("D"), 11);
        assertEquals(paquet.convertisseur_indice("Z"), 0);
    }

    @org.junit.Test
    public void check_doublons() {
        ArrayList<Carte> paquet1 = new ArrayList<>();
        for (int i = 0; i != 10; ++i)
            paquet1.add(new Carte(i+1, "Pi"));
        Enregistreur paquet = new Enregistreur(paquet1);
        assertEquals(paquet.check_doublons(new Carte(4, "Pi")), true);
        assertEquals(paquet.check_doublons(new Carte(15, "Pi")), false);
    }
}