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

    public boolean estPasEgal(Carte c2){
        if (this.couleur == c2.getCouleur() && this.nombre == c2.getNombre())
            return false;
        return true;
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
