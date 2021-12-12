package co.unab.ciclofour.sprint3.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.ciclofour.sprint3.models.UsuarioModel;
import co.unab.ciclofour.sprint3.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        usuario.setNombre(usuario.getNombre().toLowerCase());
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(String id){
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<UsuarioModel> obtenerUsuarioById(String isbn){
        return usuarioRepository.findById(isbn);
    }

    public ArrayList<UsuarioModel> obtenerUsuarioByNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }


}
