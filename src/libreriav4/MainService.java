package libreriav4;

import java.util.Scanner;
import libreriav4.entities.Author;
import libreriav4.entities.Book;
import libreriav4.entities.Editorial;
import libreriav4.services.AuthorService;
import libreriav4.services.BookService;
import libreriav4.services.EditorialService;

public class MainService {
    
   private Scanner sc;
   private BookService bookService;
   private EditorialService editorialService;
   private AuthorService authorService;
    
    public MainService() {
        this.sc = new Scanner(System.in);
      this.bookService = new BookService();
      this.editorialService = new EditorialService();
      this.authorService = new AuthorService();
    }
    
    public void main() {
        try {
            
            Editorial editorial = new Editorial("Editorial3", true);
            Author author = new Author("Autor3", true);
            Book book = new Book(777, "Book-Six", 2020, 10, 5, 5, true, author, editorial);
            
//            authorService.createAuthor(author);
//            editorialService.createEditorial(editorial);
//            bookService.createBook(book);


              //authorService.searchAuthor(searchName());
              //bookService.searchBook(searchISBN());
              //bookService.searchBookForTitle(searchName());
              bookService.searchBooksForAuthor(searchName());
           
            
        } catch (Exception e) {
        }
    }
    
    public String searchName() {
        System.out.println("Ingrese nombre: ");
        String name = sc.next();
        return name;
    }
    public long searchISBN() {
        System.out.println("Ingrese isbn: ");
        long isbn = sc.nextInt();
        return isbn;
    }
    
    
}
