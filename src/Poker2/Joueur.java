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
        ArrayList<Integer> x = new ArrayList<>();
        if (paire() != 0){
            x.add(paire());
            return new ValeurMain(2, paire(), nieme_phc(1, x), nieme_phc(2,x), nieme_phc(3,x), 0);
        }
        return new ValeurMain(1, nieme_phc(1,x), nieme_phc(2,x), nieme_phc(3,x), nieme_phc(4,x), nieme_phc(5,x));
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
    public int nieme_phc(int n, ArrayList<Integer> nbr_a_enlever){
        ArrayList<Integer> liste_temp = new ArrayList<>();//On crée une liste temporaire
        for (Carte y:main){
            boolean add = true;
            for (Integer z:nbr_a_enlever)
                if (z==y.nombre)
                    add = false;
            if (add) liste_temp.add(y.nombre);
        }
        if (n > liste_temp.size() || n < 1)//On regarde si n est valide
            return 0;
        Collections.sort(liste_temp);//On trie la liste
        return liste_temp.get(liste_temp.size()-n);
    }
    public ArrayList<Carte> getMain(){
        return main;
    }
    private ArrayList<Carte> main = new ArrayList<>();
}
