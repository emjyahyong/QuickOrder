package com.quickorder.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categProduit")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CategProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    private String nom;
    private String description;

    public CategProduit(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public CategProduit() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
