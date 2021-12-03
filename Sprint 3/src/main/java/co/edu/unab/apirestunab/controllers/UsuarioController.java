package co.edu.unab.apirestunab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.unab.apirestunab.model.UsuarioModel;

import co.edu.unab.apirestunab.services.UsuarioServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*", methods={RequestMethod.POST})
@RequestMapping("/usuario")
public class UsuarioController {

   

    @Autowired
    UsuarioServices usuarioService;



    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }


}



