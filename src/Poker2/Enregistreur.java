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

            if (nombre == 0){
                System.out.println("La saisie de la valeur d'au moins une carte n'a pas été reconnue\nRappel: utiliser des entiers de 2 à 10 et {V,D,R,A}");
                System.exit(-1);
            }
            String couleur = x.substring(1, 3);
            couleur = couleur.substring(0,1).toUpperCase()+couleur.substring(1).toLowerCase();
            if (!bonneCouleur(couleur)){
                System.out.println("La saisie de la famille d'au moins une carte n'a pas été reconnue\nRappel: utiliser {Pi,Co,Tr,Ca}");
                System.exit(-2);
            }
            Carte carte = new Carte(nombre, couleur);
            if (checkDoublons(carte)) {
                System.out.println("Une carte au moins a été utilisée plusieurs fois");
                System.exit(-3);
            }

            paquet.add(carte);
        }
        if (paquet.size()>5){
            System.out.println("La main est trop grande, une main se compose de 5 cartes");
            System.exit(0);
        } else if (paquet.size()<5){
        System.out.println("La main est trop petite, une main se compose de 5 cartes");
        System.exit(0);
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
    public void printPaquet(){ //pour tests
        for (Carte c: paquet)
            System.out.println(c.getNombre() + c.getCouleur() + " ");
    }
}
