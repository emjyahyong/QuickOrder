package com.quickorder.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "detailsCommande")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DetailsCommande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Produit produit;
    private Integer quantite;
    private BigDecimal prixUnitaire;
    private BigDecimal prixTotal;


    public DetailsCommande(Long id, Commande commande, Produit produit, Integer quantite, BigDecimal prixUnitaire, BigDecimal prixTotal) {
        this.id = id;
        this.commande = commande;
        this.produit = produit;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.prixTotal = prixTotal;
    }

    public DetailsCommande() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(BigDecimal prixTotal) {
        this.prixTotal = prixTotal;
    }
}
