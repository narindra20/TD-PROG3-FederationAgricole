package hei.school.agricole.entity;

import hei.school.agricole.enums.Poste;

import java.time.LocalDate;

public class Adhesion {
    private Long id;
    private Membre membre;
    private Collectivite collectivite;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    private Poste poste;

    public Adhesion(Long id, Membre membre, LocalDate dateEntree, Collectivite collectivite, LocalDate dateSortie, Poste poste) {
        this.id = id;
        this.membre = membre;
        this.dateEntree = dateEntree;
        this.collectivite = collectivite;
        this.dateSortie = dateSortie;
        this.poste = poste;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Collectivite getCollectivite() {
        return collectivite;
    }

    public void setCollectivite(Collectivite collectivite) {
        this.collectivite = collectivite;
    }

    public LocalDate getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        this.dateEntree = dateEntree;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
}
