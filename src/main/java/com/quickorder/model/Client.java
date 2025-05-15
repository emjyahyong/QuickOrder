package com.quickorder.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client extends Utilisateur implements Serializable {

    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String codePostal;
    private Integer telephone;

    public Client() {}

    public Client(Long id, String email, String motDePasse, String nom, String prenom, String adresse, String ville, String codePostal, Integer telephone) {
        super(id, email, motDePasse);
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.telephone = telephone;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}
