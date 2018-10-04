package Poker2;
import java.util.*;

public class Joueur {
    private ArrayList<Carte> main = new ArrayList<>();
    public Joueur(ArrayList<Carte> paquet){
        for (int i = 0; i != 5; ++i){
            main.add(paquet.get(0));
            paquet.remove(0);
        }
    }

    public int paire(){
        for (Carte y:main)
        {
            for (Carte x:main)
            {
                if (y.aMemeValeur(x) && y.estPasMemeCarte(x))
                    return x.getNombre();
            }
        }
        return 0;
    }
    public List<Integer> doublePaire()
    {
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> vide = new ArrayList<Integer>();
        for (Carte y:main)
        {
            for (Carte x:main)
            {
                if (x.estPasMemeCarte(y) && x.aMemeValeur(y) &&
                !res.contains(x.getNombre()))
                    res.add(x.getNombre());
            }
        }
        if (res.size() > 1) { //si on a bien trouvé deux paires
            Collections.sort(res);
            Collections.reverse(res);
            return res;
        }
        return vide;
    }
    public int brelan()//Systeme different que paire, on s'assure que chaque carte (i, j, et k) soient differentes
    {
        for (int i = 0; i!=main.size()-2;++i)
        {
            for (int j = i+1; j < main.size(); ++j)
            {
                for (int k = j+1; k < main.size(); ++k)
                {
                    if (main.get(i).getNombre() == main.get(j).getNombre() && main.get(j).getNombre() == main.get(k).getNombre())
                        return main.get(i).getNombre();
                }
            }
        }
        return 0;
    }
    public int suite() {
        int min = 14;
        int carteAdjacente = 0;
        for (Carte y : main) {
            if (y.getNombre() < min) min = y.getNombre();
        }
        for (int i = min + 1; i <= min + 4; i++) {
            for (Carte y : main) {
                if (y.getNombre() == i) {
                    carteAdjacente += 1;
                    break;
                }
            }
        }
        if (carteAdjacente == 4) return min+4;
        return 0;
    }
        public int niemePhc(int n, ArrayList<Integer> nbr_a_enlever){
        ArrayList<Integer> liste_temp = new ArrayList<>();//On crée une liste temporaire
        for (Carte y:main){
            boolean add = true;
            for (Integer z:nbr_a_enlever)
                if (z==y.getNombre())
                    add = false;
            if (add) liste_temp.add(y.getNombre());
        }
        if (n > liste_temp.size() || n < 1)//On regarde si n est valide
            return 0;
        Collections.sort(liste_temp);//On trie la liste
        return liste_temp.get(liste_temp.size()-n);
    }
    public ArrayList<Carte> getMain(){
        return main;
    }
}
