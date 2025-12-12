package com.devops.model;

public class Medicament {
    // Attributs (état de l'objet)
    private String nom;
    private String type;
    private int efficacite;

    // Constructeur par paramètres
    public Medicament(String nom, String type, int efficacite) {
        this.nom = nom;
        this.type = type;
        this.efficacite = efficacite;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour le type
    public String getType() {
        return type;
    }

    // Setter pour le type
    public void setType(String type) {
        this.type = type;
    }

    // Getter pour l'efficacité
    public int getEfficacite() {
        return efficacite;
    }

    // Setter pour l'efficacité
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    // Représentation texte de l'objet
    @Override
    public String toString() {
        return "Medicament{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", efficacite=" + efficacite +
                '}';
    }

}
