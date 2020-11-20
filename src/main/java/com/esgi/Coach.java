package com.esgi;

public class Coach {
    private String nom;
    private String prenom;
    private int codepostal;

    public Coach(String nom, String prenom, int codepostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.codepostal = codepostal;
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

    @Override
    public String toString() {
        return "Coach{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", codepostal=" + codepostal +
                '}';
    }
}
