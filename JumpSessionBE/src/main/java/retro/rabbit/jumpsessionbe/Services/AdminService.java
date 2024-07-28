package retro.rabbit.jumpsessionbe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Respositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

//    public Admin getAdminById(Long id) {
//        return adminRepository.findById(id);
//    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

//    public Admin updateAdmin(Long id, Admin adminDetails) {
//        Admin admin = adminRepository.findById(id).orElseThrow();
//        admin.setName(adminDetails.getName());
//        admin.setEmail(adminDetails.getEmail());
//        return adminRepository.save(admin);
//    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
