package co.edu.unab.apirestunab.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.apirestunab.model.UsuarioModel;
import co.edu.unab.apirestunab.repositories.UsuarioRepository;
@Service
public class UsuarioServices {
    
    @Autowired
    UsuarioRepository UsuarioRepository;



    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return UsuarioRepository.save(usuario);
    }

    

}



