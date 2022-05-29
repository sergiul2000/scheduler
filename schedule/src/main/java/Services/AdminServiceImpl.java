package Services;

import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import repos.AdminRepo;

import java.util.List;
import java.util.Optional;

public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepo adminRepo;

    @Override
    public Optional<Admin> findById(int idAdmin) {
        return adminRepo.findById(idAdmin);
    }

    @Override
    public List<Admin> getAdmins() {
        return adminRepo.findAll();
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    @Override
    public void deleteAdmin(int idAdmin) {
        adminRepo.deleteById(idAdmin);
    }
}
