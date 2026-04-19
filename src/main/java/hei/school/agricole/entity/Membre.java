package hei.school.agricole.entity;

import hei.school.agricole.enums.Genre;
import hei.school.agricole.enums.Metier;
import jakarta.persistence.Entity;

import java.time.LocalDate;
public class Membre {

    private Long id;

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private Genre genre;
    private String adresse;
    private String telephone;
    private String email;
    private LocalDate dateAdhesion;

    public Membre(Long id, String nom, String prenom, LocalDate dateNaissance, Genre genre, String adresse, String telephone, String email, LocalDate dateAdhesion) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateAdhesion = dateAdhesion;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(LocalDate dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
}
