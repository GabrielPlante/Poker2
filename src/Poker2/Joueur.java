package Poker2;
import java.util.ArrayList;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet){
        carte = paquet.get(0);
        paquet.remove(0);
    }
    public int plus_haute_carte() {
        return carte.nombre;
    }
    public Carte getMain(){
        return carte;
    }
    private Carte carte;
}
