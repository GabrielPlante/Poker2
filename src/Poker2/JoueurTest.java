package Poker2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class JoueurTest {
    private Joueur creerJoueur(ArrayList<Integer> liste_nbr, ArrayList<String> liste_col){
        ArrayList<Carte> liste_carte = new ArrayList<>();
        for (int i = 0; i!= 5; ++i)
            liste_carte.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return new Joueur(liste_carte);
    }

    //@Before
    // 3 joueurs par combinaisons, l'indice d'un joueur indique son classement par rapport aux autres: Jx bats Jy si x>y

    //hauteur ------------------------------------------------------------------------------------------------------

    //9
    private ArrayList<Integer> J1ValeurCarte = new ArrayList<>(Arrays.asList(3, 4, 7, 8, 9));
    private ArrayList<String> J1FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J1 = creerJoueur(J1ValeurCarte, J1FamilleCarte);

    //Roi (12)
    private ArrayList<Integer> J2ValeurCarte = new ArrayList<>(Arrays.asList(12, 3, 5, 9, 2));
    private ArrayList<String> J2FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J2 = creerJoueur(J2ValeurCarte, J2FamilleCarte);

    //As (13)
    private ArrayList<Integer> J3ValeurCarte = new ArrayList<>(Arrays.asList(5, 7, 8, 13, 6));
    private ArrayList<String> J3FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J3 = creerJoueur(J3ValeurCarte, J3FamilleCarte);

    //Paire --------------------------------------------------------------------------------------------------------

    //3
    private ArrayList<Integer> J4ValeurCarte = new ArrayList<>(Arrays.asList(3, 5, 13, 8, 3));
    private ArrayList<String> J4FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Ca"));
    private Joueur J4 = creerJoueur(J4ValeurCarte, J4FamilleCarte);

    //7
    private ArrayList<Integer> J5ValeurCarte = new ArrayList<>(Arrays.asList(8, 12, 7, 10, 7));
    private ArrayList<String> J5FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J5 = creerJoueur(J5ValeurCarte, J5FamilleCarte);

    //Valet(10)
    private ArrayList<Integer> J6ValeurCarte = new ArrayList<>(Arrays.asList(10, 9, 12, 3, 10));
    private ArrayList<String> J6FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Ca"));
    private Joueur J6 = creerJoueur(J6ValeurCarte, J6FamilleCarte);

    //Double paire -------------------------------------------------------------------------------------------------

    //6 et 5
    private ArrayList<Integer> J7ValeurCarte = new ArrayList<>(Arrays.asList(6, 6, 5, 5, 11));
    private ArrayList<String> J7FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J7 = creerJoueur(J7ValeurCarte, J7FamilleCarte);

    //Valet (10) et 8
    private ArrayList<Integer> J8ValeurCarte = new ArrayList<>(Arrays.asList(8, 12, 10, 10, 8));
    private ArrayList<String> J8FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Ca"));
    private Joueur J8 = creerJoueur(J8ValeurCarte, J8FamilleCarte);

    //Roi (12) et Valet (10)
    private ArrayList<Integer> J9ValeurCarte = new ArrayList<>(Arrays.asList(12, 12, 10, 10, 8));
    private ArrayList<String> J9FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J9 = creerJoueur(J9ValeurCarte, J9FamilleCarte);

    //Brelan -------------------------------------------------------------------------------------------------------

    //1
    private ArrayList<Integer> J10ValeurCarte = new ArrayList<>(Arrays.asList(3, 1, 1, 1, 9));
    private ArrayList<String> J10FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J10 = creerJoueur(J10ValeurCarte, J10FamilleCarte);

    //7
    private ArrayList<Integer> J11ValeurCarte = new ArrayList<>(Arrays.asList(7, 7, 7, 8, 12));
    private ArrayList<String> J11FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J11 = creerJoueur(J11ValeurCarte, J11FamilleCarte);

    //As (13)
    private ArrayList<Integer> J12ValeurCarte = new ArrayList<>(Arrays.asList(4, 5, 13, 13, 13));
    private ArrayList<String> J12FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J12 = creerJoueur(J12ValeurCarte, J12FamilleCarte);

    //Suite --------------------------------------------------------------------------------------------------------

    //5
    private ArrayList<Integer> J13ValeurCarte = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 5));
    private ArrayList<String> J13FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J13 = creerJoueur(J13ValeurCarte, J13FamilleCarte);

    //9
    private ArrayList<Integer> J14ValeurCarte = new ArrayList<>(Arrays.asList(8, 7, 5, 6, 9));
    private ArrayList<String> J14FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J14 = creerJoueur(J14ValeurCarte, J14FamilleCarte);

    //As (13)
    private ArrayList<Integer> J15ValeurCarte = new ArrayList<>(Arrays.asList(9, 11, 10, 13, 12));
    private ArrayList<String> J15FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J15 = creerJoueur(J15ValeurCarte, J15FamilleCarte);

    //Couleur ------------------------------------------------------------------------------------------------------

    //7
    private ArrayList<Integer> J16ValeurCarte = new ArrayList<>(Arrays.asList(2, 1, 6, 4, 7));
    private ArrayList<String> J16FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
    private Joueur J16 = creerJoueur(J16ValeurCarte, J16FamilleCarte);

    //9
    private ArrayList<Integer> J17ValeurCarte = new ArrayList<>(Arrays.asList(9, 6, 4, 1, 3));
    private ArrayList<String> J17FamilleCarte = new ArrayList<>(Arrays.asList("Co", "Co", "Co", "Co", "Co"));
    private Joueur J17 = creerJoueur(J17ValeurCarte, J17FamilleCarte);

    //Valet (10)
    private ArrayList<Integer> J18ValeurCarte = new ArrayList<>(Arrays.asList(2, 8, 4, 5, 10));
    private ArrayList<String> J18FamilleCarte = new ArrayList<>(Arrays.asList("Tr", "Tr", "Tr", "Tr", "Tr"));
    private Joueur J18 = creerJoueur(J18ValeurCarte, J18FamilleCarte);

    //Full ---------------------------------------------------------------------------------------------------------

    //3 par les As (13)
    private ArrayList<Integer> J19ValeurCarte = new ArrayList<>(Arrays.asList(3, 3, 3, 13, 13));
    private ArrayList<String> J19FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J19 = creerJoueur(J19ValeurCarte, J19FamilleCarte);

    //6 par les 5
    private ArrayList<Integer> J20ValeurCarte = new ArrayList<>(Arrays.asList(6, 5, 5, 6, 6));
    private ArrayList<String> J20FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J20 = creerJoueur(J20ValeurCarte, J20FamilleCarte);

    //Dame (11) par les 1
    private ArrayList<Integer> J21ValeurCarte = new ArrayList<>(Arrays.asList(1, 1, 11, 11, 11));
    private ArrayList<String> J21FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J21 = creerJoueur(J21ValeurCarte, J21FamilleCarte);

    //Carré --------------------------------------------------------------------------------------------------------

    //1
    private ArrayList<Integer> J22ValeurCarte = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 5));
    private ArrayList<String> J22FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J22 = creerJoueur(J22ValeurCarte, J22FamilleCarte);

    //3
    private ArrayList<Integer> J23ValeurCarte = new ArrayList<>(Arrays.asList(3, 3, 3, 13, 3));
    private ArrayList<String> J23FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J23 = creerJoueur(J23ValeurCarte, J23FamilleCarte);

    //9
    private ArrayList<Integer> J24ValeurCarte = new ArrayList<>(Arrays.asList(9, 9, 2, 9, 9));
    private ArrayList<String> J24FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Joueur J24 = creerJoueur(J24ValeurCarte, J24FamilleCarte);

    //Quinte Flush -------------------------------------------------------------------------------------------------

    //8
    private ArrayList<Integer> J25ValeurCarte = new ArrayList<>(Arrays.asList(5, 4, 8, 7, 6));
    private ArrayList<String> J25FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Pi", "Pi", "Pi", "Pi"));
    private Joueur J25 = creerJoueur(J25ValeurCarte, J25FamilleCarte);

    //Valet (10)
    private ArrayList<Integer> J26ValeurCarte = new ArrayList<>(Arrays.asList(10, 8, 6, 7, 9));
    private ArrayList<String> J26FamilleCarte = new ArrayList<>(Arrays.asList("Co", "Co", "Co", "Co", "Co"));
    private Joueur J26 = creerJoueur(J26ValeurCarte, J26FamilleCarte);

    //As (13)
    private ArrayList<Integer> J27ValeurCarte = new ArrayList<>(Arrays.asList(12, 13, 10, 11, 9));
    private ArrayList<String> J27FamilleCarte = new ArrayList<>(Arrays.asList("Ca", "Ca", "Ca", "Ca", "Ca"));
    private Joueur J27 = creerJoueur(J27ValeurCarte, J27FamilleCarte);

    // --------------------------------------------------------------------------------------------------------------
    //Array pour les méthodes double paire, couleur et full ---------------------------------------------------------
    // --------------------------------------------------------------------------------------------------------------

    private ArrayList<Integer> LVide = new ArrayList<>(Collections.emptyList());

    private ArrayList<Integer> LJ7 = new ArrayList<>(Arrays.asList(6, 5));
    private ArrayList<Integer> LJ8 = new ArrayList<>(Arrays.asList(10, 8));
    private ArrayList<Integer> LJ9 = new ArrayList<>(Arrays.asList(12, 10));

    private ArrayList<Integer> LJ16 = new ArrayList<>(Arrays.asList(7, 6, 4, 2, 1));
    private ArrayList<Integer> LJ17 = new ArrayList<>(Arrays.asList(9, 6, 4, 3, 1));
    private ArrayList<Integer> LJ18 = new ArrayList<>(Arrays.asList(10, 8, 5, 4, 2));

    private ArrayList<Integer> LJ19 = new ArrayList<>(Arrays.asList(3, 13));
    private ArrayList<Integer> LJ20 = new ArrayList<>(Arrays.asList(6, 5));
    private ArrayList<Integer> LJ21 = new ArrayList<>(Arrays.asList(11, 1));

    @Test
    public void paireTest() {
        assertEquals(J4.paire(), 3);
        assertEquals(J5.paire(), 7);
        assertEquals(J6.paire(), 10);
        assertEquals(J13.paire(), 0);
    }

    @Test
    public void doublePaireTest() {
        assertEquals(J7.doublePaire(), LJ7);
        assertEquals(J8.doublePaire(), LJ8);
        assertEquals(J9.doublePaire(), LJ9);
        assertEquals(J4.doublePaire(), LVide);
    }

    @Test
    public void brelanTest() {
        assertEquals(J10.brelan(), 1);
        assertEquals(J11.brelan(), 7);
        assertEquals(J12.brelan(), 13);
        assertEquals(J13.brelan(), 0);
    }


    @Test
    public void suiteTest(){
        assertEquals(J13.suite(), 5);
        assertEquals(J14.suite(), 9);
        assertEquals(J15.suite(), 13);
        assertEquals(J12.suite(), 0);
    }

    @Test
    public void couleurTest(){
        assertEquals(J16.couleur(), LJ16);
        assertEquals(J17.couleur(), LJ17);
        assertEquals(J18.couleur(), LJ18);
        assertEquals(J15.couleur(), LVide);
    }

    @Test
    public void fullTest(){
        assertEquals(J19.full(), LJ19);
        assertEquals(J20.full(), LJ20);
        assertEquals(J21.full(), LJ21);
        assertEquals(J10.full(), LVide);
    }

    @Test
    public void carreTest(){
        assertEquals(J22.carre(), 1);
        assertEquals(J23.carre(), 3);
        assertEquals(J24.carre(), 9);
        assertEquals(J21.carre(), 0);
    }

    @Test
    public void quinteFlushTest(){
        assertEquals(J25.quinteFlush(), 8);
        assertEquals(J26.quinteFlush(), 10);
        assertEquals(J27.quinteFlush(), 13);
        assertEquals(J16.quinteFlush(), 0);
    }

    @Test
    public void niemePhc() {
    }
}