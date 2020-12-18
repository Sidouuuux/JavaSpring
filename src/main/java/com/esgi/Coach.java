package com.esgi;

import java.util.ArrayList;

public class Coach {
    private String nom;
    private String prenom;
    private int codepostal;
    private ArrayList<Cours> cours;

    public Coach(String nom, String prenom, int codepostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.codepostal = codepostal;
        this.cours = new ArrayList<Cours>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public void addCours(Cours c){
            this.cours.add(c);
    }

    @Override
    public String toString() {
        return "Coach{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", codepostal=" + codepostal +
                '}';
    }
}
