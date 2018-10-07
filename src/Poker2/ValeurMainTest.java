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

    //@Before
    // On déclare et affecte les variables en même temps pour limiter le nombre de lignes, d'où le @Before qui est mis en commentaires
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

    //--------------------------------------------------------------------------------------------------------------
    //On introduit la valeur des mains -----------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------

    //Hauteur ------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ1 = new ValeurMain(J1);
    private ValeurMain VMJ2 = new ValeurMain(J2);
    private ValeurMain VMJ3 = new ValeurMain(J3);

    //Paire --------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ4 = new ValeurMain(J4);
    private ValeurMain VMJ5 = new ValeurMain(J5);
    private ValeurMain VMJ6 = new ValeurMain(J6);

    //Double Paire -------------------------------------------------------------------------------------------------
    private ValeurMain VMJ7 = new ValeurMain(J7);
    private ValeurMain VMJ8 = new ValeurMain(J8);
    private ValeurMain VMJ9 = new ValeurMain(J9);

    //Brelan -------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ10 = new ValeurMain(J10);
    private ValeurMain VMJ11 = new ValeurMain(J11);
    private ValeurMain VMJ12 = new ValeurMain(J12);

    //Suite --------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ13 = new ValeurMain(J13);
    private ValeurMain VMJ14 = new ValeurMain(J14);
    private ValeurMain VMJ15 = new ValeurMain(J15);

    //Couleur ------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ16 = new ValeurMain(J16);
    private ValeurMain VMJ17 = new ValeurMain(J17);
    private ValeurMain VMJ18 = new ValeurMain(J18);

    //Full ---------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ19 = new ValeurMain(J19);
    private ValeurMain VMJ20 = new ValeurMain(J20);
    private ValeurMain VMJ21 = new ValeurMain(J21);

    //Carré --------------------------------------------------------------------------------------------------------
    private ValeurMain VMJ22 = new ValeurMain(J22);
    private ValeurMain VMJ23 = new ValeurMain(J23);
    private ValeurMain VMJ24 = new ValeurMain(J24);

    //Quinte Flush -------------------------------------------------------------------------------------------------
    private ValeurMain VMJ25 = new ValeurMain(J25);
    private ValeurMain VMJ26 = new ValeurMain(J26);
    private ValeurMain VMJ27 = new ValeurMain(J27);

    // -------------------------------------------------------------------------------------------------------------
    //ArrayList égales aux valeurs des mains des joueurs -----------------------------------------------------------
    // -------------------------------------------------------------------------------------------------------------

    //Hauteur
    private ArrayList<Integer> VMJ1Modele = new ArrayList<>(Arrays.asList(1, 9, 8, 7, 4, 3));
    private ArrayList<Integer> VMJ2Modele = new ArrayList<>(Arrays.asList(1, 12, 9, 5, 3, 2));
    private ArrayList<Integer> VMJ3Modele = new ArrayList<>(Arrays.asList(1, 13, 8, 7, 6, 5));

    //Paire
    private ArrayList<Integer> VMJ4Modele = new ArrayList<>(Arrays.asList(2, 3, 13, 8, 5, 0));
    private ArrayList<Integer> VMJ5Modele = new ArrayList<>(Arrays.asList(2, 7, 12, 10, 8, 0));
    private ArrayList<Integer> VMJ6Modele = new ArrayList<>(Arrays.asList(2, 10, 12, 9, 3, 0));

    //Double Paire
    private ArrayList<Integer> VMJ7Modele = new ArrayList<>(Arrays.asList(3, 6, 5, 11, 0, 0));
    private ArrayList<Integer> VMJ8Modele = new ArrayList<>(Arrays.asList(3, 10, 8, 12, 0, 0));
    private ArrayList<Integer> VMJ9Modele = new ArrayList<>(Arrays.asList(3, 12, 10, 8, 0, 0));

    //Brelan
    private ArrayList<Integer> VMJ10Modele = new ArrayList<>(Arrays.asList(4, 1, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ11Modele = new ArrayList<>(Arrays.asList(4, 7, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ12Modele = new ArrayList<>(Arrays.asList(4, 13, 0, 0, 0, 0));

    //Suite
    private ArrayList<Integer> VMJ13Modele = new ArrayList<>(Arrays.asList(5, 5, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ14Modele = new ArrayList<>(Arrays.asList(5, 9, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ15Modele = new ArrayList<>(Arrays.asList(5, 13, 0, 0, 0, 0));

    //Couleur
    private ArrayList<Integer> VMJ16Modele = new ArrayList<>(Arrays.asList(6, 7, 6, 4, 2, 1));
    private ArrayList<Integer> VMJ17Modele = new ArrayList<>(Arrays.asList(6, 9, 6, 4, 3, 1));
    private ArrayList<Integer> VMJ18Modele = new ArrayList<>(Arrays.asList(6, 10, 8, 5, 4, 2));

    //Full
    private ArrayList<Integer> VMJ19Modele = new ArrayList<>(Arrays.asList(7, 3, 13, 0, 0, 0));
    private ArrayList<Integer> VMJ20Modele = new ArrayList<>(Arrays.asList(7, 6, 5, 0, 0, 0));
    private ArrayList<Integer> VMJ21Modele = new ArrayList<>(Arrays.asList(7, 11, 1, 0, 0, 0));

    //Carré
    private ArrayList<Integer> VMJ22Modele = new ArrayList<>(Arrays.asList(8, 1, 5, 0, 0, 0));
    private ArrayList<Integer> VMJ23Modele = new ArrayList<>(Arrays.asList(8, 3, 13, 0, 0, 0));
    private ArrayList<Integer> VMJ24Modele = new ArrayList<>(Arrays.asList(8, 9, 2, 0, 0, 0));

    //Quinte Flush
    private ArrayList<Integer> VMJ25Modele = new ArrayList<>(Arrays.asList(9, 8, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ26Modele = new ArrayList<>(Arrays.asList(9, 10, 0, 0, 0, 0));
    private ArrayList<Integer> VMJ27Modele = new ArrayList<>(Arrays.asList(9, 13, 0, 0, 0, 0));


    @Test
    public void valeurMainTest(){
        assertEquals(VMJ1.getValeurMain(), VMJ1Modele);
        assertEquals(VMJ2.getValeurMain(), VMJ2Modele);
        assertEquals(VMJ3.getValeurMain(), VMJ3Modele);
        assertEquals(VMJ4.getValeurMain(), VMJ4Modele);
        assertEquals(VMJ5.getValeurMain(), VMJ5Modele);
        assertEquals(VMJ6.getValeurMain(), VMJ6Modele);
        assertEquals(VMJ7.getValeurMain(), VMJ7Modele);
        assertEquals(VMJ8.getValeurMain(), VMJ8Modele);
        assertEquals(VMJ9.getValeurMain(), VMJ9Modele);
        assertEquals(VMJ10.getValeurMain(), VMJ10Modele);
        assertEquals(VMJ11.getValeurMain(), VMJ11Modele);
        assertEquals(VMJ12.getValeurMain(), VMJ12Modele);
        assertEquals(VMJ13.getValeurMain(), VMJ13Modele);
        assertEquals(VMJ14.getValeurMain(), VMJ14Modele);
        assertEquals(VMJ15.getValeurMain(), VMJ15Modele);
        assertEquals(VMJ16.getValeurMain(), VMJ16Modele);
        assertEquals(VMJ17.getValeurMain(), VMJ17Modele);
        assertEquals(VMJ18.getValeurMain(), VMJ18Modele);
        assertEquals(VMJ19.getValeurMain(), VMJ19Modele);
        assertEquals(VMJ20.getValeurMain(), VMJ20Modele);
        assertEquals(VMJ21.getValeurMain(), VMJ21Modele);
        assertEquals(VMJ22.getValeurMain(), VMJ22Modele);
        assertEquals(VMJ23.getValeurMain(), VMJ23Modele);
        assertEquals(VMJ24.getValeurMain(), VMJ24Modele);
        assertEquals(VMJ25.getValeurMain(), VMJ25Modele);
        assertEquals(VMJ26.getValeurMain(), VMJ26Modele);
        assertEquals(VMJ27.getValeurMain(), VMJ27Modele);
    }

    @Test
    public void meilleurQueTest() {
        assertEquals(VMJ1.meilleureQue(VMJ2),-1);
        assertEquals(VMJ3.meilleureQue(VMJ4),-1);
        assertEquals(VMJ5.meilleureQue(VMJ6),-1);
        assertEquals(VMJ7.meilleureQue(VMJ8),-1);
        assertEquals(VMJ9.meilleureQue(VMJ10),-1);
        assertEquals(VMJ11.meilleureQue(VMJ12),-1);
        assertEquals(VMJ13.meilleureQue(VMJ14),-1);
        assertEquals(VMJ15.meilleureQue(VMJ16),-1);
        assertEquals(VMJ17.meilleureQue(VMJ18),-1);
        assertEquals(VMJ20.meilleureQue(VMJ19),1);
        assertEquals(VMJ19.meilleureQue(VMJ19),0);
        assertEquals(VMJ1.meilleureQue(VMJ1),0);
        assertEquals(VMJ21.meilleureQue(VMJ20),1);
        assertEquals(VMJ22.meilleureQue(VMJ21),1);
        assertEquals(VMJ24.meilleureQue(VMJ23),1);
        assertEquals(VMJ26.meilleureQue(VMJ25),1);
        assertEquals(VMJ27.meilleureQue(VMJ1),1);
        assertEquals(VMJ23.meilleureQue(VMJ21),1);
        assertEquals(VMJ3.meilleureQue(VMJ8),-1);
    }
}

