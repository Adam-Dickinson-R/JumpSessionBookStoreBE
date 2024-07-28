package retro.rabbit.jumpsessionbe.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Services.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminControllers {

        @Autowired
        private AdminService adminService;

        @GetMapping("/admins")
        public List<Admin> getAllAdmins() {
            return adminService.getAllAdmins();
        }

//        @GetMapping("/admins/{id}")
//        public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
//            return adminService.getAdminById(id)
//                    .map(ResponseEntity::ok)
//                    .orElseGet(() -> ResponseEntity.notFound().build());
//        }

        @PostMapping("/admins")
        public Admin createAdmin(@RequestBody Admin admin) {
            return adminService.createAdmin(admin);
        }

//        @PutMapping("/admins/{id}")
//        public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
//            return ResponseEntity.ok(adminService.updateAdmin(id, adminDetails));
//        }

        @DeleteMapping("/admins/{id}")
        public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
            adminService.deleteAdmin(id);
            return ResponseEntity.noContent().build();
        }
    }

