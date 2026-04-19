package hei.school.agricole.entity;

import java.time.LocalDate;

public class Paranaige {
    private Long id;
    private Membre parrain;
    private Membre filleul;
    private LocalDate dateParrainage;

    public Paranaige(Long id, Membre parrain, Membre filleul, LocalDate dateParrainage) {
        this.id = id;
        this.parrain = parrain;
        this.filleul = filleul;
        this.dateParrainage = dateParrainage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Membre getParrain() {
        return parrain;
    }

    public void setParrain(Membre parrain) {
        this.parrain = parrain;
    }

    public Membre getFilleul() {
        return filleul;
    }

    public void setFilleul(Membre filleul) {
        this.filleul = filleul;
    }

    public LocalDate getDateParrainage() {
        return dateParrainage;
    }

    public void setDateParrainage(LocalDate dateParrainage) {
        this.dateParrainage = dateParrainage;
    }
}
