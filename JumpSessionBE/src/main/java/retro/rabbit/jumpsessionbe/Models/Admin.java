package retro.rabbit.jumpsessionbe.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"Admin\"")
public class Admin {
    @Id
    private Long id;
    private String username;
    private String password;


}
