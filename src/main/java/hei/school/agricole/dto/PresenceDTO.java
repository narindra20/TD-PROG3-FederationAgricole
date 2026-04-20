package hei.school.agricole.dto;

public class PresenceDTO {

    private Integer idMembre;
    private Integer idActivite;
    private Boolean present;
    private Boolean excuse;

    public PresenceDTO() {}

    public Integer getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public Integer getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(Integer idActivite) {
        this.idActivite = idActivite;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public Boolean getExcuse() {
        return excuse;
    }

    public void setExcuse(Boolean excuse) {
        this.excuse = excuse;
    }
}