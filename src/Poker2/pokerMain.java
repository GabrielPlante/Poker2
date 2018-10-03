package Poker2;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.max;

public class pokerMain {
    public static void main(String[] args) {
        System.out.print("Main 1 : ");
        Joueur joueur1 = new Joueur(new Poker2.Enregistreur().getPaquet());//On crée les 2 joueurs avec les valeurs qu'on a
        System.out.print("Main 2 : ");
        Joueur joueur2 = new Joueur(new Poker2.Enregistreur().getPaquet());

        //On montre qui a gagné
        ValeurMain j1 = joueur1.valeur_main();
        ValeurMain j2 = joueur2.valeur_main();
        String gagnant = "La main ";
        if (j1.meilleur_que(j2) == 1) gagnant+=("1 gagne avec "+j1.combinaison()+(new Carte(j1.getValeurMain().get(1),"").valeur_to_indiceComplet()));
        else if (j1.meilleur_que(j2) == -1) gagnant+=("2 gagne avec "+j2.combinaison()+(new Carte(j2.getValeurMain().get(1),"").valeur_to_indiceComplet()));
        else gagnant = "Egalite";
        System.out.println(gagnant);
   }
}
