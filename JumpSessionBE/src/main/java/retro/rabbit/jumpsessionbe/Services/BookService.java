package retro.rabbit.jumpsessionbe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.Models.Book;
import retro.rabbit.jumpsessionbe.Respositories.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

//    public Book updateBook(Long id, Book bookDetails) {
//        Book book = bookRepository.findById(id).orElseThrow();
//        book.setBookname(bookDetails.getbookname());
//        return bookRepository.save(book);
//    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
