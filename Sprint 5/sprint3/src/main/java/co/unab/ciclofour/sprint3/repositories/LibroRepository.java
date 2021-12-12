package co.unab.ciclofour.sprint3.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.unab.ciclofour.sprint3.models.LibroModel;

@Repository
public interface LibroRepository extends MongoRepository<LibroModel, String> {
    
    ArrayList<LibroModel> findByNombre(String nombre);
}
