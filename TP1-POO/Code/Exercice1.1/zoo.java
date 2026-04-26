// ============================================================
// TP01 - Exercice 1 : Gestion d'animaux dans un zoo
// ENSA-BM | Génie Logiciel
// ============================================================

// 1. Classe abstraite Animal
abstract class Animal {
    private String nom; // Encapsulation : attribut privé

    public Animal(String nom) {
        this.nom = nom;
    }

    // Getter public pour accéder à nom (Encapsulation)
    public String getNom() {
        return nom;
    }

    // Méthode abstraite (Abstraction) : chaque sous-classe doit l'implémenter
    public abstract void faireDuBruit();
}

// 2. Classe Mammifere héritant d'Animal (Héritage)
class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom); // Appel au constructeur parent
    }

    @Override // Redéfinition de méthode (Polymorphisme)
    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}

// 3. Classe Oiseau héritant d'Animal (Héritage)
class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom); // Appel au constructeur parent
    }

    @Override // Redéfinition de méthode (Polymorphisme)
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    // Question 5 : Méthode unique aux oiseaux
    public void voler() {
        System.out.println(getNom() + " : L'oiseau vole.");
    }
}

// 4. Classe principale avec polymorphisme
public class zoo {
    public static void main(String[] args) {

        Animal tigre = new Mammifere("Tigre");
        Oiseau perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();
        perroquet.faireDuBruit();

        perroquet.voler();
    }
}