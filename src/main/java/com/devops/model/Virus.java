package com.devops.model;

public class Virus extends Maladie {
    public Virus(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
    }

    @Override
    public boolean traiter(Medicament med) {
        if (med.getType().equalsIgnoreCase("Antiviral")) {
            force -= 10;
        } else if (med.getType().equalsIgnoreCase("Antibiotique")) {
            force -= 1;
        }

        return etat();
    }

    @Override
    public int evolue() {
        int tranches = force / 25;
        force += tranches * 2;

        return (force / 10) * dangerosite;
    }

}
