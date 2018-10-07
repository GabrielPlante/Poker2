package Poker2;


public class Carte {
    public Carte(int a, String b)
    {
        nombre = a;
        couleur = b;
    }

    public String valeurToIndiceComplet(){
        if (nombre < 10)
            return Integer.toString(nombre+1);
        switch (nombre)
        {
            case 10: return "Valet";
            case 11: return "Dame";
            case 12: return "Roi";
            case 13: return "As";
            default: return "C'est pas bon";
        }
    }

    public boolean estPasMemeCarte(Carte c2){
        return !(couleur.equals(c2.getCouleur()) && nombre == c2.getNombre());
    }
    public boolean estMemeCouleur(Carte c2){
        return couleur.equals(c2.getCouleur());
    }
    public boolean aMemeValeur(Carte c2){
        return nombre == c2.getNombre();
    }

    @Override
    public boolean equals(Object s2){
        //nécessaire pour tests avec
        // assertEquals(ArrayList<Carte>, ArrayList<Carte>
        if(this == s2){
            return true;
        }
        if(s2 instanceof Carte){
            Carte other = (Carte) s2;
            return (this.nombre == other.getNombre() &&
                    this.couleur.equals(other.couleur));
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + couleur;
    }

    public int getNombre() {
        return nombre;
    }

    public String getCouleur() {
        return couleur;
    }

    private int nombre;
    private String couleur;
}
