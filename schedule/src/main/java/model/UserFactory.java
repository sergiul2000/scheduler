package model;

public class UserFactory {
    public User createUser(UserType userType, String user, String pass,String nume, String prenume,String email){
        if(userType==UserType.CLIENT)
            return new Client(nume,prenume,email,user,pass);
        return new Admin(nume,prenume,email,user,pass);

    }
}
