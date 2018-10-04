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
        if (brelan() !=0){
            x.add(brelan());
            return new ValeurMain(4, brelan(), nieme_phc(1, x), nieme_phc(2, x),0,0);
        }
        if (double_paire() != 0){
            x.add(double_paire());
            return new ValeurMain(3, double_paire(), nieme_phc(1, x), 0, 0, 0);
        }
        if (paire() != 0){
            x.add(paire());
            return new ValeurMain(2, paire(), nieme_phc(1, x), nieme_phc(2,x), nieme_phc(3,x), 0);
        }
        return new Poker2.ValeurMain(1, nieme_phc(1,x), nieme_phc(2,x), nieme_phc(3,x), nieme_phc(4,x), nieme_phc(5,x));
    }
    public int paire(){
        for (Carte y:main)
        {
            for (Carte x:main)
            {
                if (y.getNombre() == x.getNombre() && !y.getCouleur().equals(x.getCouleur()))//On regarde si c'est le meme getNombre et pas la meme getCouleur
                    return x.getNombre();
            }
        }
        return 0;
    }
    public int double_paire()
    {
        int a = 0, max = 0;// a:nombre de paires, max la valeur de la plus grande paire
        for (Carte y:main)
        {
            for (Carte x:main)
            {
                if (y.getNombre() == x.getNombre() && !y.getCouleur().equals(x.getCouleur()))
                {
                    if (y.getNombre() >= max)
                        max = y.getNombre();
                    ++a;
                }
            }
        }
        if (a == 4) //On teste chaque carte, donc s'il y a une paire, a == 2, si il y a 2 paire, a == 4
            return max;
        else return 0;//Sinon on revoit 0, qui sert de false
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
    public int nieme_phc(int n, ArrayList<Integer> nbr_a_enlever){
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
    private ArrayList<Carte> main = new ArrayList<>();
}
