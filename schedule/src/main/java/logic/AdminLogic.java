package logic;

import Services.AdminService;
import model.Admin;
import model.Rezervare;
import model.Sala;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AdminLogic {

    private final AdminService adminService;
    private final Sala sala;
    private final Rezervare rezervare;

    public AdminLogic(AdminService adminService, Sala sala, Rezervare rezervare) {
        this.adminService = adminService;
        this.sala = sala;
        this.rezervare = rezervare;
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

}
