package hei.school.agricole.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Ville {
    private int Id ;
    private String nom;

    public Ville(int id, String nom) {
        Id = id;
        this.nom = nom;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
