package com.devops.model;

public class Bacterie extends Maladie {

    private int stade;

    public Bacterie(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
        this.stade = (int) (Math.random() * 4) + 1;
    }

    @Override
    public boolean traiter(Medicament med) {

        if (stade == 1) { // bénin
            if (med.getType().equalsIgnoreCase("Antibiotique")) {
                force = 0;
            } else if (med.getType().equalsIgnoreCase("Antiviral")) {
                force -= 10;
            }

        } else if (stade == 2) { // modéré
            if (med.getType().equalsIgnoreCase("Antibiotique")) {
                force -= 10;
            } else if (med.getType().equalsIgnoreCase("Antiviral")) {
                force -= 3;
            }

        } else if (stade == 3) { // dangereux
            if (med.getType().equalsIgnoreCase("Antibiotique")) {
                stade = 2;
            }

        } else if (stade == 4) { // sévère
            if (med.getType().equalsIgnoreCase("Antibiotique")) {
                force -= 5;
            }
        }

        return etat();
    }

    @Override
    public int evolue() {

        // évolution aléatoire
        if (Math.random() < 0.5) {
            force += 5;
        } else if (stade < 4) {
            stade++;
        }

        double impact;

        if (stade == 1) {
            impact = force * 0.2;
        } else if (stade == 2) {
            impact = force * 0.3;
        } else if (stade == 3) {
            impact = force * 0.7;
        } else {
            impact = force * 0.9;
        }

        return (int) Math.round(impact);
    }
}
