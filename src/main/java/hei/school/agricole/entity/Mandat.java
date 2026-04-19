package hei.school.agricole.entity;

public class Mandat {
    private Long id;
    private Integer annee;
    private Integer duree ;

    public Mandat(Long id, Integer annee, Integer duree) {
        this.id = id;
        this.annee = annee;
        this.duree = duree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
}
