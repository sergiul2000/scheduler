package logic;

import Services.AdminService;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AdminLogic {

    private final AdminService adminService;
    private final Sala sala;
    private final Rezervare rezervare;

    private Admin admin=null;

    @Autowired
    public AdminLogic(AdminService adminService, Sala sala, Rezervare rezervare) {
        this.adminService = adminService;
        this.sala = sala;
        this.rezervare = rezervare;
        //System.out.println("aici2");
    }

    public String addAmin(Admin admin){
        adminService.addAdmin(admin);
        return "New admin added!";
    }

    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }

    public void deleteAdmin(int idAdmin){
        adminService.deleteAdmin(idAdmin);
    }

    public void updateAdmin(int idAdmin, Admin newAdmin){
        Optional<Admin> admin1=adminService.findById(idAdmin);
        admin1.ifPresent(a->{
            a.setNume(newAdmin.getNume());
            a.setPrenume(newAdmin.getPrenume());
            a.setEmail(newAdmin.getEmail());
            a.setUsername(newAdmin.getUsername());
            a.setPass(newAdmin.getPass());
            adminService.addAdmin(a);
        });

    }

    public boolean login(String username, String password){
        List<Admin> administrators = getAdmins();
        for(Admin administrator : administrators){
            if(username.equals(administrator.getUsername()) && password.equals(administrator.getPass())){
                UserFactory userFactory = new UserFactory();
                this.admin = (Admin) userFactory.createUser(UserType.Admin, administrator.getNume(), administrator.getPrenume(),administrator.getEmail(), administrator.getUsername(), administrator.getPass());
                this.admin.setId(administrator.getId());
                return true;
            }
        }
        return false;
    }

    public boolean logout(){
        admin=null;
        return true;
    }

}
