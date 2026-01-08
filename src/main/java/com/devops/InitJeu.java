package com.devops;

import com.devops.model.*;
import java.util.ArrayList;

public class InitJeu {

    private ArrayList<Patient> patients;
    private ArrayList<Medicament> medicaments;

    public InitJeu() {
        this.patients = new ArrayList<>();
        this.medicaments = new ArrayList<>();
    }

    public ArrayList<Medicament> initMedicaments() {

        medicaments.add(new Medicament("Amoxicilline", "Antibiotique", 50));
        medicaments.add(new Medicament("Clamoxyl", "Antibiotique", 50));
        medicaments.add(new Medicament("Aciclovir", "Antiviral", 50));
        medicaments.add(new Medicament("Prioderm", "Antiparasitaire", 50));

        return medicaments;
    }

    public ArrayList<Patient> initPatients() {

        // Création des patients
        Patient p1 = new Patient("Ali", "Ben Salah", 100, 30);
        Patient p2 = new Patient("Sami", "Trabelsi", 120, 70);
        Patient p3 = new Patient("Nour", "Ayadi", 90, 10);

        // Création des maladies
        Maladie v1 = new Virus("Grippe", 100, 4, "Fièvre");
        Maladie b1 = new Bacterie("Gastro", 80, 3, "Maux de ventre");
        Maladie p1m = new Parasite("Poux", 20, 1, "Démangeaisons");

        // Attribution des maladies (simple)
        p1.ajoutMaladie(v1);
        p2.ajoutMaladie(b1);
        p3.ajoutMaladie(p1m);

        // Ajout des patients à la liste
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);

        return patients;
    }


}
