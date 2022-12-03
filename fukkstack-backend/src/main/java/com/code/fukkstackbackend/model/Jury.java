package com.code.fukkstackbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Scanner;

@Entity

public class Jury {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private double ProposalPresentation;
    private double FinalPresentation;
    private double NoteJury;

    public Jury() {

    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setProposalPresentation(){
        System.out.println("Veuillez entrez une note sur 20");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double pp = myObj.nextDouble();  // Read user input
        this.ProposalPresentation = pp * 0.15;  // Output user input
    }

    public double getProposalPresentation(){
        return  ProposalPresentation;
    }

    public void setFinalPresentation(){
        System.out.println("Veuillez entrez une note sur 20");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double fp = myObj.nextDouble();  // Read user input
        this.FinalPresentation = fp * 0.25;  // Output user input
    }

    public double getFinalPresentation(){
        return FinalPresentation;
    }

    public void setNoteJury(){
        this.NoteJury = getFinalPresentation() + getProposalPresentation();
    }

    public double getNoteJury(){
        return NoteJury;
    }
}

