package model;

import model.userFactory.BasicUser;

public class Angajat extends BasicUser {

    @Override
    public int spuneUnNr() {
        return this.getDataSource().maGandescLaUnNr()*4+5;
    }

    public Angajat(int id, String username, String password) {
        super();
    }

    public Angajat() {
    }

}
