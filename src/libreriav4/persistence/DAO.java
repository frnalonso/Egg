package libreriav4.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class DAO {
    
     protected EntityManager em = Persistence.createEntityManagerFactory("Libreriav4PU").createEntityManager();
    
}
