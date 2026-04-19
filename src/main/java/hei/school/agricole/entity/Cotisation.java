package hei.school.agricole.entity;

import hei.school.agricole.enums.ModePaiement;
import hei.school.agricole.enums.TypeCotisation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cotisation {
    private Long id;
    private Membre membre;
    private Collectivite collectivite;
    private BigDecimal montant;
    private LocalDate datePaiement;
    private ModePaiement mode;
    private TypeCotisation type;

    public Cotisation(Long id, Membre membre, BigDecimal montant, Collectivite collectivite, LocalDate datePaiement, ModePaiement mode, TypeCotisation type) {
        this.id = id;
        this.membre = membre;
        this.montant = montant;
        this.collectivite = collectivite;
        this.datePaiement = datePaiement;
        this.mode = mode;
        this.type = type;
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

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public ModePaiement getMode() {
        return mode;
    }

    public void setMode(ModePaiement mode) {
        this.mode = mode;
    }

    public TypeCotisation getType() {
        return type;
    }

    public void setType(TypeCotisation type) {
        this.type = type;
    }
}
