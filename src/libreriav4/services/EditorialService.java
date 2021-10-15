package libreriav4.services;

import libreriav4.entities.Editorial;
import libreriav4.persistence.EditorialDAO;

public class EditorialService {
    
    private EditorialDAO daoEditorial = new EditorialDAO();
    
    public Editorial createEditorial(Editorial editorial) throws Exception {
        try {
            daoEditorial.createEditorial(editorial);
            return editorial;
        } catch (Exception e) {
            throw new Exception("No se puede crear editorial desde servicio.");
        }
    }
    
}
