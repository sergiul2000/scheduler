package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rezervare")
public class Rezervare {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idClient")
    private int idClient;
    @Column(name = "idSala")
    private int idSala;
    @Column(name = "ora")
    private int ora;
    @Column(name = "data")
    private Date data;

    public Rezervare(int id, int idClient, int idSala, Date date, int ora) {
        this.id = id;
        this.idClient = idClient;
        this.idSala = idSala;
        this.data = date;
        this.ora = ora;
    }

    public Rezervare() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }
}
