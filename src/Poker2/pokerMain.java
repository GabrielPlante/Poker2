package Poker2;
import java.util.ArrayList;
import java.util.Scanner;

public class pokerMain {
    public static void main(String[] args) {
        System.out.println("Les cartes sont comprises entre 2 et 14, V, D, R, A sont acceptés");//Informations donnees a l'utilisateur
        System.out.println("Entrez les cartes pour le joueur 1 :");
        ArrayList<Carte> paquet = new ArrayList<Carte>();//on cree la liste de carte

        while (paquet.size() < 10)
        {
            if (paquet.size() == 5) System.out.println("Entrez les cartes pour le joueur 2 :");//Si on a finis d'entrer les cartes du premier joueur,
            System.out.println("Carte n° "+(paquet.size()+(paquet.size()<5?1:-4)));//On passe au carte du deuxieme
            System.out.print("Valeur : ");//On affiche à quelle carte on se trouve
            Scanner sc_nombre = new Scanner(System.in);//Permet de recuperer la valeur donnee par l'utilisateur
            String indice = sc_nombre.nextLine();
            int nombre = 0;
            switch (indice) {
                case "V":
                    nombre = 10;
                    break;
                case "D":
                    nombre = 11;
                    break;
                case "R":
                    nombre = 12;
                    break;
                case "A":
                    nombre = 13;
                    break;
                default:
                    try {
                        nombre = Integer.parseInt(indice);
                        --nombre;
                    } catch (NumberFormatException e){
                        System.out.println("Valeur invalide");
                        continue;
                    }
            }
            if (nombre < 1 || nombre > 13){
                System.out.println("Valeur invalide");
                continue;
            }
            String couleur = "Pi";
            boolean nouvelle = true;
            for (Carte x:paquet)//On verifie que la carte introduite ne soit pas un doublon
                if (x.nombre == nombre && x.couleur.equals(couleur))
                    nouvelle = false;//Si c'est le cas, on l'indique
            if (!nouvelle)
            {
                System.out.println("Erreur : 2 cartes indentiques");
                continue;//Si ce n'est pas une nouvelle carte, on passe au tour de boucle suivant
            }
            paquet.add(new Carte(nombre, couleur));
        }

        System.out.print("Main 1: ");
        Joueur joueur1 = new Joueur(paquet);//Initialisation du joueur 1 et 2
        System.out.println("");
        System.out.print("Main 2: ");
        Joueur joueur2 = new Joueur(paquet);
        System.out.println("");

        int j1 = joueur1.plus_haute_carte(), j2 = joueur2.plus_haute_carte();
        String gagnant = "La main ";
        if (j1 > j2) gagnant += "1 gagne avec "+Joueur.combinaisons(j1)+Joueur.valeur_to_indiceComplet(((j1-1)%13)+1);
        else if (j2 > j1) gagnant += "2 gagne avec "+Joueur.combinaisons(j2)+Joueur.valeur_to_indiceComplet(((j2-1)%13)+1);
        else gagnant = "Egalite";
        System.out.print(gagnant);
    }
}
