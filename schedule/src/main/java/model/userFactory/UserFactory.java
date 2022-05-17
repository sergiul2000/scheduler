package model.userFactory;

import model.Angajat;
import model.Client;

public class UserFactory {
    public BasicUser createUser(UserType userType, int id, String user, String pass){
        if(userType==UserType.CLIENT)
            return new Client(id,user,pass);
        return new Angajat(id,user,pass);

    }
}
