package Poker2;

import static java.lang.Math.max;

public class pokerMain {
    public static void main(String[] args) {
        try {
            System.out.print("Main 1 : ");
            Joueur joueur1 = new Joueur(new Enregistreur().getPaquet());//On crée les 2 joueurs avec les valeurs qu'on a
            System.out.print("Main 2 : ");
            Joueur joueur2 = new Joueur(new Enregistreur().getPaquet());

            //On montre qui a gagné
            ValeurMain j1 = new ValeurMain(joueur1);
            ValeurMain j2 = new ValeurMain(joueur2);
            String gagnant = "La main ";
            if (j1.meilleureQue(j2) == 1)
                gagnant += ("1 gagne avec " + j1.combinaison() + (new Carte(j1.getValeurMain().get(1), "").valeurToIndiceComplet()));
            else if (j1.meilleureQue(j2) == -1)
                gagnant += ("2 gagne avec " + j2.combinaison() + (new Carte(j2.getValeurMain().get(1), "").valeurToIndiceComplet()));
            else gagnant = "Egalite";
            System.out.println(gagnant);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
   }
}
