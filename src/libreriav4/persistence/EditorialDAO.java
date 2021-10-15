package libreriav4.persistence;

import libreriav4.entities.Editorial;

public class EditorialDAO extends DAO {
    
    public void createEditorial(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("No se puede crear Editorial desde DAO.");
        }
    }
    
}
