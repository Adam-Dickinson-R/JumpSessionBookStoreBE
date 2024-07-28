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
@Table(name = "\"Books\"")
public class Book {
    @Id
    private Long id;
    private String book_name;
    private String isbn_number;
    private String author;
}
