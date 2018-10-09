package poker2;

import static java.lang.Math.max;

public class pokerMain {
    public static void main(String[] args) {
        try {
            System.out.print("Main 1 : ");
            Joueur joueur1 = new Joueur(new Enregistreur().getPaquet());//On crée les 2 joueurs avec les valeurs qu'on a
            System.out.print("Main 2 : ");
            Joueur joueur2 = new Joueur(new Enregistreur().getPaquet());
            joueur1.checkDoublons(joueur2);

            //On montre qui a gagné
            ValeurMain VMJ1 = new ValeurMain(joueur1);
            ValeurMain VMJ2 = new ValeurMain(joueur2);
            String gagnant = "La main ";
            if (VMJ1.meilleureQue(VMJ2) == 1)
                gagnant += ("1 gagne avec " + VMJ1.texteCombinaison());
            else if (VMJ1.meilleureQue(VMJ2) == -1)
                gagnant += ("2 gagne avec " + VMJ2.texteCombinaison());
            else gagnant = "Egalite";
            System.out.println(gagnant);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
   }
}
