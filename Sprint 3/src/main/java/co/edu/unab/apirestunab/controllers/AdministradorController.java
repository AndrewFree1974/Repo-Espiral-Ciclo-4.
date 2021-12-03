package co.edu.unab.apirestunab.controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.unab.apirestunab.model.UsuarioModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import co.edu.unab.apirestunab.model.AdministradorModel;
import co.edu.unab.apirestunab.services.AdministradorServices;

@RestController
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/admin")

public class AdministradorController {
    
     @Autowired
    AdministradorServices AdministradorService;
    AdministradorServices usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuario() {
        return usuarioService.obtenerUsuario();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }


    @DeleteMapping(path="/{id}")
    public String eliminarUsuarioPorId(@PathVariable("id") String id) {
        if (this.usuarioService.eliminarUsuario(id)) {
            return "Usuario eliminado con id:" + id;
        } else {
            return "Usuario no encontrado"+ id;
        }
    }

    @GetMapping(path="/{id}")
    public Optional <UsuarioModel>obtenerUsuarioPorId(@PathVariable("id") String id) {
        return this.usuarioService.obtenerUsuarioPorId(id);
    }


    @GetMapping(path="/nombre/{nombre}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre (@PathVariable("nombre") String nombre) {
        return this.usuarioService.obtenerUsuarioPorNombre(nombre);
    }

    @GetMapping(path="/correo/{correo}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorCorreo (@PathVariable("correo") String correo) {
        return this.usuarioService.obtenerUsuarioPorCorreo(correo);
    }

    @GetMapping(path="/apellido/{apellido}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorApellido (@PathVariable("apellido") String apellido) {
        return this.usuarioService.obtenerUsuarioPorApellido(apellido);
    }

    @GetMapping(path="/identificacion/{identificacion}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorIdentificacion (@PathVariable("identif") Number identif) {
        return this.usuarioService.obtenerUsuarioPorIdentificacion(identif);
    }

    @GetMapping(path="/rol/{rol}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorRol (@PathVariable("rol") String rol) {
        return this.usuarioService.obtenerUsuarioPorRol(rol);
    }


    @GetMapping()
    public ArrayList<AdministradorModel> obtenerUsuarioAdmin() {
        return AdministradorService.obtenerUsuarioAdmin();
    }

    @PostMapping()
    public AdministradorModel guardarUsuarioAdmin(@RequestBody AdministradorModel administrador) {
        return AdministradorService.guardarUsuarioAdmin(administrador);
    }


    @DeleteMapping(path="/{id}")
    public String eliminarUsuarioPorIdAdmin(@PathVariable("id") String id) {
        if (this.AdministradorService.eliminarUsuario(id)) {
            return "Usuario eliminado con id:" + id;
        } else {
            return "Usuario no encontrado"+ id;
        }
    }

    @GetMapping(path="/{id}")
    public Optional <AdministradorModel>obtenerUsuarioPorIdAdmin(@PathVariable("id") String id) {
        return this.AdministradorService.obtenerUsuarioPorIdAdmin(id);
    }


    @GetMapping(path="/nombre/{nombre}")
    public ArrayList<AdministradorModel> obtenerUsuarioPorNombreAdmin (@PathVariable("nombre") String nombre) {
        return this.AdministradorService.obtenerUsuarioPorNombreAdmin(nombre);
    }

    @GetMapping(path="/correo/{correo}")
    public ArrayList<AdministradorModel> obtenerUsuarioPorCorreoAdmin (@PathVariable("correo") String correo) {
        return this.AdministradorService.obtenerUsuarioPorCorreoAdmin(correo);
    }

    @GetMapping(path="/apellido/{apellido}")
    public ArrayList<AdministradorModel> obtenerUsuarioPorApellidoAdmin (@PathVariable("apellido") String apellido) {
        return this.AdministradorService.obtenerUsuarioPorApellidoAdmin(apellido);
    }

    @GetMapping(path="/identificacion/{identificacion}")
    public ArrayList<AdministradorModel> obtenerUsuarioPorIdentificacionAdmin (@PathVariable("identif") Number identif) {
        return this.AdministradorService.obtenerUsuarioPorIdentificacionAdmin(identif);
    }

    @GetMapping(path="/rol/{rol}")
    public ArrayList<AdministradorModel> obtenerUsuarioPorRolAdmin(@PathVariable("rol") String rol) {
        return this.AdministradorService.obtenerUsuarioPorRolAdmin(rol);
    }
}

