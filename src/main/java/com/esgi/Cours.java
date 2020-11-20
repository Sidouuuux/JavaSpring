package com.esgi;

import java.io.Serializable;
import java.util.ArrayList;

public class Cours implements Serializable{
    private int id;
    private String label;
    private ArrayList<Cours> objectifs;

    public Cours() {
        this.label = new String();
    }

    public Cours(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label.substring(0, 1).toUpperCase() + label.substring(1);;
    }

    public String afficher() {
        return "Cours{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}
