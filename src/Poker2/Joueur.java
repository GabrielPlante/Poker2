package Poker2;
import java.util.*;

public class Joueur {
    public Joueur(ArrayList<Carte> paquet){
        for (int i = 0; i != 5; ++i){
            main.add(paquet.get(0));
            paquet.remove(0);
        }
    }
    public void setKicker(ArrayList<Carte> kicker)
    {
        this.kicker = kicker;
    }
    public ValeurMain valeur_main(){
        if (paire() != 0){
            for (Carte x:main) {
                if (paire() != x.nombre)
                    kicker.add(x);
            }
            return new ValeurMain(2, paire(), nieme_phc(1), nieme_phc(2), nieme_phc(3), 0);
        }
        for (Carte x:main)
        {
                kicker.add(x);
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
        kicker.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println("kicker.size == " + kicker.size());
        System.out.println("kicker -> " + kicker);
        int indice = kicker.size() - n;
        System.out.println("indice => "+ indice);
        Carte temp = kicker.get(indice);
        System.out.println(temp);
        return temp.nombre;
    }
    public ArrayList<Carte> getMain(){
        return main;
    }
    private ArrayList<Carte> main = new ArrayList<>();
    private ArrayList<Carte> kicker = new ArrayList<>();
}
