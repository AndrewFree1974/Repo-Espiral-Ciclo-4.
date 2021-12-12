package co.unab.ciclofour.sprint3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.ciclofour.sprint3.models.RolModel;
import co.unab.ciclofour.sprint3.repositories.RoleRepository;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public RolModel guardarRole(RolModel rol){
        return roleRepository.save(rol);
    }
}
