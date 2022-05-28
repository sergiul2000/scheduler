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
    }

    public Admin(String nume, String prenume, String email, String username, String pass) {
        super(nume, prenume, email, username, pass);
    }

    @Override
    public void login() {

    }

}
