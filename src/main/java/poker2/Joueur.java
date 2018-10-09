package poker2;
import java.util.*;

public class Joueur {
    private ArrayList<Carte> main = new ArrayList<>();
    public ArrayList<Carte> getMain(){ return main;}
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
            if(res.get(0)<res.get(1)) Collections.reverse(res);
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
        int max = 0;//Pour tester la suite 1 2 3 4 5
        int carteAdjacente = 0;
        for (Carte y : main) {
            if (y.getNombre() < min) min = y.getNombre();
            if (y.getNombre() > max) max = y.getNombre();
        }
        if (max == 13 && min != 9) min = 0;//Si il y a un as qui n'est pas le bout de la suite 10 V D R A?
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
    public List<Integer> couleur()//On regarde si la couleur des 4 dernières cartes est la même que la dernière
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        String couleurReference = main.get(0).getCouleur();
        for (int i=1; i < main.size(); i++){
            if (!(main.get(i).getCouleur().equals(couleurReference))) break;
            if (i == main.size()-1){
                for (Carte c: main)
                    res.add(c.getNombre());
                Collections.sort(res);
                Collections.reverse(res);
            }
        }
        return res;
    }

    public List<Integer> full()//On teste si il y a un brelan et une paire, et qu'il soit de nombre different
    {
        List<Integer> res = new ArrayList<Integer>();
        if (brelan() != 0)
            for (Carte x:main)
                for (Carte y:main)
                    if (x.aMemeValeur(y) && !x.estMemeCouleur(y) && x.getNombre() != brelan()
                    && !res.contains(x.getNombre())){
                        res.add(brelan());
                        res.add(x.getNombre());
                    }
        return res;
    }
    public int carre()//On teste chaque nombre s'il est 4 fois dans la main
    {
        for (int n = 1; n!= 14; ++n)
        {
            int nombreOccurence = 0;
            for (Carte x:main)
            {
                if (x.getNombre() == n)
                    ++nombreOccurence;
            }
            if (nombreOccurence == 4)
                return n;
        }
        return 0;
    }

    public int quinteFlush()
    {
        if (suite() != 0 && couleur().size() > 0)
            return suite();
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
    public void checkDoublons(Joueur autreJoueur){
        for (Carte x:main)
            for (Carte y:autreJoueur.getMain())
                if (x.equals(y))
                    throw new RuntimeException("Une carte au moins a été utilisée plusieurs fois");
    }
}
