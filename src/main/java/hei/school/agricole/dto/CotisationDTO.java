package hei.school.agricole.dto;

import java.time.LocalDate;

public class CotisationDTO {

    private Integer idMembre;
    private Integer idCollectivite;
    private Double montant;
    private LocalDate datePaiement;
    private String mode;
    private String type;

    public CotisationDTO() {}

    public Integer getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public Integer getIdCollectivite() {
        return idCollectivite;
    }

    public void setIdCollectivite(Integer idCollectivite) {
        this.idCollectivite = idCollectivite;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
