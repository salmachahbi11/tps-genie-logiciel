// Classe de base
class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    public String getNumeroCompte() { return numeroCompte; }
    public double getSolde() { return solde; }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Depot de " + montant + " sur le compte " + numeroCompte +
                    ". Nouveau solde : " + solde);
        } else {
            System.out.println("Montant invalide.");
        }
    }

    public void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide.");
        } else if (montant > solde) {
            System.out.println("Solde insuffisant. Solde : " + solde);
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " du compte " + numeroCompte +
                    ". Nouveau solde : " + solde);
        }
    }

    public void afficherInfos() {
        System.out.println("Compte [" + numeroCompte + "] - Solde : " + solde);
    }
}

// Compte Courant
class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double soldeInitial, double decouvertAutorise) {
        super(numeroCompte, soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide.");
        } else if (montant > getSolde() + decouvertAutorise) {
            System.out.println("Depassement du decouvert autorise.");
        } else {
            double nouveauSolde = getSolde() - montant;
            System.out.println("Retrait de " + montant + " autorise. Nouveau solde : " + nouveauSolde);
        }
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type : Compte Courant | Decouvert : " + decouvertAutorise);
    }
}

// Compte Epargne
class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double soldeInitial, double tauxInteret) {
        super(numeroCompte, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInterets(double taux) {
        double interets = getSolde() * (taux / 100);
        deposer(interets);
        System.out.println("Interets ajoutes : " + interets);
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type : Compte Epargne | Taux : " + tauxInteret + "%");
    }
}

// Main
public class Banque {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant("CC-001", 500, 200);
        cc.afficherInfos();
        cc.deposer(150);
        cc.retirer(100);
        cc.retirer(700);

        System.out.println();

        CompteEpargne ce = new CompteEpargne("CE-002", 1000, 3.5);
        ce.afficherInfos();
        ce.deposer(500);
        ce.calculerInterets(3.5);
        ce.retirer(200);
    }
}