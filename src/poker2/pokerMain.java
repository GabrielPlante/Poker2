package poker2;

import static java.lang.Math.max;

public class pokerMain {
    public static void main(String[] args) {
        try {
            // enregistreur permet de récupérer une saisie de main, de vérifier sa validité, et d'identifier et traduire la main en 5 objets Carte
            // joueur récupère les 5 cartes dans un tableau attribut, il s'occupe ensuite de reconnaitre la combinaison de sa main
            System.out.print("Main 1 : ");
            Joueur joueur1 = new Joueur(new Enregistreur().getPaquet());
            System.out.print("Main 2 : ");
            Joueur joueur2 = new Joueur(new Enregistreur().getPaquet());
            joueur1.checkDoublons(joueur2);
            // valeur main récupère le tableau de 5 carte de joueur et la combinaison associée (reconnue préalablement par le joueur), et s'attribut un tableau indiquant la force de la main
            ValeurMain VMJ1 = new ValeurMain(joueur1);
            ValeurMain VMJ2 = new ValeurMain(joueur2);
            String gagnantTexte = "La main ";
            if (VMJ1.meilleureQue(VMJ2) == 1)
                gagnantTexte += ("1 gagne avec " + VMJ1.texteCombinaison());
            else if (VMJ1.meilleureQue(VMJ2) == -1)
                gagnantTexte += ("2 gagne avec " + VMJ2.texteCombinaison());
            else gagnantTexte = "Egalite";
            System.out.println(gagnantTexte);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
   }
}
