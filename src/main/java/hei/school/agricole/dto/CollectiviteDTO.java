package hei.school.agricole.dto;

import java.time.LocalDate;

public class CollectiviteDTO {

    private Integer id;
    private String nom;
    private Integer numero;
    private LocalDate dateCreation;
    private Integer idVille;
    private Integer idDomaine;
    private Integer idFederation;

    public CollectiviteDTO() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getIdVille() {
        return idVille;
    }

    public void setIdVille(Integer idVille) {
        this.idVille = idVille;
    }

    public Integer getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(Integer idDomaine) {
        this.idDomaine = idDomaine;
    }

    public Integer getIdFederation() {
        return idFederation;
    }

    public void setIdFederation(Integer idFederation) {
        this.idFederation = idFederation;
    }
}