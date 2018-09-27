package Poker2;

import java.util.ArrayList;

public class ValeurMain {
    public ValeurMain(int val_princ, int val_sec, int val3, int val4, int val5, int val6){
        valeur_principale = val_princ;
        valeur_secondaire = val_sec;
        valeur3 = val3;
        valeur4 = val4;
        valeur5 = val5;
        valeur6 = val6;
    }
    public ArrayList<Integer> getValeurMain(){
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(valeur_principale);
        liste.add(valeur_secondaire);
        liste.add(valeur3);
        liste.add(valeur4);
        liste.add(valeur5);
        liste.add(valeur6);
        return liste;
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
        switch (valeur_principale)
        {
            case 1: return "carte la plus élevée : ";
            case 2: return "paire de ";
            case 3: return "double paire de ";
            case 4: return "brelan de ";
            case 5: return "suite de ";
            case 6: return "couleur de ";
            case 7: return "full de ";
            case 8: return "carre de ";
            case 9: return "quinte flush de ";
            default: return "C'est pas bon";
        }
    }
    private int valeur_principale;
    private int valeur_secondaire;
    private int valeur3;
    private int valeur4;
    private int valeur5;
    private int valeur6;
}
