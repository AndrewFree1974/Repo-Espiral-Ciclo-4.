package co.unab.ciclofour.sprint3.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.unab.ciclofour.sprint3.models.RolModel;
import co.unab.ciclofour.sprint3.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends MongoRepository <UsuarioModel, String> {
    
    ArrayList <UsuarioModel> findByNombre(String nombre);

    //ArrayList <UsuarioModel> findById(String id);

    //ArrayList <UsuarioModel> findByApellido(String apellido);

    //ArrayList <UsuarioModel> findByIdentificacion(Number numIdentificacion);
    
    //ArrayList <UsuarioModel> findByCorreo(String correo);

    ArrayList <UsuarioModel> findByRol(RolModel rol);
}
