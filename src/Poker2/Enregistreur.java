package Poker2;

import java.util.ArrayList;
import java.util.Scanner;

public class Enregistreur {
    public Enregistreur()
    {
        System.out.println("Entrer la carte du joueur 1 :");
        while (paquet.size() < 2)
        {
            if (paquet.size() == 1) System.out.println("Entrer la carte du joueur 2 :");
            Scanner sc_nombre = new Scanner(System.in);
            int nombre = sc_nombre.nextInt();
            paquet.add(new Carte(nombre, "Pi"));
        }
    }
    public ArrayList<Carte> getPaquet(){
        return paquet;
    }
    private ArrayList<Carte> paquet = new ArrayList<Carte>();
}
