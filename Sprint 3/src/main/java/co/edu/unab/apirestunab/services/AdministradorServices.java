package co.edu.unab.apirestunab.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.apirestunab.model.AdministradorModel;
import co.edu.unab.apirestunab.repositories.AdministradorRepository;
import co.edu.unab.apirestunab.model.UsuarioModel;
import co.edu.unab.apirestunab.repositories.UsuarioRepository;


@Service
public class AdministradorServices {
    

    @Autowired
    AdministradorRepository AdministradorRepository;

    @Autowired
    UsuarioRepository UsuarioRepository;

    public ArrayList<AdministradorModel> obtenerUsuarioAdmin() {
       return (ArrayList<AdministradorModel>) AdministradorRepository.findAll();
        
    }

    public AdministradorModel guardarUsuarioAdmin(AdministradorModel usuario) {
        return AdministradorRepository.save(usuario);
    }

    
    public boolean eliminarUsuarioAdmin(String id) {
        if (AdministradorRepository.existsById(id)) {
            AdministradorRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<AdministradorModel> obtenerUsuarioPorIdAdmin(String id) {
        return AdministradorRepository.findById(id);
    }

    public ArrayList<AdministradorModel> obtenerUsuarioPorNombreAdmin(String nombre) {
        return (ArrayList<AdministradorModel>) AdministradorRepository.findByNombre(nombre);
    }

    public ArrayList<AdministradorModel> obtenerUsuarioPorApellidoAdmin(String apellido) {
        return (ArrayList<AdministradorModel>) AdministradorRepository.findByApellido(apellido);
    }

    public ArrayList<AdministradorModel> obtenerUsuarioPorIdentificacionAdmin(Number identificacion) {
        return (ArrayList<AdministradorModel>) AdministradorRepository.findByIdentificacion(identificacion);
    }

    public ArrayList<AdministradorModel> obtenerUsuarioPorCorreoAdmin(String correo) {
        return (ArrayList<AdministradorModel>) AdministradorRepository.findByCorreo(correo);
    }

    public ArrayList<AdministradorModel> obtenerUsuarioPorRolAdmin (String rol) {
        return (ArrayList<AdministradorModel>) AdministradorRepository.findByRol(rol);
    }


    public ArrayList<UsuarioModel> obtenerUsuario() {
        return (ArrayList<UsuarioModel>) UsuarioRepository.findAll();
         
     }
 
     public UsuarioModel guardarUsuario(UsuarioModel usuario) {
         return UsuarioRepository.save(usuario);
     }
 
     
     public boolean eliminarUsuario(String id) {
         if (UsuarioRepository.existsById(id)) {
             UsuarioRepository.deleteById(id);
             return true;
         } else {
             return false;
         }
     }
 
     public Optional<UsuarioModel> obtenerUsuarioPorId(String id) {
         return UsuarioRepository.findById(id);
     }
 
     public ArrayList<UsuarioModel> obtenerUsuarioPorNombre(String nombre) {
         return (ArrayList<UsuarioModel>) UsuarioRepository.findByNombre(nombre);
     }
 
     public ArrayList<UsuarioModel> obtenerUsuarioPorApellido(String apellido) {
         return (ArrayList<UsuarioModel>) UsuarioRepository.findByApellido(apellido);
     }
 
     public ArrayList<UsuarioModel> obtenerUsuarioPorIdentificacion(Number identificacion) {
         return (ArrayList<UsuarioModel>) UsuarioRepository.findByIdentificacion(identificacion);
     }
 
     public ArrayList<UsuarioModel> obtenerUsuarioPorCorreo(String correo) {
         return (ArrayList<UsuarioModel>) UsuarioRepository.findByCorreo(correo);
     }
 
     public ArrayList<UsuarioModel> obtenerUsuarioPorRol (String rol) {
         return (ArrayList<UsuarioModel>) UsuarioRepository.findByRol(rol);
     }
}
