package Poker2;

import java.util.ArrayList;

public class ValeurMain {
    public ValeurMain(int val_princ, int val_sec, int val3, int val4, int val5, int val6){
        valeur.add(val_princ);
        valeur.add(val_sec);
        valeur.add(val3);
        valeur.add(val4);
        valeur.add(val5);
        valeur.add(val6);
    }
    public ArrayList<Integer> getValeurMain(){
        return valeur;
    }
    public int meilleur_que(ValeurMain autreMain){
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
            case 1: return "carte haute : ";
            case 2: return "paire de ";
            case 3: return "double paire de ";
            case 4: return "brelan de ";
            case 5: return "suite hauteur ";
            case 6: return "couleur de ";
            case 7: return "full aux ";
            case 8: return "carré de ";
            case 9: return "quinte flush hauteur ";
            default: return "C'est pas bon";
        }
    }
    private ArrayList<Integer> valeur = new ArrayList<>();
}
