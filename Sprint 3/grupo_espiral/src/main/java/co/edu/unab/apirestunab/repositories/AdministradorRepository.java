package co.edu.unab.apirestunab.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import co.edu.unab.apirestunab.model.AdministradorModel;

@Repository
public interface AdministradorRepository extends MongoRepository<AdministradorModel, String>{
    
        ArrayList <AdministradorModel> findByNombre(String nombre);
    
        ArrayList <AdministradorModel> findByApellido(String apellido);
    
        ArrayList <AdministradorModel> findByIdentificacion(Number numIdentificacion);
        
        ArrayList <AdministradorModel> findByCorreo(String correo);
    
        ArrayList <AdministradorModel> findByRol(String rol);
    
}
