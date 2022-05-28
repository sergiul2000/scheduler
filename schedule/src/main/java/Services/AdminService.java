package Services;

import model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {
    public Optional<Admin> getAdminById(int idAdmin);
    public List<Admin> getAdmin();
    public Admin addAdmin(Admin admin);
    public void deleteAdmin(int idAdmin);
}
