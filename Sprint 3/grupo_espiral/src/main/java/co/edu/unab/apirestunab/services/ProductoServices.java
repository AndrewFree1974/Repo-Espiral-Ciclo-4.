package co.edu.unab.apirestunab.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;
import co.edu.unab.apirestunab.model.ProductoModel;
import co.edu.unab.apirestunab.repositories.ProductoRepository;
@Service

public class ProductoServices {


    @Autowired
    ProductoRepository ProductoRepository;

    public ArrayList<ProductoModel> obtenerProducto() {
       return (ArrayList<ProductoModel>) ProductoRepository.findAll();
        
    }

    public ProductoModel guardarProducto(ProductoModel producto) {
        return ProductoRepository.save(producto);
    }

    
    public boolean eliminarProducto(String id) {
        if (ProductoRepository.existsById(id)) {
            ProductoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<ProductoModel> obtenerProductoPorId(String id) {
        return ProductoRepository.findById(id);
    }

    public ArrayList<ProductoModel> obtenerProductoPorTitulo(String titulo) {
        return ProductoRepository.findByTitulo(titulo);
    }

    public ArrayList<ProductoModel> obtenerProductoPorAutor (String autor) {
        return ProductoRepository.findByAutor(autor);
    }

    public ArrayList<ProductoModel> obtenerProductoPorEditorial (String editorial) {
        return ProductoRepository.findByEditorial(editorial);
    }

    public ArrayList<ProductoModel> obtenerProductoPorIsbn (String isbn) {
        return ProductoRepository.findByISBN(isbn);
    }

    public ArrayList<ProductoModel> obtenerProductoPorFechaPublicacion (String fechaPublicacion) {
        return ProductoRepository.findByFechaPublicacion(fechaPublicacion);
    }

    public ArrayList<ProductoModel> obtenerProductoPorEstado (String estado) {
        return ProductoRepository.findByEstado(estado);
    }

    public ArrayList<ProductoModel> obtenerProductoPorCategoria (String categoria) {
        return ProductoRepository.findByCategoria(categoria);
    }

}   
