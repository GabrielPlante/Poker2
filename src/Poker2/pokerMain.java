package Poker2;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.max;

public class pokerMain {
    public static void main(String[] args) {
        Enregistreur paquet = new Enregistreur();//On demande les valeurs
        Joueur joueur1 = new Joueur(paquet.getPaquet());//On crée les 2 joueurs avec les valeurs qu'on a
        Joueur joueur2 = new Joueur(paquet.getPaquet());

        //On affiche les mains des 2 joueurs
        System.out.print("Main 1 : ");
        for (Carte x:joueur1.getMain())
            System.out.print(x.valeur_to_indiceMin()+x.couleur+" ");
        System.out.println();
        System.out.print("Main 2 : ");
        for (Carte x:joueur2.getMain())
            System.out.print(x.valeur_to_indiceMin()+x.couleur+" ");
        System.out.println();

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
