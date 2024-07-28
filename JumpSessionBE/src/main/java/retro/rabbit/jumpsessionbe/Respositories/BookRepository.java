package retro.rabbit.jumpsessionbe.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import retro.rabbit.jumpsessionbe.Models.Book;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
