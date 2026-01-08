package com.devops.model;
import java.util.HashSet;
import java.util.Iterator;


public class Patient {
    private String prenom;
    private String nom;
    private double vie;
    private double age;
    private HashSet<Maladie> lesMaladies;

    // Attribut de classe
    private static int nbMalades;

    public Patient(String prenom, String nom, double vie, double age) {
        this.prenom = prenom;
        this.nom = nom;
        this.vie = vie;
        this.age = age;
        this.lesMaladies = new HashSet<>();
    }

    public boolean estMalade() {
        return !lesMaladies.isEmpty();
    }

    public boolean estDecede() {
        return vie <= 0;
    }

    public void ajoutMaladie(Maladie m) {
        if (lesMaladies.isEmpty()) {
            nbMalades++;
        }
        lesMaladies.add(m);
    }

    public void seSoigner(Medicament med) {

        Iterator<Maladie> it = lesMaladies.iterator();

        while (it.hasNext()) {
            Maladie m = it.next();

            boolean guerie = m.traiter(med);

            if (guerie) {
                it.remove();
            }
        }

        // Si le patient n'a plus de maladies, il n'est plus malade
        if (lesMaladies.isEmpty()) {
            nbMalades--;
        }
    }

    public boolean subirMaladie() {

        double degats = 0;

        for (Maladie m : lesMaladies) {
            degats += m.evolue();
        }

        // Impact de l'âge
        if (age < 15) {
            degats *= 1.25;
        } else if (age > 65) {
            degats *= 1.33;
        }

        vie -= degats;

        return !estDecede();
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (vie=" + vie + ", age=" + age + ")";
    }






}
