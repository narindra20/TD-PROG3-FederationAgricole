package hei.school.agricole.entity;

public class Presence {
    private Long id;
    private Membre membre;
    private Activite activite;
    private boolean present = true;
    private boolean excuse = false;

    public Presence(Long id, Membre membre, Activite activite, boolean present, boolean excuse) {
        this.id = id;
        this.membre = membre;
        this.activite = activite;
        this.present = present;
        this.excuse = excuse;
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

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public boolean isExcuse() {
        return excuse;
    }

    public void setExcuse(boolean excuse) {
        this.excuse = excuse;
    }
}
