package retro.rabbit.jumpsessionbe.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import retro.rabbit.jumpsessionbe.Models.UserBooks;

@Repository
public interface CheckOutRepository extends JpaRepository<UserBooks, Long> {
}
