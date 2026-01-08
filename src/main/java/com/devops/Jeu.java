package com.devops;

import com.devops.model.*;
import java.util.ArrayList;

public class Jeu {

    private ArrayList<Patient> patients;
    private ArrayList<Medicament> medicaments;

    public Jeu() {
        InitJeu init = new InitJeu();
        this.medicaments = init.initMedicaments();
        this.patients = init.initPatients();
    }

    public void lancer() {

        System.out.println("=== Début du jeu ===");

        for (Patient p : patients) {

            System.out.println("\nPatient : " + p);
            System.out.println("Malade ? " + p.estMalade());

            if (p.estMalade()) {

                // On prend le premier médicament disponible
                Medicament med = medicaments.get(0);
                System.out.println("Traitement avec : " + med);

                p.seSoigner(med);
                p.subirMaladie();

                if (p.estDecede()) {
                    System.out.println("Le patient est décédé.");
                    return; // fin du jeu
                }
            }
        }

        System.out.println("\n=== Fin du tour de jeu ===");
    }



}
