package com.devops.model;

public class Parasite extends Maladie {

    public Parasite(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
    }

    @Override
    public boolean traiter(Medicament med) {

        if (med.getType().equalsIgnoreCase("Antiparasitaire")) {
            force = 0;
        } else {
            force -= 20;
        }

        return etat();
    }

    @Override
    public int evolue() {
        // Le parasite n'évolue pas
        return 3;
    }
}
