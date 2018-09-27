package Poker2;
import java.util.*;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet){
        for (int i = 0; i != 5; ++i){
            main.add(paquet.get(0));
            paquet.remove(0);
        }
    }
    public ValeurMain valeur_main(){
        if (paire() != 0){
            return new ValeurMain(2, paire(), nieme_phc(3), nieme_phc(4), nieme_phc(5), 0);
        }
        return new ValeurMain(1, nieme_phc(1), nieme_phc(2), nieme_phc(3), nieme_phc(4), nieme_phc(5));
    }
    public int paire(){
        for (Carte y:main)
        {
            for (Carte x:main)
            {
                if (y.nombre == x.nombre && !y.couleur.equals(x.couleur))//On regarde si c'est le meme nombre et pas la meme couleur
                    return x.nombre;
            }
        }
        return 0;
    }
    public int nieme_phc(int n){
        if (n > 5 || n < 1)
            return 0;
        ArrayList<Integer> liste_trie = new ArrayList<>();
        for (Carte x:main){
            liste_trie.add(x.nombre);
        }
        Collections.sort(liste_trie);
        return liste_trie.get(5-n);
    }
    public ArrayList<Carte> getMain(){
        return main;
    }
    private ArrayList<Carte> main = new ArrayList<>();
}
