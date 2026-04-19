package hei.school.agricole.entity;

import hei.school.agricole.enums.ServiceMobile;
import hei.school.agricole.enums.TypeCompte;

import java.math.BigDecimal;

public class MobileMoney extends Compte {
    private String titulaire;
    private ServiceMobile service;
    private String numeroTel;

    public MobileMoney(Long id, TypeCompte type, BigDecimal solde, Collectivite collectivite, Federation federation) {
        super(id, type, solde, collectivite, federation);
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public ServiceMobile getService() {
        return service;
    }

    public void setService(ServiceMobile service) {
        this.service = service;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
}