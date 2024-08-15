package retro.rabbit.jumpsessionbe.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Services.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminControllers {

        @Autowired
        private AdminService adminService;

        @GetMapping("/get-admins")
        public List<Admin> getAllAdmins() {
            return adminService.getAllAdmins();
        }

        @GetMapping("/get-admin/{id}")
        public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
            return adminService.getAdminById(id)
                    .map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        }

        @PostMapping("/create-admin")
        public Admin createAdmin(@RequestBody Admin admin) {
            return adminService.createAdmin(admin);
        }

        @DeleteMapping("/delete-admin/{id}")
        public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
            adminService.deleteAdmin(id);
            return ResponseEntity.noContent().build();
        }

          // ToDo: Create assign controller
    }

