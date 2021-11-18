package com.spiralgroup.alpha.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.spiralgroup.alpha.models.ClienteModel;

@Repository
public interface ClienteRepository extends MongoRepository <ClienteModel, String> { 

    


}
