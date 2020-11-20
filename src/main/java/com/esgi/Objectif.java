package com.esgi;

public class Objectif {
    private int id;
    private String label;
    private Objectif objectifs;

    public Objectif(int id, String label, Objectif objectifs) {
        this.id = id;
        this.label = label;
        this.objectifs = objectifs;
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

    public Objectif getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(Objectif objectifs) {
        this.objectifs = objectifs;
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
