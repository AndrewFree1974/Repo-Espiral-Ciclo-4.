package co.unab.ciclofour.sprint3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.ciclofour.sprint3.models.RolModel;
import co.unab.ciclofour.sprint3.services.RoleService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET})
@RequestMapping("/role")
public class RoleController {
    
    @Autowired
    RoleService roleService;

    @PostMapping()
    public RolModel guardarRol(@RequestBody RolModel rol){
        return roleService.guardarRole(rol);
    }
}
