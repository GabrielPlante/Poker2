package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
    private ArrayList<Carte> build_kicker(ArrayList<Integer> liste_nbr, ArrayList<String> liste_col){
        ArrayList<Carte> kicker = new ArrayList<>();
        for (int i = 0; i<liste_nbr.size(); ++i)
            kicker.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return kicker;
    }

    private ArrayList<String> liste_col_j1;
    private Joueur joueur1;
    private ArrayList<Integer> liste_nbr_j2;
    private ArrayList<String> liste_col_j2;
    private Joueur joueur2;
    private ArrayList<Integer> liste_nbr_j3;
    private ArrayList<String> liste_col_j3;
    private Joueur joueur3;
    private ArrayList<Integer> liste_nbr_j4;
    private ArrayList<String> liste_col_j4;
    private Joueur joueur4;
    @Before
    public void initialize() {
        ArrayList<Integer> liste_nbr_j1 = new ArrayList<>(Arrays.asList(2, 9, 4, 5, 6));
        liste_col_j1 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur1 = creer_joueur(liste_nbr_j1, liste_col_j1);
        liste_nbr_j2 = new ArrayList<>(Arrays.asList(3, 3, 7, 8, 10));
        liste_col_j2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur2 = creer_joueur(liste_nbr_j2, liste_col_j2);
        liste_nbr_j3 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j3 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur3 = creer_joueur(liste_nbr_j3, liste_col_j3);
        liste_nbr_j4 = new ArrayList<>(Arrays.asList(13, 8, 8, 7, 6));
        liste_col_j4 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur4 = creer_joueur(liste_nbr_j4, liste_col_j4);
    }

    @Test
    public void valeur_main() {
        //ValeurMain v1 = new ValeurMain(1, 9, 6, 5, 4, 2);
        //TODO
        ValeurMain vtest1 = new ValeurMain(2, 8, 13, 7, 6, 0);
        assertEquals(vtest1.meilleur_que(joueur4.valeur_main()), 0);
    }

    @Test
    public void paire() {
        assertEquals(joueur1.paire(), 0);
        assertEquals(joueur2.paire(), 3);
        assertEquals(joueur3.paire(), 13);
    }

    @Test
    public void nieme_phc() {
        ArrayList<Integer> j1_int_kicker =  new ArrayList<>(Arrays.asList(2, 9, 4, 5, 6));
        ArrayList<String> j1_string_kicker = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        ArrayList<Carte> j1_kicker = build_kicker(j1_int_kicker, j1_string_kicker);
        joueur1.setKicker(j1_kicker);
        assertEquals(joueur1.nieme_phc(1), 9);
        assertEquals(joueur1.nieme_phc(2), 6);
        assertEquals(joueur1.nieme_phc(3), 5);
        assertEquals(joueur1.nieme_phc(4), 4);
        assertEquals(joueur1.nieme_phc(5), 2);

        ArrayList<Integer> j2_int_kicker = new ArrayList<>(Arrays.asList(7, 8, 10));
        ArrayList<String> j2_string_kicker = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi"));
        ArrayList<Carte> j2_kicker = build_kicker(j2_int_kicker, j2_string_kicker);
        joueur2.setKicker(j2_kicker);
        assertEquals(joueur2.nieme_phc(1), 10);
        assertEquals(joueur2.nieme_phc(2), 8);
        assertEquals(joueur2.nieme_phc(3), 7);

        //assertEquals(joueur3.nieme_phc(2), 13);
    }
}