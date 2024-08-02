package retro.rabbit.jumpsessionbe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Models.UserBooks;
import retro.rabbit.jumpsessionbe.Respositories.AdminRepository;
import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.Respositories.CheckOutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CheckOutRepository checkOutRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(Long id, Admin adminDetails) {
        Admin admin = adminRepository.findById(id).orElseThrow();
        admin.setUsername(adminDetails.getUsername());
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    public UserBooks addCheckOut(UserBooks newEntry) throws Exception {
        try {
            return checkOutRepository.save(newEntry);
        }
        catch (Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }
}
