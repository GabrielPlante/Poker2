package Poker2;
import java.util.ArrayList;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet){
        for (int i = 0; i != 5; ++i){
            main.add(paquet.get(0));
            paquet.remove(0);
        }
    }
    public int plus_haute_carte() {
        int max = 0;
        for (Carte x:main)
            if (x.nombre > max)
                max = x.nombre;
        return max;
    }
    public ArrayList<Carte> getMain(){
        return main;
    }
    private ArrayList<Carte> main = new ArrayList<>();
}
