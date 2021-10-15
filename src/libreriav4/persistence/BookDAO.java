package libreriav4.persistence;

import java.util.List;
import libreriav4.entities.Book;

public class BookDAO extends DAO {
    
    public void createBook(Book book) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("No se puede crear book desde DAO.");
        }
    }
    
    public Book searchBook(long isbn) throws Exception {
        try {
            Book book = (Book) em.createQuery("SELECT b FROM Book b WHERE b.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
            return book;
        } catch (Exception e) {
            throw new Exception("No se puede buscar desde DAO.");
        }
    }
    
    public Book searchBookForTitle(String title) throws Exception {
        try {
            Book book = (Book) em.createQuery("SELECT b FROM Book b WHERE b.title = :title").setParameter("title", title).getSingleResult();
            return book;
        } catch (Exception e) {
            throw new Exception("No se puede buscar en DAO.");
        }
    }
    
    public List<Book> searchBookForAuthor(String author) throws Exception {
        try {
            return em.createQuery("SELECT b FROM Book b WHERE b.author = :author").setParameter("author", author).getResultList();
        
        } catch (Exception e) {
            throw new Exception("No hay books con el mismo desde DAO.");
        }
    }
}
