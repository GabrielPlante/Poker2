package Poker2;

import java.util.ArrayList;
import java.util.Scanner;

public class Enregistreur {
    public Enregistreur()
    {
        Scanner entree = new Scanner(System.in);
        String ligne = entree.nextLine();
        String[] preCarte = ligne.split(" ");
        for (String x:preCarte){
            int nombre = convertisseur_indice(Character.toString(x.charAt(0)));
            if (nombre == 0) System.exit(0);
            String couleur = x.substring(1, 3);
            if (!bonne_couleur(couleur)) System.exit(0);
            Poker2.Carte carte = new Poker2.Carte(nombre, couleur);
            if (check_doublons(carte)) System.exit(0);
            paquet.add(carte);
        }
    }
    public Enregistreur(ArrayList<Poker2.Carte> paquet_brut)//Pour les tests uniquements
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
    public boolean bonne_couleur(String couleur){
        if (couleur.equals("Co") || couleur.equals("Pi") || couleur.equals("Ca") || couleur.equals("Tr"))
            return true;
        return false;
    }

    public ArrayList<Carte> getPaquet(){
        return paquet;
    }

    private ArrayList<Carte> paquet = new ArrayList<Carte>();
}
