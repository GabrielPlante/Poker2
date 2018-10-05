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
    private ArrayList<Integer> liste_nbr_j21;
    private ArrayList<String> liste_col_j21;
    private Joueur joueur21;
    private ArrayList<Integer> liste_nbr_j22;
    private ArrayList<String> liste_col_j22;
    private Joueur joueur22;
    private ArrayList<Integer> liste_nbr_j23;
    private ArrayList<String> liste_col_j23;
    private Joueur joueur23;

    private ArrayList<Integer> listeNombreJTestSensible1;
    private ArrayList<String> listeCoulJTestSensible1;
    private Joueur joueurTestSensible1;

    private ArrayList<Integer> listeNombreJTestSensible2;
    private ArrayList<String> listeCoulJTestSensible2;
    private Joueur joueurTestSensible2;



    private ArrayList<Integer> listeNombreJTestSensible3;
    private ArrayList<String> listeCoulJTestSensible3;
    private Joueur joueurTestSensible3;

    private ArrayList<Integer> listeNombreJTestSensible4;
    private ArrayList<String> listeCoulJTestSensible4;
    private Joueur joueurTestSensible4;



    private ArrayList<Integer> listeNombreJTestSensible5;
    private ArrayList<String> listeCoulJTestSensible5;
    private Joueur joueurTestSensible5;

    private ArrayList<Integer> listeNombreJTestSensible6;
    private ArrayList<String> listeCoulJTestSensible6;
    private Joueur joueurTestSensible6;



    private ArrayList<Integer> listeNombreJTestSensible7;
    private ArrayList<String> listeCoulJTestSensible7;
    private Joueur joueurTestSensible7;

    private ArrayList<Integer> listeNombreJTestSensible8;
    private ArrayList<String> listeCoulJTestSensible8;
    private Joueur joueurTestSensible8;



    private ArrayList<Integer> listeNombreJTestSensible9;
    private ArrayList<String> listeCoulJTestSensible9;
    private Joueur joueurTestSensible9;

    private ArrayList<Integer> listeNombreJTestSensible10;
    private ArrayList<String> listeCoulJTestSensible10;
    private Joueur joueurTestSensible10;



    private ArrayList<Integer> listeNombreJTestSensible11;
    private ArrayList<String> listeCoulJTestSensible11;
    private Joueur joueurTestSensible11;

    private ArrayList<Integer> listeNombreJTestSensible12;
    private ArrayList<String> listeCoulJTestSensible12;
    private Joueur joueurTestSensible12;



    private ArrayList<Integer> listeNombreJTestSensible13;
    private ArrayList<String> listeCoulJTestSensible13;
    private Joueur joueurTestSensible13;

    private ArrayList<Integer> listeNombreJTestSensible14;
    private ArrayList<String> listeCoulJTestSensible14;
    private Joueur joueurTestSensible14;



    private ArrayList<Integer> listeNombreJTestSensible15;
    private ArrayList<String> listeCoulJTestSensible15;
    private Joueur joueurTestSensible15;

    private ArrayList<Integer> listeNombreJTestSensible16;
    private ArrayList<String> listeCoulJTestSensible16;
    private Joueur joueurTestSensible16;



    private ArrayList<Integer> listeNombreJTestSensible17;
    private ArrayList<String> listeCoulJTestSensible17;
    private Joueur joueurTestSensible17;

    private ArrayList<Integer> listeNombreJTestSensible18;
    private ArrayList<String> listeCoulJTestSensible18;
    private Joueur joueurTestSensible18;



    private ArrayList<Integer> listeNombreJTestSensible19;
    private ArrayList<String> listeCoulJTestSensible19;
    private Joueur joueurTestSensible19;

    private ArrayList<Integer> listeNombreJTestSensible20;
    private ArrayList<String> listeCoulJTestSensible20;
    private Joueur joueurTestSensible20;


    private List<Integer> list1, list2, list3, list4,
        list5, list6, list7, list8, list9, list10,list11;

    @Before
    public void initialize() {
        ArrayList<Integer> liste_nbr_j1 = new ArrayList<>(Arrays.asList(2, 9, 4, 5, 6));
        liste_col_j1 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur1 = creerJoueur(liste_nbr_j1, liste_col_j1);
        //paire
        liste_nbr_j2 = new ArrayList<>(Arrays.asList(3, 3, 7, 8, 10));
        liste_col_j2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur2 = creerJoueur(liste_nbr_j2, liste_col_j2);


        liste_nbr_j3 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j3 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur3 = creerJoueur(liste_nbr_j3, liste_col_j3);

        //double paire
        liste_nbr_j4 = new ArrayList<>(Arrays.asList(13, 13, 4, 4, 12));
        liste_col_j4 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur4 = creerJoueur(liste_nbr_j4, liste_col_j4);

        //paire
        liste_nbr_j5 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j5 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur5 = creerJoueur(liste_nbr_j5, liste_col_j5);

        //brelan
        liste_nbr_j6 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 13));
        liste_col_j6 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur6 = creerJoueur(liste_nbr_j6, liste_col_j6);

        liste_nbr_j7 = new ArrayList<>(Arrays.asList(13, 8, 5, 5, 5));
        liste_col_j7 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur7 = creerJoueur(liste_nbr_j7, liste_col_j7);

        liste_nbr_j8 = new ArrayList<>(Arrays.asList(14, 3, 14, 14, 11));
        liste_col_j8 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur8 = creerJoueur(liste_nbr_j8, liste_col_j8);
        //suite
        liste_nbr_j9 = new ArrayList<>(Arrays.asList(3, 5, 4, 7, 6));
        liste_col_j9 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur9 = creerJoueur(liste_nbr_j9, liste_col_j9);

        liste_nbr_j10 = new ArrayList<>(Arrays.asList(7, 9, 8, 10, 11));
        liste_col_j10 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur10 = creerJoueur(liste_nbr_j10, liste_col_j10);

        liste_nbr_j11 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
        liste_col_j11 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur11 = creerJoueur(liste_nbr_j11, liste_col_j11);
        //couleur
        liste_nbr_j12 = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
        liste_col_j12 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueur12 = creerJoueur(liste_nbr_j12, liste_col_j12);

        liste_nbr_j13 = new ArrayList<>(Arrays.asList(13, 5, 4, 8, 7));
        liste_col_j13 = new ArrayList<>(Arrays.asList("Co", "Co", "Co", "Co", "Co"));
        joueur13 = creerJoueur(liste_nbr_j13, liste_col_j13);

        liste_nbr_j14 = new ArrayList<>(Arrays.asList(10, 3, 4, 6, 7));
        liste_col_j14 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueur14 = creerJoueur(liste_nbr_j14, liste_col_j14);

        //pour full
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
        //quinte flush
        liste_nbr_j21 = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 4));
        liste_col_j21 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueur21 = creerJoueur(liste_nbr_j21, liste_col_j21);

        liste_nbr_j22 = new ArrayList<>(Arrays.asList(13, 11, 9, 12, 10));
        liste_col_j22 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueur22 = creerJoueur(liste_nbr_j22, liste_col_j22);

        liste_nbr_j23 = new ArrayList<>(Arrays.asList(2, 5, 4, 6, 7));
        liste_col_j23 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueur23 = creerJoueur(liste_nbr_j23, liste_col_j23);

        listeNombreJTestSensible1 = new ArrayList<>(Arrays.asList(2, 2, 8, 6, 7));
        listeCoulJTestSensible1 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible1 = creerJoueur(listeNombreJTestSensible1, listeCoulJTestSensible1);

        listeNombreJTestSensible2 = new ArrayList<>(Arrays.asList(2, 2, 5, 6, 7));
        listeCoulJTestSensible2 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible2 = creerJoueur(listeNombreJTestSensible2, listeCoulJTestSensible2);



        listeNombreJTestSensible3 = new ArrayList<>(Arrays.asList(2, 5, 5, 2, 7));
        listeCoulJTestSensible3 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible3 = creerJoueur(listeNombreJTestSensible3, listeCoulJTestSensible3);

        listeNombreJTestSensible4 = new ArrayList<>(Arrays.asList(2, 5, 5, 2, 3));
        listeCoulJTestSensible4 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible4 = creerJoueur(listeNombreJTestSensible4, listeCoulJTestSensible4);



        listeNombreJTestSensible5 = new ArrayList<>(Arrays.asList(12, 12, 5, 5, 2));
        listeCoulJTestSensible5 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible5 = creerJoueur(listeNombreJTestSensible5, listeCoulJTestSensible5);

        listeNombreJTestSensible6 = new ArrayList<>(Arrays.asList(12, 12, 4, 4, 3));
        listeCoulJTestSensible6 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible6 = creerJoueur(listeNombreJTestSensible6, listeCoulJTestSensible6);



        listeNombreJTestSensible7 = new ArrayList<>(Arrays.asList(8, 5, 4, 6, 7));
        listeCoulJTestSensible7 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible7 = creerJoueur(listeNombreJTestSensible7, listeCoulJTestSensible7);

        listeNombreJTestSensible8 = new ArrayList<>(Arrays.asList(2, 5, 4, 6, 3));
        listeCoulJTestSensible8 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible8 = creerJoueur(listeNombreJTestSensible8, listeCoulJTestSensible8);



        listeNombreJTestSensible9 = new ArrayList<>(Arrays.asList(2, 5, 4, 6, 7));
        listeCoulJTestSensible9 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible9 = creerJoueur(listeNombreJTestSensible9, listeCoulJTestSensible9);

        listeNombreJTestSensible10 = new ArrayList<>(Arrays.asList(3, 5, 4, 6, 7));
        listeCoulJTestSensible10 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Co"));
        joueurTestSensible10 = creerJoueur(listeNombreJTestSensible10, listeCoulJTestSensible10);



        listeNombreJTestSensible11 = new ArrayList<>(Arrays.asList(2, 5, 4, 6, 7));
        listeCoulJTestSensible11 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible11 = creerJoueur(listeNombreJTestSensible11, listeCoulJTestSensible11);

        listeNombreJTestSensible12 = new ArrayList<>(Arrays.asList(1, 5, 4, 6, 7));
        listeCoulJTestSensible12 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible12 = creerJoueur(listeNombreJTestSensible12, listeCoulJTestSensible12);



        listeNombreJTestSensible13 = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 7));
        listeCoulJTestSensible13 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Tr", "Co"));
        joueurTestSensible13 = creerJoueur(listeNombreJTestSensible13, listeCoulJTestSensible13);

        listeNombreJTestSensible14 = new ArrayList<>(Arrays.asList(3, 3, 3, 4, 4));
        listeCoulJTestSensible14 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Tr", "Co"));
        joueurTestSensible14 = creerJoueur(listeNombreJTestSensible14, listeCoulJTestSensible14);



        listeNombreJTestSensible15 = new ArrayList<>(Arrays.asList(7, 7, 7, 6, 7));
        listeCoulJTestSensible15 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Tr", "Co"));
        joueurTestSensible15 = creerJoueur(listeNombreJTestSensible15, listeCoulJTestSensible15);

        listeNombreJTestSensible16 = new ArrayList<>(Arrays.asList(3, 3, 3, 3, 13));
        listeCoulJTestSensible16 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Tr", "Co"));
        joueurTestSensible16 = creerJoueur(listeNombreJTestSensible16, listeCoulJTestSensible16);



        listeNombreJTestSensible17 = new ArrayList<>(Arrays.asList(8, 5, 4, 6, 7));
        listeCoulJTestSensible17 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible17 = creerJoueur(listeNombreJTestSensible17, listeCoulJTestSensible17);

        listeNombreJTestSensible18 = new ArrayList<>(Arrays.asList(3, 5, 4, 6, 7));
        listeCoulJTestSensible18 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible18 = creerJoueur(listeNombreJTestSensible18, listeCoulJTestSensible18);



        listeNombreJTestSensible19 = new ArrayList<>(Arrays.asList(2, 3, 8, 6, 7));
        listeCoulJTestSensible19 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
        joueurTestSensible19 = creerJoueur(listeNombreJTestSensible19, listeCoulJTestSensible19);

        listeNombreJTestSensible20 = new ArrayList<>(Arrays.asList(9, 10, 13, 12, 11));
        listeCoulJTestSensible20 = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Tr", "Co"));
        joueurTestSensible20 = creerJoueur(listeNombreJTestSensible20, listeCoulJTestSensible20);
    }

    @Test
    public void meilleurQueTest() {
        ValeurMain vmJ1 = new ValeurMain(joueur1);
        ValeurMain vmJ2 = new ValeurMain(joueur2);
        ValeurMain vmJ4 = new ValeurMain(joueur4);
        ValeurMain vmJ6 = new ValeurMain(joueur6);
        ValeurMain vmJ9 = new ValeurMain(joueur9);
        ValeurMain vmJ12 = new ValeurMain(joueur12);
        ValeurMain vmJ15 = new ValeurMain(joueur15);
        ValeurMain vmJ18 = new ValeurMain(joueur18);
        ValeurMain vmJ21 = new ValeurMain(joueur21);

        //vmJ1 <
        assertEquals(vmJ1.meilleureQue(vmJ1), 0);
        assertEquals(vmJ1.meilleureQue(vmJ2), -1); //paire
        assertEquals(vmJ1.meilleureQue(vmJ4), -1); //double paire
        assertEquals(vmJ1.meilleureQue(vmJ6), -1); //brelan
        assertEquals(vmJ1.meilleureQue(vmJ9), -1);//suite
        assertEquals(vmJ1.meilleureQue(vmJ12), -1);//couleur
        assertEquals(vmJ1.meilleureQue(vmJ15), -1);//full
        assertEquals(vmJ1.meilleureQue(vmJ18), -1);//carre
        assertEquals(vmJ1.meilleureQue(vmJ21), -1);//quinte flush

        //vmJ2 <
        assertEquals(vmJ2.meilleureQue(vmJ2), 0); //paire
        assertEquals(vmJ2.meilleureQue(vmJ4), -1); //double paire
        assertEquals(vmJ2.meilleureQue(vmJ6), -1); //brelan
        assertEquals(vmJ2.meilleureQue(vmJ9), -1); //suite
        assertEquals(vmJ2.meilleureQue(vmJ12), -1); //couleur
        assertEquals(vmJ2.meilleureQue(vmJ15), -1); //full
        assertEquals(vmJ2.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ2.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ3 <
        assertEquals(vmJ4.meilleureQue(vmJ4), 0); //double paire
        assertEquals(vmJ4.meilleureQue(vmJ6), -1); //brelan
        assertEquals(vmJ4.meilleureQue(vmJ9), -1); //suite
        assertEquals(vmJ4.meilleureQue(vmJ12), -1); //couleur
        assertEquals(vmJ4.meilleureQue(vmJ15), -1); //full
        assertEquals(vmJ4.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ4.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ6 <
        assertEquals(vmJ6.meilleureQue(vmJ6), 0); //brelan
        assertEquals(vmJ6.meilleureQue(vmJ9), -1); //suite
        assertEquals(vmJ6.meilleureQue(vmJ12), -1); //couleur
        assertEquals(vmJ6.meilleureQue(vmJ15), -1); //full
        assertEquals(vmJ6.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ6.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ9 <
        assertEquals(vmJ9.meilleureQue(vmJ9), 0); //suite
        assertEquals(vmJ9.meilleureQue(vmJ12), -1); //couleur
        assertEquals(vmJ9.meilleureQue(vmJ15), -1); //full
        assertEquals(vmJ9.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ9.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ12 <
        assertEquals(vmJ12.meilleureQue(vmJ12), 0); //couleur
        assertEquals(vmJ12.meilleureQue(vmJ15), -1); //full
        assertEquals(vmJ12.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ12.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ15 <
        assertEquals(vmJ15.meilleureQue(vmJ15), 0); //full
        assertEquals(vmJ15.meilleureQue(vmJ18), -1); //carre
        assertEquals(vmJ15.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ18 <
        assertEquals(vmJ18.meilleureQue(vmJ18), 0); //carre
        assertEquals(vmJ18.meilleureQue(vmJ21), -1); //quinte flush

        //vmJ21 <=
        assertEquals(vmJ21.meilleureQue(vmJ21), 0);

        ValeurMain main1 = new ValeurMain(joueurTestSensible1);
        ValeurMain main2 = new ValeurMain(joueurTestSensible2);
        ValeurMain main3 = new ValeurMain(joueurTestSensible3);
        ValeurMain main4 = new ValeurMain(joueurTestSensible4);
        ValeurMain main5 = new ValeurMain(joueurTestSensible5);
        ValeurMain main6 = new ValeurMain(joueurTestSensible6);
        ValeurMain main7 = new ValeurMain(joueurTestSensible7);
        ValeurMain main8 = new ValeurMain(joueurTestSensible8);
        ValeurMain main9 = new ValeurMain(joueurTestSensible9);
        ValeurMain main10 = new ValeurMain(joueurTestSensible10);
        ValeurMain main11 = new ValeurMain(joueurTestSensible11);
        ValeurMain main12 = new ValeurMain(joueurTestSensible12);
        ValeurMain main13 = new ValeurMain(joueurTestSensible13);
        ValeurMain main14 = new ValeurMain(joueurTestSensible14);
        ValeurMain main15 = new ValeurMain(joueurTestSensible15);
        ValeurMain main16 = new ValeurMain(joueurTestSensible16);
        ValeurMain main17 = new ValeurMain(joueurTestSensible17);
        ValeurMain main18 = new ValeurMain(joueurTestSensible18);
        ValeurMain main19 = new ValeurMain(joueurTestSensible19);
        ValeurMain main20 = new ValeurMain(joueurTestSensible20);

        assertEquals(main1.meilleureQue(main2),1);
        assertEquals(main3.meilleureQue(main4),1);
        assertEquals(main5.meilleureQue(main6),1);
        assertEquals(main7.meilleureQue(main8),1);
        assertEquals(main9.meilleureQue(main10),1);
        assertEquals(main11.meilleureQue(main12),1);
        assertEquals(main13.meilleureQue(main14),1);
        assertEquals(main15.meilleureQue(main16),1);
        assertEquals(main17.meilleureQue(main18),1);
        assertEquals(main19.meilleureQue(main20),1);
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
        //quinte flush
        ValeurMain vmJ21 = new ValeurMain(joueur21);
        ValeurMain vmJ22 = new ValeurMain(joueur22);

        list1 = new ArrayList<Integer>(Arrays.asList(1, 9, 6, 5, 4, 2));
        list2 = new ArrayList<Integer>(Arrays.asList(2, 3, 10, 8, 7, 0));
        assertEquals(vmJ1.getValeurMain(), list1);
        assertEquals(vmJ2.getValeurMain(), list2);
        list4 = new ArrayList<Integer>(Arrays.asList(3, 13, 4, 12, 0, 0));
        list6 = new ArrayList<Integer>(Arrays.asList(4, 13, 0, 0, 0, 0));
        assertEquals(vmJ4.getValeurMain(), list4);
        assertEquals(vmJ6.getValeurMain(), list6);
        //suite
        list9 = new ArrayList<Integer>(Arrays.asList(5, 7, 0, 0, 0, 0));
        list10 = new ArrayList<Integer>(Arrays.asList(5, 11, 0, 0, 0, 0));
        assertEquals(vmJ9.getValeurMain(), list9);
        assertEquals(vmJ10.getValeurMain(), list10);
        //couleur
        ArrayList<Integer> list12 = new ArrayList<Integer>(Arrays.asList(6, 7, 6, 4, 3, 2));
        ArrayList<Integer> list13 = new ArrayList<Integer>(Arrays.asList(6, 13, 8, 7, 5, 4));
        assertEquals(vmJ12.getValeurMain(), list12);
        assertEquals(vmJ13.getValeurMain(), list13);
        //full
        List<Integer> list15 = new ArrayList<>(Arrays.asList(7, 3, 2, 0, 0, 0));
        List<Integer> list16 = new ArrayList<>(Arrays.asList(7, 4, 11, 0, 0, 0));
        assertEquals(vmJ15.getValeurMain(), list15);
        assertEquals(vmJ16.getValeurMain(), list16);
        //carre
        List<Integer> list18 = new ArrayList<>(Arrays.asList(8, 3, 2, 0, 0, 0));
        List<Integer> list19 = new ArrayList<>(Arrays.asList(8, 4, 11, 0, 0, 0));
        assertEquals(vmJ15.getValeurMain(), list15);
        assertEquals(vmJ16.getValeurMain(), list16);
        //quinte flush
        List<Integer> list21 = new ArrayList<>(Arrays.asList(9, 8, 0, 0, 0, 0));
        List<Integer> list22 = new ArrayList<>(Arrays.asList(9, 13, 0, 0, 0, 0));
        assertEquals(vmJ21.getValeurMain(), list21);
        assertEquals(vmJ22.getValeurMain(), list22);
    }
}

