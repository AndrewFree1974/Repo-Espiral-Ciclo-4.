package co.edu.unab.apirestunab.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import co.edu.unab.apirestunab.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioModel, String>{

    ArrayList <UsuarioModel> findByNombre(String nombre);

    ArrayList <UsuarioModel> findByApellido(String apellido);

    ArrayList <UsuarioModel> findByIdentificacion(Number numIdentificacion);
    
    ArrayList <UsuarioModel> findByCorreo(String correo);

    ArrayList <UsuarioModel> findByRol(String rol);
}
