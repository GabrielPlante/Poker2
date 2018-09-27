package Poker2;

import java.util.ArrayList;
import java.util.Scanner;

public class Enregistreur {
    public Enregistreur()
    {
        System.out.println("Les cartes sont comprises entre 2 et 14. V, D, R, A sont acceptés");//Informations donnees a l'utilisateur
        System.out.println("Entrer les cartes du joueur 1 :");
        while (paquet.size() < 10)
        {
            if (paquet.size() == 5) System.out.println("Entrer les cartes du joueur 2 :");
            System.out.print("Carte n° "+(paquet.size()+(paquet.size()<5?1:-4))+" : ");//On passe au carte du deuxieme
            Scanner sc_nombre = new Scanner(System.in);
            String indice = sc_nombre.nextLine();
            int nombre = convertisseur_indice(indice);
            if (nombre == 0){
                System.out.println("Valeur d'indice incorrecte !");
                continue;
            }
            Carte carte = new Carte(nombre, "Pi");
            if (check_doublons(carte)){
                System.out.println("Cette carte est déjà dans le paquet !");
                continue;
            }
            paquet.add(new Carte(nombre, "Pi"));
        }
    }
    public Enregistreur(ArrayList<Carte> paquet_brut)//Pour les tests uniquements
    {
        paquet = paquet_brut;
    }
    public int convertisseur_indice(String indice){
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
                    return 0;
                }
        }
        if (nombre < 1 || nombre > 13)
            return 0;
        return nombre;
    }

    public boolean check_doublons(Carte carte){
        for (Carte x:paquet)
            if (x.nombre == carte.nombre && x.couleur.equals(carte.couleur))
                return true;
        return false;
    }

    public ArrayList<Carte> getPaquet(){
        return paquet;
    }

    private ArrayList<Carte> paquet = new ArrayList<Carte>();
}
