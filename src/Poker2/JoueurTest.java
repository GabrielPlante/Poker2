package Poker2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class JoueurTest {
    private Joueur creer_joueur(ArrayList<Integer> liste_nbr, ArrayList<String> liste_col){
        ArrayList<Carte> liste_carte = new ArrayList<>();
        for (int i = 0; i!= 5; ++i)
            liste_carte.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return new Joueur(liste_carte);
    }
    private ArrayList<Integer> liste_nbr_j1 = new ArrayList<>(Arrays.asList(2, 9, 4, 5, 6));
    private ArrayList<String> liste_col_j1 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
    private Joueur joueur1 = creer_joueur(liste_nbr_j1, liste_col_j1);

    private ArrayList<Integer> liste_nbr_j2 = new ArrayList<>(Arrays.asList(3, 3, 7, 8, 10));
    private ArrayList<String> liste_col_j2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
    private Joueur joueur2 = creer_joueur(liste_nbr_j2, liste_col_j2);

    private ArrayList<Integer> liste_nbr_j3 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
    private ArrayList<String> liste_col_j3 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
    private Joueur joueur3 = creer_joueur(liste_nbr_j3, liste_col_j3);

    @Test
    public void valeur_main() {
        ValeurMain v1 = new ValeurMain(1, 9, 6, 5, 4, 2);
        //TODO
    }

    @Test
    public void paire() {
        assertEquals(joueur1.paire(), 0);
        assertEquals(joueur2.paire(), 3);
        assertEquals(joueur3.paire(), 13);
    }

    @Test
    public void nieme_phc() {
        assertEquals(joueur1.nieme_phc(1), 9);
        assertEquals(joueur1.nieme_phc(2), 6);
        assertEquals(joueur1.nieme_phc(3), 5);
        assertEquals(joueur1.nieme_phc(4), 4);
        assertEquals(joueur1.nieme_phc(5), 2);
        assertEquals(joueur2.nieme_phc(4), 3);
        assertEquals(joueur3.nieme_phc(2), 13);
    }
}