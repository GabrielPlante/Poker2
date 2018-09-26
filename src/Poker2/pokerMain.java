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
        Carte carte_gagnante = new Carte(Math.max(joueur1.plus_haute_carte(), joueur2.plus_haute_carte()), "Pi");
        System.out.print("Le joueur "+(joueur1.plus_haute_carte()>joueur2.plus_haute_carte()?"1":"2")+" gagne avec carte la plus élevée : ");
        System.out.println(carte_gagnante.valeur_to_indiceComplet());
   }
}
