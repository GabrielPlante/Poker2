package Poker2;
import java.util.ArrayList;
import java.util.Scanner;

public class pokerMain {
    public static void main(String[] args) {
        System.out.println("Les cartes sont comprises entre 2 et 14, V, D, R, A sont acceptés");//Informations donnees a l'utilisateur
        System.out.println("Entrez la carte pour le joueur 1 :");
        ArrayList<Carte> paquet = new ArrayList<Carte>();//on cree la liste de carte

        while (paquet.size() < 2)
        {
            if (paquet.size() == 1) System.out.println("Entrez la carte pour le joueur 2 :");//Si on a finis d'entrer les cartes du premier joueur,
            System.out.println("Carte n°1");//On passe au carte du deuxieme
            System.out.print("Nombre : ");//On affiche à quelle carte on se trouve
            Scanner sc_nombre = new Scanner(System.in);//Permet de recuperer la valeur donnee par l'utilisateur
            int nombre = sc_nombre.nextInt();
            String couleur = "Pi";
            paquet.add(new Carte(nombre, couleur));
        }
        Joueur joueur1 = new Joueur(paquet);
        Joueur joueur2 = new Joueur(paquet);
        String gagnant = "Le joueur ";
        System.out.println(joueur1.plus_haute_carte() > joueur2.plus_haute_carte() ? gagnant+"1 gagne !" : gagnant+"2 gagne !");
    }
}
