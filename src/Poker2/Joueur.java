package Poker2;
import java.util.ArrayList;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet)//Le constructeur
    {
        for (int i = 0; i!=5; ++i)
        {
            cartes.add(paquet.get(0));
            paquet.remove(0);
        }
        for (Carte y:cartes){
            System.out.print(Joueur.valeur_to_indiceDim(y.nombre)+y.couleur+" "); // Pour l'affichage de la main
        }
    }
    public int plus_haute_carte()
    {
        int x = 0;
        for (Carte y:cartes)//simple
            if (y.nombre > x) x = y.nombre;
        return x;
    }
    public static String combinaisons(int x) {//Permet de savoir avec la valeur de valeur_main à quoi on a affaire
        x = (x-1)/13;
        switch (x)
        {
            case 0: return "carte la plus élevée : ";
            case 1: return "paire de ";
            case 2: return "double paire de ";
            case 3: return "brelan de ";
            case 4: return "suite de ";
            case 5: return "couleur de ";
            case 6: return "full de ";
            case 7: return "carre de ";
            case 8: return "quinte flush de ";
            default: return "C'est pas bon";
        }
    }
    public static String valeur_to_indiceDim(int x) //Pour transformer la valeur en la l'indice du diminutif de la carte
    {
        if (x < 10)
            return Integer.toString(x+1);
        switch (x)
        {
            case 10: return "V";
            case 11: return "D";
            case 12: return "R";
            case 13: return "A";
            default: return "C'est pas bon";
        }
    }
    public static String valeur_to_indiceComplet(int x) //Pour transformer la valeur en la l'indice complet de la carte
    {
        if (x < 10)
            return Integer.toString(x+1);
        switch (x)
        {
            case 10: return "Valet";
            case 11: return "Dame";
            case 12: return "Roi";
            case 13: return "As";
            default: return "C'est pas bon";
        }
    }
    private ArrayList<Carte> cartes = new ArrayList<>();//La liste qui contient les cartes de la main du joueur
}
