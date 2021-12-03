package co.edu.unab.apirestunab.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.apirestunab.model.ProductoModel;

   
@Repository
public interface ProductoRepository extends MongoRepository<ProductoModel, String>{
 
    ArrayList<ProductoModel> findByTitulo (String titulo);
    ArrayList<ProductoModel> findByAutor (String autor);
    ArrayList<ProductoModel> findByEditorial (String editorial);
    ArrayList<ProductoModel> findByFechaPublicacion (String fechaPublicacion);
    ArrayList<ProductoModel> findByISBN (String ISBN);
    ArrayList<ProductoModel> findByEstado (String estado);
    ArrayList<ProductoModel> findByCategoria (String categoria);


}
    

