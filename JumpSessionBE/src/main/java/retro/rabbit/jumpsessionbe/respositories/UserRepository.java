package retro.rabbit.jumpsessionbe.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import retro.rabbit.jumpsessionbe.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
