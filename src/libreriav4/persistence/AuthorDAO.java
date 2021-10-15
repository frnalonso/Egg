package libreriav4.persistence;

import libreriav4.entities.Author;

public class AuthorDAO extends DAO {
    
    public void createAuthor(Author author) throws Exception {
        try {
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();    
        } catch (Exception e) {
            throw new Exception("No se puede crear desde Author desde DAO.");
        }
    }
    
    public Author searchAuthor(String name) throws Exception {
        try {
        Author author = (Author) em.createQuery("SELECT a FROM Author a WHERE a.name = :name").setParameter("name",name).getSingleResult();
        return author;
        } catch (Exception e) {
            throw new Exception("No se puede buscar autor en DAO.");
        }
    }
    
    
}
