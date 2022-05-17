package model.userFactory;

import model.Angajat;
import model.Client;

public class UserFactory {
    public BasicUser createUser(UserType userType, String user, String pass){
        if(userType==UserType.CLIENT)
            return new Client(user,pass);
        return new Angajat();

    }
}
