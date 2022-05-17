package model;

import model.userFactory.BasicUser;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
public class Client extends BasicUser {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "pass", nullable = false)
    private String password;


    @Override
    public int spuneUnNr() {
        return this.getDataSource().maGandescLaUnNr()*3+1;
    }

    public Client() {
        super();
    }

    public Client( String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id == client.id && username.equals(client.username) && password.equals(client.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
