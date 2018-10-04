package Poker2;

import java.util.ArrayList;

public class ValeurMain {
    private ArrayList<Integer> valeur = new ArrayList<>();
    public ArrayList<Integer> getValeurMain(){
        return valeur;
    }
    public ValeurMain(Joueur joueur) {
        ArrayList<Integer> x = new ArrayList<>();
        if (joueur.quinteFlush() != 0){
            valeur.add(9);
            valeur.add(joueur.quinteFlush());
        }else if (joueur.carre() !=0){
            x.add(joueur.carre());
            valeur.add(8);
            valeur.add(joueur.carre());
            valeur.add(joueur.niemePhc(1, x));
        }else if (joueur.full().size() > 0){
            valeur.add(7);
            valeur.add(joueur.full().get(0));
            valeur.add(joueur.full().get(1));
        }else if (joueur.couleur().size() > 0) {
            valeur.add(6);
            for (Integer n: joueur.couleur())
                valeur.add(n);
        }else if (joueur.suite() !=0){
            x.add(joueur.suite());
            valeur.add(5);
            valeur.add(joueur.suite());
        }else if (joueur.brelan() !=0){
            x.add(joueur.brelan());
            valeur.add(4);
            valeur.add(joueur.brelan());
        } else if (joueur.doublePaire().size() == 2){
            x.add(joueur.doublePaire().get(0));
            x.add(joueur.doublePaire().get(1));
            valeur.add(3);
            valeur.add(joueur.doublePaire().get(0));
            valeur.add(joueur.doublePaire().get(1));
            valeur.add(joueur.niemePhc(1,x));

        } else if (joueur.paire() != 0){
            x.add(joueur.paire());
            valeur.add(2);
            valeur.add(joueur.paire());
            valeur.add(joueur.niemePhc(1,x));
            valeur.add(joueur.niemePhc(2,x));
            valeur.add(joueur.niemePhc(3,x));
        }
        else{
            valeur.add(1);
            valeur.add(joueur.niemePhc(1,x));
            valeur.add(joueur.niemePhc(2,x));
            valeur.add(joueur.niemePhc(3,x));
            valeur.add(joueur.niemePhc(4,x));
            valeur.add(joueur.niemePhc(5,x));
        }
        while(valeur.size() < 6)
            valeur.add(0);
    }

    public int meilleureQue(ValeurMain autreMain){
        for (int i = 0; i!=6; ++i){
            if (getValeurMain().get(i) > autreMain.getValeurMain().get(i))
                return 1;
            else if (getValeurMain().get(i) < autreMain.getValeurMain().get(i))
                return -1;
        }
        return 0;
    }
    public String combinaison(){
        switch (valeur.get(0))
        {
            case 1: return "hauteur ";
            case 2: return "paire de ";
            case 3: return "double paire de ";
            case 4: return "brelan de ";
            case 5: return "suite hauteur ";
            case 6: return "couleur hauteur ";
            case 7: return "full aux ";
            case 8: return "carré de ";
            case 9: return "quinte flush hauteur ";
            default: return "Erreur";
        }
    }
}
