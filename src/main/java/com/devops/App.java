package com.devops;

import com.devops.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        // Création d'un patient
        Patient p = new Patient("Ali", "Ben Salah", 100, 30);

        // Création d'une maladie (Virus)
        Maladie grippe = new Virus("Grippe", 100, 4, "Fièvre");

        // Création d'un médicament
        Medicament med = new Medicament("Aciclovir", "Antiviral", 50);

        // Le patient attrape la maladie
        p.ajoutMaladie(grippe);

        System.out.println("Patient malade ? " + p.estMalade());
        System.out.println("Vie avant soin : 100");

        // Le patient se soigne
        p.seSoigner(med);

        // La maladie évolue et attaque
        p.subirMaladie();

        System.out.println("Patient malade après soin ? " + p.estMalade());
    }
}
