package libreriav4.services;

import libreriav4.entities.Author;
import libreriav4.persistence.AuthorDAO;

public class AuthorService {
    
    private AuthorDAO daoAuthor = new AuthorDAO();

    
    public Author createAuthor(Author author) throws Exception {
        try {
        daoAuthor.createAuthor(author);
            
        } catch (Exception e) {
            throw new Exception("No se puede crear Author desde servicio.");
        }
        return author;
    }
    
    public void searchAuthor(String name) throws Exception {
        try {
            
           Author author = new Author();
           author = daoAuthor.searchAuthor(name);
            System.out.println("ID: "+author.getId());
            System.out.println(daoAuthor.searchAuthor(name).toString());
        } catch (Exception e) {
            throw new Exception("No se puede buscar un author en servicio.");
        }
    }
    
}
