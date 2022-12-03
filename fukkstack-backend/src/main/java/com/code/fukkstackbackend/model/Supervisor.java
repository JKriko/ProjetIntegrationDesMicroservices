package com.code.fukkstackbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Scanner;

@Entity

public class Supervisor {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private double Progress;
    private double FinalReport;
    private double OverallWork;
    private double NoteSupervisor;

    public Supervisor() {
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setFinalReport(){
        System.out.println("Veuillez entrez une note sur 20");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double pp = myObj.nextDouble();  // Read user input
        this.FinalReport = pp * 0.2;  // Output user input
    }

    public double getFinalReport(){
        return FinalReport;
    }

    public void setProgress(){
        System.out.println("Veuillez entrez une note sur 20");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double fp = myObj.nextDouble();  // Read user input
        this.Progress = fp * 0.15;  // Output user input
    }

    public double getProgress(){
        return Progress;
    }

    public void setOverallWork(){
        System.out.println("Veuillez entrez une note sur 20");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double fp = myObj.nextDouble();  // Read user input
        this.OverallWork = fp * 0.25;  // Output user input
    }

    public double getOverallWork(){
            return OverallWork;
    }

    public void setNoteSupervisor(){
        this.NoteSupervisor = getOverallWork() + getProgress() + getFinalReport();
    }

    public double getNoteSupervisor(){
        return NoteSupervisor;
    }
}

