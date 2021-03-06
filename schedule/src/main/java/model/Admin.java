package model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Admin() {
        super();
    }

    public Admin(String nume, String prenume, String email, String username, String pass) {
        super(nume, prenume, email, username, pass);
    }

    @Override
    public void login() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
