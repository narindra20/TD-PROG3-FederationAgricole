package hei.school.agricole.entity;

import hei.school.agricole.enums.TypeCompte;

import java.math.BigDecimal;

public class Compte {
    private Long id;
    private TypeCompte type;
    private BigDecimal solde = BigDecimal.ZERO;
    private Collectivite collectivite;
    private Federation federation;

    public Compte(Long id, TypeCompte type, BigDecimal solde, Collectivite collectivite, Federation federation) {
        this.id = id;
        this.type = type;
        this.solde = solde;
        this.collectivite = collectivite;
        this.federation = federation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public Collectivite getCollectivite() {
        return collectivite;
    }

    public void setCollectivite(Collectivite collectivite) {
        this.collectivite = collectivite;
    }

    public Federation getFederation() {
        return federation;
    }

    public void setFederation(Federation federation) {
        this.federation = federation;
    }
}
