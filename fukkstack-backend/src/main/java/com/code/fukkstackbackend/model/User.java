package com.code.fukkstackbackend.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private String name;
    private String email;
    private double NoteJury;
    private double NoteSupervisor;
    private double NoteFinale;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setNoteFinale(double noteFinale){
        this.NoteFinale = this.NoteJury + this.NoteSupervisor;
    }

    public double getNoteFinale(){
        return NoteFinale;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public double getNoteJury() {
        return NoteJury;
    }

    public void setNoteJury(double noteJury) {
        this.NoteJury = noteJury;
    }

    public double getNoteSupervisor() {
        return NoteSupervisor;
    }

    public void setNoteSupervisor(double noteSupervisor) {
        this.NoteSupervisor = noteSupervisor;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
