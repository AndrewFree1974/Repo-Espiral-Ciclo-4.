package co.unab.ciclofour.sprint3.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.ciclofour.sprint3.models.LibroModel;
import co.unab.ciclofour.sprint3.services.LibroService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @GetMapping(value = "/all")
    public ArrayList<LibroModel> obtenerLibros(){
        return libroService.obtenerLibros();
    }

    @PostMapping(value = "/guardar")
    public LibroModel guardarLibro(@RequestBody LibroModel libro){
        return libroService.guardarLibro(libro);
    }

    @DeleteMapping(value = "/delete/{isbn}")
    public String eliminarLibroById(@PathVariable("isbn") String isbn){
        boolean resultadoEliminar=this.libroService.eliminarLibro(isbn);
        if(resultadoEliminar){
            return "Se eliminó el libro con el ISBN: " + isbn;
        }else{
            return "No se logró eliminar el libro con el ISBN: " + isbn;
        }
    }

    @GetMapping(path = "/{isbn}")
    public Optional<LibroModel> obtenerLibroById(@PathVariable("isbn") String isbn){
        return this.libroService.obtenerLibroById(isbn);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<LibroModel> obtenerLibroByNombre(@PathVariable("nombre") String nombre){
        return this.libroService.obtenerLibroByNombre(nombre);
    }
}
