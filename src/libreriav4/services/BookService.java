package libreriav4.services;

import java.util.List;
import libreriav4.entities.Book;
import libreriav4.persistence.BookDAO;

public class BookService {
    
    private BookDAO daoBook = new BookDAO();
    
    public Book createBook(Book book) throws Exception {
        try {
            daoBook.createBook(book);
            return book;
        } catch (Exception e) {
            throw new Exception("No se puede crear un book en servicio.");
        }
    }
    
    public void searchBook(long isbn) throws Exception {
        try {
            System.out.println(daoBook.searchBook(isbn).toString());   
        } catch (Exception e) {
            throw new Exception("No se puede buscar libro por servicio.");
        }
    }
    
    public void searchBookForTitle(String title) throws Exception {
        try {
            System.out.println(daoBook.searchBookForTitle(title).toString());
        } catch (Exception e) {
        throw new Exception("No se puede buscar en servicio.");
        }
    }
    
    public void searchBooksForAuthor(String author) throws Exception {
        try {
            List<Book> books = daoBook.searchBookForAuthor(author);
            if(books.isEmpty()) {
                System.out.println("No hay libros con ese autor.");
            } else {
                for (Book book : books) {
                    System.out.println(book.toString());
                }
            }
            
        } catch (Exception e) {
        throw new Exception("No se puede desde servicio.");
        }
    }
    
}
