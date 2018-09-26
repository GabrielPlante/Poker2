package Poker2;
import java.util.ArrayList;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet)//Le constructeur
    {
        cartes.add(paquet.get(0));
        paquet.remove(0);
    }
    public int plus_haute_carte()
    {
        int x = 0;
        for (Carte y:cartes)//simple
            if (y.nombre > x) x = y.nombre;
        return x;
    }
    private ArrayList<Carte> cartes = new ArrayList<>();//La liste qui contient les cartes de la main du joueur
}
