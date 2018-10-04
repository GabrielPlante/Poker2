package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValeurMainTest {

    private Joueur creerJoueur(ArrayList<Integer> liste_nbr, ArrayList<String> liste_col){
        ArrayList<Carte> liste_carte = new ArrayList<>();
        for (int i = 0; i!= 5; ++i)
            liste_carte.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return new Joueur(liste_carte);
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
    private ArrayList<Integer> liste_nbr_j5;
    private ArrayList<String> liste_col_j5;
    private Joueur joueur5;
    private ArrayList<Integer> liste_nbr_j6;
    private ArrayList<String> liste_col_j6;
    private Joueur joueur6;
    private ArrayList<Integer> liste_nbr_j7;
    private ArrayList<String> liste_col_j7;
    private Joueur joueur7;
    private ArrayList<Integer> liste_nbr_j8;
    private ArrayList<String> liste_col_j8;
    private Joueur joueur8;

    private List<Integer> l4;

    @Before
    public void initialize() {
        ArrayList<Integer> liste_nbr_j1 = new ArrayList<>(Arrays.asList(2, 9, 4, 5, 6));
        liste_col_j1 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur1 = creerJoueur(liste_nbr_j1, liste_col_j1);


        liste_nbr_j2 = new ArrayList<>(Arrays.asList(3, 3, 7, 8, 10));
        liste_col_j2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur2 = creerJoueur(liste_nbr_j2, liste_col_j2);


        liste_nbr_j3 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j3 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur3 = creerJoueur(liste_nbr_j3, liste_col_j3);


        liste_nbr_j4 = new ArrayList<>(Arrays.asList(13, 13, 4, 4, 12));
        liste_col_j4 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur4 = creerJoueur(liste_nbr_j4, liste_col_j4);


        liste_nbr_j5 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j5 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur5 = creerJoueur(liste_nbr_j5, liste_col_j5);


        liste_nbr_j6 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 13));
        liste_col_j6 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur6 = creerJoueur(liste_nbr_j6, liste_col_j6);

        liste_nbr_j7 = new ArrayList<>(Arrays.asList(13, 8, 5, 5, 5));
        liste_col_j7 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur7 = creerJoueur(liste_nbr_j7, liste_col_j7);

        liste_nbr_j8 = new ArrayList<>(Arrays.asList(14, 3, 14, 14, 11));
        liste_col_j8 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur8 = creerJoueur(liste_nbr_j8, liste_col_j8);
    }

    @Test
    public void meilleurQue() {//TODO refaire ça
        /*ValeurMain main1 = new ValeurMain(2, 2, 2, 2, 2, 2);
        ValeurMain main2 = new ValeurMain(2, 2, 2, 2, 2, 1);
        ValeurMain main3 = new ValeurMain(1, 3, 3, 3, 3, 3);
        assertEquals(main1.meilleureQue(main1), 0);
        assertEquals(main1.meilleureQue(main2), 1);
        assertEquals(main1.meilleureQue(main3), 1);
        assertEquals(main3.meilleureQue(main1), -1);*/
    }

    @Test
    public void valeurMain(){
        assertEquals(valeurMain(joueur1), );
    }
}

