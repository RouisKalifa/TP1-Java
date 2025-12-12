package com.devops.model;

public abstract class Maladie {
    protected String nom;
    protected int force;
    protected int dangerosite;
    protected String symptomes;

    // Constructeur avec paramètres
    public Maladie(String nom, int force, int dangerosite, String symptomes) {
        this.nom = nom;
        this.force = force;
        this.dangerosite = dangerosite;
        this.symptomes = symptomes;
    }

    // La maladie est éradiquée si sa force est <= 0
    public boolean etat() {
        return force <= 0;
    }

    // Méthodes abstraites (chaque maladie les implémentera)
    public abstract int evolue();

    public abstract boolean traiter(Medicament med);

    @Override
    public String toString() {
        return "Maladie{" +
                "nom='" + nom + '\'' +
                ", force=" + force +
                ", dangerosite=" + dangerosite +
                ", symptomes='" + symptomes + '\'' +
                '}';
    }

}
