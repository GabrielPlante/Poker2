package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JoueurTest {
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
    public void paireTest() {
        assertEquals(joueur1.paire(), 0);
        assertEquals(joueur2.paire(), 3);
        assertEquals(joueur3.paire(), 13);
    }

    @Test
    public void doublePaireTest() {
        l4 = new ArrayList<Integer>(Arrays.asList(13, 4));
        assertEquals(joueur4.doublePaire(), l4);
        assertEquals(joueur5.doublePaire(), new ArrayList<Integer>());
    }

    @Test
    public void brelanTest() {
        assertEquals(joueur6.brelan(),13);
        assertEquals(joueur7.brelan(),5);
    }


    @Test
    public void suiteTest(){
        assertEquals(joueur9.suite(),7);
        assertEquals(joueur10.suite(),11);
        assertEquals(joueur11.suite(),0);
    }

    @Test
    public void couleurTest(){
        List<Integer> l12 = new ArrayList<>(Arrays.asList(7, 6, 4, 3, 2));
        List<Integer> l13 = new ArrayList<>(Arrays.asList(13, 8, 7, 5, 4));

        assertEquals(joueur12.couleur(), l12);
        assertEquals(joueur13.couleur(), l13);
        assertEquals(joueur14.couleur(), new ArrayList<Integer>());
    }

    @Test
    public void fullTest(){
        List<Integer> l15 = new ArrayList<>(Arrays.asList(3, 2));
        List<Integer> l16 = new ArrayList<>(Arrays.asList(4, 11));

        assertEquals(joueur15.full(), l15);
        assertEquals(joueur16.full(), l16);
        assertEquals(joueur17.full(), new ArrayList<Integer>());
    }
    @Test
    public void carreTest(){
        assertEquals(joueur18.carre(),3);
        assertEquals(joueur19.carre(),4);
        assertEquals(joueur20.carre(),0);
    }
    @Test
    public void niemePhc() {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(14);

        assertEquals(joueur8.niemePhc(1, a3), 11);
        assertEquals(joueur2.niemePhc(1,a1),10);
        assertEquals(joueur2.niemePhc(5,a1),0);
        assertEquals(joueur2.niemePhc(4,a1),0);
        assertEquals(joueur2.niemePhc(3,a1),7);
        assertEquals(joueur2.niemePhc(5,a2),3);
    }
}