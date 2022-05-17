package model.userFactory;

import javax.persistence.*;
import java.util.Objects;


public abstract class BasicUser {


    private DataSource dataSource;

    abstract public int spuneUnNr();



    public BasicUser(int id, String username, String password) {
        this.dataSource=new DataSourceImpl();
    }

    public BasicUser() {
    }


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "BasicUser{" +
                '}';
    }

}
