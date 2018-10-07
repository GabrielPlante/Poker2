package Poker2;

import java.util.ArrayList;
import java.util.Scanner;

public class Enregistreur {
    private ArrayList<Carte> paquet = new ArrayList<Carte>();
    public ArrayList<Carte> getPaquet(){
        return paquet;
    }
    public Enregistreur()
    {
        Scanner entree = new Scanner(System.in);
        String ligne = entree.nextLine();
        String[] preCarte = ligne.split("[ \t]");
        for (String x:preCarte){
            if (x.length() < 3)//Gestion du cas des espaces multiples générant des chaines vides
                continue;
            String sNombre = Character.toString(x.charAt(0));
            if (Character.toString(x.charAt(1)).equals("0")) sNombre = sNombre.concat("0");//Gestion du 10, seulle cartes prenant 2 caractères pour l'indice
            x = x.replace("0","");
            int nombre = convertisseurIndice(sNombre);

            String couleur = x.substring(1, 3);
            couleur = extraireCouleur(couleur);
            Carte carte = new Carte(nombre, couleur);
            if (checkDoublons(carte))
                throw  new RuntimeException("Une carte au moins a été utilisée plusieurs fois");

            paquet.add(carte);
        }
        if (paquet.size()>5){
            throw new RuntimeException("La main est trop grande, une main se compose de 5 cartes");
        } else if (paquet.size()<5){
        throw new RuntimeException("La main est trop petite, une main se compose de 5 cartes");
        }
    }
    public Enregistreur(ArrayList<Carte> paquet_brut)//Pour les tests uniquements
    {
        paquet = paquet_brut;
    }
    public String extraireCouleur(String carte){
        carte = carte.substring(0,1).toUpperCase()+carte.substring(1).toLowerCase();
        if (!bonneCouleur(carte))
            throw new RuntimeException("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
        return carte;
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
                    throw new RuntimeException("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
                }
        }
        if (nombre < 1 || nombre > 13)
            throw new RuntimeException("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
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
    public void printPaquet(){ //pour tests
        for (Carte c: paquet)
            System.out.println(c.getNombre() + c.getCouleur() + " ");
    }
}
