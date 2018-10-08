package test;

import org.junit.Test;
import poker2.Carte;
import poker2.Enregistreur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class EnregistreurTest {
    private ArrayList<Carte> creerPaquet(List<Integer> liste_nbr, List<String> liste_col) {
        ArrayList<Carte> paquet = new ArrayList<>();
        for (int i = 0; i != 5; ++i)
            paquet.add(new Carte(liste_nbr.get(i), liste_col.get(i)));
        return paquet;
    }
    private ArrayList<Integer> J1ValeurCarte = new ArrayList<>(Arrays.asList(3, 4, 7, 8, 9));
    private ArrayList<String> J1FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Enregistreur J1 = new Enregistreur(creerPaquet(J1ValeurCarte, J1FamilleCarte));

    private ArrayList<Integer> J2ValeurCarte = new ArrayList<>(Arrays.asList(8, 12, 7, 10, 7));
    private ArrayList<String> J2FamilleCarte = new ArrayList<>(Arrays.asList("Pi", "Co", "Ca", "Tr", "Pi"));
    private Enregistreur J2 = new Enregistreur(creerPaquet(J2ValeurCarte, J2FamilleCarte));

    @Test
    public void extraireCouleur(){
        assertEquals(J1.extraireCouleur("Pi"), "Pi");
        assertEquals(J1.extraireCouleur("PI"), "Pi");
        assertEquals(J1.extraireCouleur("pI"), "Pi");
        assertEquals(J1.extraireCouleur("pi"), "Pi");
        String t1 = "";
        try { J1.extraireCouleur("Z"); }
        catch (RuntimeException e) { t1 = e.getMessage(); }
        assertEquals(t1, "La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
        String t2 = "";
        try { J1.extraireCouleur("IP"); }
        catch (RuntimeException e) { t2 = e.getMessage(); }
        assertEquals(t2, "La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
    }

    @Test
    public void convertisseurIndice() {
        assertEquals(J1.convertisseurIndice("D"), 11);
        assertEquals(J1.convertisseurIndice("A"), 13);
        assertEquals(J1.convertisseurIndice("2"), 1);
        String t1 = "";
        try { J1.convertisseurIndice("Z"); }
        catch (RuntimeException e) { t1 = e.getMessage(); }
        assertEquals(t1, "La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
        String t2 = "";
        try { J1.convertisseurIndice("DA"); }
        catch (RuntimeException e) { t2 = e.getMessage(); }
        assertEquals(t2, "La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
        String t3 = "";
        try { J1.convertisseurIndice("15"); }
        catch (RuntimeException e) { t3 = e.getMessage(); }
        assertEquals(t3,"La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
    }

    @Test
    public void checkDoublons(){
        assertEquals(J1.checkDoublons(new Carte(4, "Co")), true);
        assertEquals(J1.checkDoublons(new Carte(4, "Pi")), false);
    }

    //bonneCouleur déjà testé au travers de extraireCouleur()
}
