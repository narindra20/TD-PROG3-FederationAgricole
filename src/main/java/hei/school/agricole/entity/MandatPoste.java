package hei.school.agricole.entity;

import hei.school.agricole.enums.Poste;

public class MandatPoste {
    private Long id;
    private Mandat mandat;
    private Membre membre;
    private Collectivite collectivite;
    private Poste poste;

    public MandatPoste(Long id, Mandat mandat, Membre membre, Collectivite collectivite, Poste poste) {
        this.id = id;
        this.mandat = mandat;
        this.membre = membre;
        this.collectivite = collectivite;
        this.poste = poste;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mandat getMandat() {
        return mandat;
    }

    public void setMandat(Mandat mandat) {
        this.mandat = mandat;
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

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
}
