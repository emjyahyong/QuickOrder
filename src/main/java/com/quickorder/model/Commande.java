package com.quickorder.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "commande")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Commande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    private Date dateCommande;
    private String status;
    @ManyToOne
    private Client client;
    private BigDecimal totalMontant;

    public Commande(Long id, Date dateCommande, String status, Client client, BigDecimal totalMontant) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.status = status;
        this.client = client;
        this.totalMontant = totalMontant;
    }

    public Commande() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getTotalMontant() {
        return totalMontant;
    }

    public void setTotalMontant(BigDecimal totalMontant) {
        this.totalMontant = totalMontant;
    }
}
