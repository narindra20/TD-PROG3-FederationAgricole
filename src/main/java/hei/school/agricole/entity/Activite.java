package hei.school.agricole.entity;

import hei.school.agricole.enums.ActiviteType;

import java.time.LocalDate;

public class Activite {
    private Long id;
    private String titre;
    private ActiviteType type;
    private LocalDate dateActivite;
    private boolean obligatoire;
    private Collectivite collectivite;
    private Federation federation;

    public Activite(Long id, String titre, LocalDate dateActivite, ActiviteType type, boolean obligatoire, Collectivite collectivite, Federation federation) {
        this.id = id;
        this.titre = titre;
        this.dateActivite = dateActivite;
        this.type = type;
        this.obligatoire = obligatoire;
        this.collectivite = collectivite;
        this.federation = federation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ActiviteType getType() {
        return type;
    }

    public void setType(ActiviteType type) {
        this.type = type;
    }

    public LocalDate getDateActivite() {
        return dateActivite;
    }

    public void setDateActivite(LocalDate dateActivite) {
        this.dateActivite = dateActivite;
    }

    public boolean isObligatoire() {
        return obligatoire;
    }

    public void setObligatoire(boolean obligatoire) {
        this.obligatoire = obligatoire;
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
