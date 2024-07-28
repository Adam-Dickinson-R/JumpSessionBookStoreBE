package retro.rabbit.jumpsessionbe.Respositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import retro.rabbit.jumpsessionbe.Models.Admin;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long>{

}
