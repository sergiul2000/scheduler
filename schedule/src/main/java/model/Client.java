package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client extends User {



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    public Client() {
        super();
    }

    public Client(String nume, String prenume, String email, String username, String pass) {
        super(nume, prenume, email, username, pass);
    }

    @Override
    public void login() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return getId() == client.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
