package com.quickorder.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "produit")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    private String nom;
    private String description;
    private BigDecimal prix;
    private BigDecimal quantite;
    @ManyToOne
    private CategProduit categorie;

    public Produit(Long id, String nom, String description, BigDecimal prix, BigDecimal quantite, CategProduit categorie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Produit() {

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

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public CategProduit getCategorie() {
        return categorie;
    }

    public void setCategorie(CategProduit categorie) {
        this.categorie = categorie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
