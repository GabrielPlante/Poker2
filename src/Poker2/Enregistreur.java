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
            String sNombre = Character.toString(x.charAt(0));
            if (Character.toString(x.charAt(1)).equals("0")) sNombre = sNombre.concat("0");
            x = x.replace("0","");
            int nombre = convertisseurIndice(sNombre);
            if (nombre == 0) System.exit(0);
            String couleur = x.substring(1, 3);
            if (!bonneCouleur(couleur)) System.exit(0);
            Carte carte = new Carte(nombre, couleur);
            if (checkDoublons(carte)) System.exit(0);
            paquet.add(carte);
        }
    }
    public Enregistreur(ArrayList<Carte> paquet_brut)//Pour les tests uniquements
    {
        paquet = paquet_brut;
    }
    public int convertisseurIndice(String indice){
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

    public boolean checkDoublons(Carte carte){
        for (Carte x:paquet)
            if (x.getNombre() == carte.getNombre() && x.getCouleur().equals(carte.getCouleur()))
                return true;
        return false;
    }
    public boolean bonneCouleur(String couleur){
        if (couleur.equals("Co") || couleur.equals("Pi") || couleur.equals("Ca") || couleur.equals("Tr"))
            return true;
        return false;
    }

    public ArrayList<Carte> getPaquet(){
        return paquet;
    }

    private ArrayList<Carte> paquet = new ArrayList<Carte>();
}
