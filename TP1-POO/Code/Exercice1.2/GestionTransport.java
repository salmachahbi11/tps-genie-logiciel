// Classe abstraite
abstract class Vehicule {
    private String marque;
    private String modele;
    private int annee;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public int getAnnee() { return annee; }

    // methode abstraite
    public abstract void afficherDetails();

    // methode concrete (sans accents)
    public void demarrer() {
        System.out.println("Le vehicule demarre.");
    }
}

// Voiture
class Voiture extends Vehicule {
    private int nombreDePortes;

    public Voiture(String marque, String modele, int annee, int nombreDePortes) {
        super(marque, modele, annee);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Voiture: " + getMarque() + " " + getModele() +
                " (" + getAnnee() + "), Portes: " + nombreDePortes);
    }
}

// Camion
class Camion extends Vehicule {
    private double capaciteDeCharge;

    public Camion(String marque, String modele, int annee, double capaciteDeCharge) {
        super(marque, modele, annee);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Camion: " + getMarque() + " " + getModele() +
                " (" + getAnnee() + "), Capacite: " + capaciteDeCharge + " tonnes");
    }
}

// Moto
class Moto extends Vehicule {
    private String typeDeGuidon;

    public Moto(String marque, String modele, int annee, String typeDeGuidon) {
        super(marque, modele, annee);
        this.typeDeGuidon = typeDeGuidon;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Moto: " + getMarque() + " " + getModele() +
                " (" + getAnnee() + "), Guidon: " + typeDeGuidon);
    }
}

// Classe principale
public class GestionTransport {
    public static void main(String[] args) {
        Vehicule v1 = new Voiture("Toyota", "Corolla", 2021, 4);
        Vehicule v2 = new Camion("Volvo", "FMX", 2019, 12.5);
        Vehicule v3 = new Moto("Yamaha", "MT-07", 2022, "Sport");

        v1.afficherDetails();
        v2.afficherDetails();
        v3.afficherDetails();
    }
}