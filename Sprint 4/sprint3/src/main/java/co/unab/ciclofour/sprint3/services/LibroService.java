package co.unab.ciclofour.sprint3.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.ciclofour.sprint3.models.LibroModel;
import co.unab.ciclofour.sprint3.repositories.LibroRepository;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public ArrayList<LibroModel> obtenerLibros(){
        return (ArrayList<LibroModel>) libroRepository.findAll();
    }

    public LibroModel guardarLibro(LibroModel libro){
        libro.setNombre(libro.getNombre().toLowerCase());
        return libroRepository.save(libro);
    }

    public boolean eliminarLibro(String isbn){
        if(libroRepository.existsById(isbn)){
            libroRepository.deleteById(isbn);
            return true;
        }else{
            return false;
        }
    }

    public Optional<LibroModel> obtenerLibroById(String isbn){
        return libroRepository.findById(isbn);
    }

    public ArrayList<LibroModel> obtenerLibroByNombre(String nombre){
        return libroRepository.findByNombre(nombre);
    }
}
