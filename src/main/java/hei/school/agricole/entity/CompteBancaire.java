package hei.school.agricole.entity;

import hei.school.agricole.enums.Banque;
import hei.school.agricole.enums.TypeCompte;

import java.math.BigDecimal;

public class CompteBancaire extends Compte {
    private String titulaire;
    private Banque banque;
    private String numeroCompte;

    public CompteBancaire(Long id, TypeCompte type, BigDecimal solde, Collectivite collectivite, Federation federation) {
        super(id, type, solde, collectivite, federation);
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}