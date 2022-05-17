package model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "sala")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nr")
    private int nr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sala)) return false;
        Sala sala = (Sala) o;
        return getId() == sala.getId() && getNr() == sala.getNr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNr());
    }

    public Sala() {
    }

    public Sala(Long id, int nr) {
        this.id = id;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nr=" + nr +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
