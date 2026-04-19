package hei.school.agricole.entity;

import java.time.LocalDate;

@Entity
public class Collectivite {
    private Long id;
    private Integer numero;
    private String nom;
    private LocalDate dateCreation;
    private Ville ville;
    private Domaine domaine;
    private Federation federation;
    private Secteur secteur;
    private boolean autorisation;

    public Collectivite(Long id, Integer numero, String nom, LocalDate dateCreation, Ville ville, Domaine domaine, Federation federation, Secteur secteur, boolean autorisation) {
        this.id = id;
        this.numero = numero;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.ville = ville;
        this.domaine = domaine;
        this.federation = federation;
        this.secteur = secteur;
        this.autorisation = autorisation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Federation getFederation() {
        return federation;
    }

    public void setFederation(Federation federation) {
        this.federation = federation;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public boolean isAutorisation() {
        return autorisation;
    }

    public void setAutorisation(boolean autorisation) {
        this.autorisation = autorisation;
    }
}