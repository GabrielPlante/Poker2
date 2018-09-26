package Poker2;
import java.util.ArrayList;
import java.util.Scanner;

public class pokerMain {
    public static void main(String[] args) {
        Enregistreur paquet = new Enregistreur();//On demande les valeurs
        Joueur joueur1 = new Joueur(paquet.getPaquet());//On crée les 2 joueurs avec les valeurs qu'on a
        Joueur joueur2 = new Joueur(paquet.getPaquet());
        System.out.println("Main 1 : "+joueur1.getMain().nombre+joueur1.getMain().couleur);//On affiche les mains des 2 joueurs
        System.out.println("Main 2 : "+joueur2.getMain().nombre+joueur2.getMain().couleur);
        System.out.println("Le joueur "+(joueur1.plus_haute_carte() > joueur2.plus_haute_carte()?"1":"2")+" gagne !");//On dit qui a gagné
   }
}
