package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JoueurTest {
    private Joueur creer_joueur(ArrayList<Integer> liste_nbr, ArrayList<String> liste_col){
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
        joueur1 = creer_joueur(liste_nbr_j1, liste_col_j1);


        liste_nbr_j2 = new ArrayList<>(Arrays.asList(3, 3, 7, 8, 10));
        liste_col_j2 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Pi", "Pi"));
        joueur2 = creer_joueur(liste_nbr_j2, liste_col_j2);


        liste_nbr_j3 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j3 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur3 = creer_joueur(liste_nbr_j3, liste_col_j3);


        liste_nbr_j4 = new ArrayList<>(Arrays.asList(13, 13, 4, 4, 12));
        liste_col_j4 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur4 = creer_joueur(liste_nbr_j4, liste_col_j4);


        liste_nbr_j5 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 12));
        liste_col_j5 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur5 = creer_joueur(liste_nbr_j5, liste_col_j5);


        liste_nbr_j6 = new ArrayList<>(Arrays.asList(13, 13, 4, 5, 13));
        liste_col_j6 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur6 = creer_joueur(liste_nbr_j6, liste_col_j6);

        liste_nbr_j7 = new ArrayList<>(Arrays.asList(13, 8, 5, 5, 5));
        liste_col_j7 = new ArrayList<>(Arrays.asList("Pi", "Co", "Co", "Co", "Pi"));
        joueur7 = creer_joueur(liste_nbr_j7, liste_col_j7);

        liste_nbr_j8 = new ArrayList<>(Arrays.asList(14, 3, 14, 14, 11));
        liste_col_j8 = new ArrayList<>(Arrays.asList("Pi", "Co", "Pi", "Co", "Pi"));
        joueur8 = creer_joueur(liste_nbr_j8, liste_col_j8);
    }

    @Test
    public void valeur_main() {//TODO refaire ça
        //ValeurMain vtest1 = new ValeurMain(joueur2);
        //assertEquals(vtest1.meilleur_que(joueur2.valeur_main()), 0);
    }

    @Test
    public void paire() {
        assertEquals(joueur1.paire(), 0);
        assertEquals(joueur2.paire(), 3);
        assertEquals(joueur3.paire(), 13);
    }

    @Test
    public void double_paire() {
        /*List<E> a = resultFromTest();
        List<E> expected = Arrays.asList(new E(), new E(), ...);

        assertTrue("Expected 'a' and 'expected' to be equal."+
                        "\n  'a'        = "+a+
                        "\n  'expected' = "+expected,
                expected.equals(a));*/

        l4 = new ArrayList<Integer>(Arrays.asList(13, 4));
        assertTrue(joueur4.double_paire().equals(l4));
        assertTrue(joueur5.double_paire().equals(new ArrayList<Integer>()));
    }

    @Test
    public void brelan() {
        assertEquals(joueur6.brelan(),13);
        assertEquals(joueur7.brelan(),5);
    }

    @Test
    public void nieme_phc() {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(14);

        assertEquals(joueur8.nieme_phc(1, a3), 11);
        assertEquals(joueur2.nieme_phc(1,a1),10);
        assertEquals(joueur2.nieme_phc(5,a1),0);
        assertEquals(joueur2.nieme_phc(4,a1),0);
        assertEquals(joueur2.nieme_phc(3,a1),7);
        assertEquals(joueur2.nieme_phc(5,a2),3);
    }
}