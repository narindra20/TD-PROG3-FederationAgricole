package hei.school.agricole.entity;

import java.time.LocalDate;

public class Collectivite {

    private Long id;
    private Integer numero;
    private String nom;
    private LocalDate dateCreation;

    private Long villeId;
    private Long domaineId;
    private Long federationId;
    private Long secteurId;

    private boolean autorisation;


    public Collectivite() {
    }


    public Collectivite(Long id, Integer numero, String nom, LocalDate dateCreation,
                        Long villeId, Long domaineId, Long federationId, Long secteurId,
                        boolean autorisation) {
        this.id = id;
        this.numero = numero;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.villeId = villeId;
        this.domaineId = domaineId;
        this.federationId = federationId;
        this.secteurId = secteurId;
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

    public Long getVilleId() {
        return villeId;
    }

    public void setVilleId(Long villeId) {
        this.villeId = villeId;
    }

    public Long getDomaineId() {
        return domaineId;
    }

    public void setDomaineId(Long domaineId) {
        this.domaineId = domaineId;
    }

    public Long getFederationId() {
        return federationId;
    }

    public void setFederationId(Long federationId) {
        this.federationId = federationId;
    }

    public Long getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Long secteurId) {
        this.secteurId = secteurId;
    }

    public boolean isAutorisation() {
        return autorisation;
    }

    public void setAutorisation(boolean autorisation) {
        this.autorisation = autorisation;
    }
}