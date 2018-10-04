package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
    private ArrayList<Integer> liste_nbr_j9;
    private ArrayList<String> liste_col_j9;
    private Joueur joueur9;
    private ArrayList<Integer> liste_nbr_j10;
    private ArrayList<String> liste_col_j10;
    private Joueur joueur10;
    private ArrayList<Integer> liste_nbr_j11;
    private ArrayList<String> liste_col_j11;
    private Joueur joueur11;
    private ArrayList<Integer> liste_nbr_j12;
    private ArrayList<String> liste_col_j12;
    private Joueur joueur12;
    private ArrayList<Integer> liste_nbr_j13;
    private ArrayList<String> liste_col_j13;
    private Joueur joueur13;
    private ArrayList<Integer> liste_nbr_j14;
    private ArrayList<String> liste_col_j14;
    private Joueur joueur14;
    private ArrayList<Integer> liste_nbr_j15;
    private ArrayList<String> liste_col_j15;
    private Joueur joueur15;
    private ArrayList<Integer> liste_nbr_j16;
    private ArrayList<String> liste_col_j16;
    private Joueur joueur16;
    private ArrayList<Integer> liste_nbr_j17;
    private ArrayList<String> liste_col_j17;
    private Joueur joueur17;
    private ArrayList<Integer> liste_nbr_j18;
    private ArrayList<String> liste_col_j18;
    private Joueur joueur18;
    private ArrayList<Integer> liste_nbr_j19;
    private ArrayList<String> liste_col_j19;
    private Joueur joueur19;
    private ArrayList<Integer> liste_nbr_j20;
    private ArrayList<String> liste_col_j20;
    private Joueur joueur20;


    private List<Integer> list1, list2, list3, list4,
        list5, list6, list7, list8, list9, list10,list11;

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

        liste_nbr_j9 = new ArrayList<>(Arrays.asList(3, 5, 4, 7, 6));
        liste_col_j9 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur9 = creerJoueur(liste_nbr_j9, liste_col_j9);

        liste_nbr_j10 = new ArrayList<>(Arrays.asList(7, 9, 8, 10, 11));
        liste_col_j10 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur10 = creerJoueur(liste_nbr_j10, liste_col_j10);

        liste_nbr_j11 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
        liste_col_j11 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur11 = creerJoueur(liste_nbr_j11, liste_col_j11);

        liste_nbr_j12 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
        liste_col_j12 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueur12 = creerJoueur(liste_nbr_j12, liste_col_j12);

        liste_nbr_j13 = new ArrayList<>(Arrays.asList(13, 5, 4, 8, 7));
        liste_col_j13 = new ArrayList<>(Arrays.asList("Co", "Co", "Co", "Co", "Co"));
        joueur13 = creerJoueur(liste_nbr_j13, liste_col_j13);

        liste_nbr_j14 = new ArrayList<>(Arrays.asList(10, 3, 4, 6, 7));
        liste_col_j14 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueur14 = creerJoueur(liste_nbr_j14, liste_col_j14);

        //pour full ce qui suit
        liste_nbr_j15 = new ArrayList<>(Arrays.asList(3, 3, 3, 2, 2));
        liste_col_j15 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Pi", "Co"));
        joueur15 = creerJoueur(liste_nbr_j15, liste_col_j15);

        liste_nbr_j16 = new ArrayList<>(Arrays.asList(4, 4, 4, 11, 11));
        liste_col_j16 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Pi", "Co"));
        joueur16 = creerJoueur(liste_nbr_j16, liste_col_j16);

        liste_nbr_j17 = new ArrayList<>(Arrays.asList(5, 5, 5, 6, 7));
        liste_col_j17 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Pi", "Co"));
        joueur17 = creerJoueur(liste_nbr_j17, liste_col_j17);

        //pour le carré
        liste_nbr_j18 = new ArrayList<>(Arrays.asList(3, 3, 3, 3, 2));
        liste_col_j18 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Co"));
        joueur18 = creerJoueur(liste_nbr_j18, liste_col_j18);

        liste_nbr_j19 = new ArrayList<>(Arrays.asList(4, 4, 4, 11, 4));
        liste_col_j19 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Pi", "Tr"));
        joueur19 = creerJoueur(liste_nbr_j19, liste_col_j19);

        liste_nbr_j20 = new ArrayList<>(Arrays.asList(5, 5, 5, 6, 7));
        liste_col_j20 = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Pi", "Co"));
        joueur20 = creerJoueur(liste_nbr_j20, liste_col_j20);
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
        ValeurMain vmJ1 = new ValeurMain(joueur1);
        ValeurMain vmJ2 = new ValeurMain(joueur2);
        ValeurMain vmJ4 = new ValeurMain(joueur4);

        ValeurMain vmJ6 = new ValeurMain(joueur6);
        ValeurMain vmJ9 = new ValeurMain(joueur9);
        ValeurMain vmJ10 = new ValeurMain(joueur10);

        ValeurMain vmJ12 = new ValeurMain(joueur12);
        ValeurMain vmJ13 = new ValeurMain(joueur13);
        //full
        ValeurMain vmJ15 = new ValeurMain(joueur15);
        ValeurMain vmJ16 = new ValeurMain(joueur16);
        ValeurMain vmJ17 = new ValeurMain(joueur17);
        //carre
        ValeurMain vmJ18 = new ValeurMain(joueur18);
        ValeurMain vmJ19 = new ValeurMain(joueur19);
        ValeurMain vmJ20 = new ValeurMain(joueur20);

        list1 = new ArrayList<Integer>(Arrays.asList(1, 9, 6, 5, 4, 2));
        assertEquals(vmJ1.getValeurMain(), list1);
        list2 = new ArrayList<Integer>(Arrays.asList(2, 3, 10, 8, 7, 0));
        assertEquals(vmJ2.getValeurMain(), list2);
        list4 = new ArrayList<Integer>(Arrays.asList(3, 13, 4, 12, 0, 0));
        assertEquals(vmJ4.getValeurMain(), list4);
        list6 = new ArrayList<Integer>(Arrays.asList(4, 13, 0, 0, 0, 0));
        assertEquals(vmJ6.getValeurMain(), list6);
        //suite
        list9 = new ArrayList<Integer>(Arrays.asList(5, 7, 0, 0, 0, 0));
        assertEquals(vmJ9.getValeurMain(), list9);
        list10 = new ArrayList<Integer>(Arrays.asList(5, 11, 0, 0, 0, 0));
        assertEquals(vmJ10.getValeurMain(), list10);
        //couleur
        ArrayList<Integer> list12 = new ArrayList<Integer>(Arrays.asList(6, 7, 6, 4, 3, 2));
        assertEquals(vmJ12.getValeurMain(), list12);
        ArrayList<Integer> list13 = new ArrayList<Integer>(Arrays.asList(6, 13, 8, 7, 5, 4));
        assertEquals(vmJ13.getValeurMain(), list13);
        //full
        List<Integer> list15 = new ArrayList<>(Arrays.asList(7, 3, 2, 0, 0, 0));
        assertEquals(vmJ15.getValeurMain(), list15);
        List<Integer> list16 = new ArrayList<>(Arrays.asList(7, 4, 11, 0, 0, 0));
        assertEquals(vmJ16.getValeurMain(), list16);
        //carre
        List<Integer> list18 = new ArrayList<>(Arrays.asList(8, 3, 2, 0, 0, 0));
        assertEquals(vmJ15.getValeurMain(), list15);
        List<Integer> list19 = new ArrayList<>(Arrays.asList(8, 4, 11, 0, 0, 0));
        assertEquals(vmJ16.getValeurMain(), list16);
    }
}

