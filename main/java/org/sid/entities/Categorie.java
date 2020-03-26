package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Categorie implements Serializable {
    @Id
    private String categorie;
    public Categorie() {

    }
    public Categorie(String categorie){
        this.categorie = categorie;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }}
