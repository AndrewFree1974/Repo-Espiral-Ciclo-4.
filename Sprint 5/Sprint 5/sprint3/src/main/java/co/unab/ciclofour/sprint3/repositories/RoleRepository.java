package co.unab.ciclofour.sprint3.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.unab.ciclofour.sprint3.models.RolModel;

@Repository
public interface RoleRepository extends MongoRepository<RolModel, String> {
    
}
