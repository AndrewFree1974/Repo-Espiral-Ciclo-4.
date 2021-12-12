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

import co.unab.ciclofour.sprint3.models.UsuarioModel;
import co.unab.ciclofour.sprint3.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioById(@PathVariable("id") String id){
        boolean resultadoEliminar=this.usuarioService.eliminarUsuario(id);
        if(resultadoEliminar){
            return "Se eliminó el libro con el ISBN: " + id;
        }else{
            return "No se logró eliminar el libro con el ISBN: " + id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioById(@PathVariable("id") String id){
        return this.usuarioService.obtenerUsuarioById(id);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<UsuarioModel> obtenerUsuarioByNombre(@PathVariable("nombre") String nombre){
        return this.usuarioService.obtenerUsuarioByNombre(nombre);
    }

}
