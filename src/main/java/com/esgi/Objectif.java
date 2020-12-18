package com.esgi;

import java.util.ArrayList;

public class Objectif {
    private int id;
    private String label;
    private ArrayList<Objectif> objectifs;

    public Objectif(int id, String label) {
        this.id = id;
        this.label = label;
        this.objectifs = new ArrayList<Objectif>();
    }
    public Objectif(int id, String label, Objectif objectifs) {
        this.id = id;
        this.label = label;
        this.objectifs = new ArrayList<Objectif>();
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
        this.label = label;
    }

    public ArrayList<Objectif> getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(ArrayList<Objectif> objectifs) {
        this.objectifs = objectifs;
    }

    public void addObjectif(Objectif o){
        this.objectifs.add(o);
    }

    @Override
    public String toString() {
        return "Objectif{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", objectifs=" + objectifs +
                '}';
    }
}
