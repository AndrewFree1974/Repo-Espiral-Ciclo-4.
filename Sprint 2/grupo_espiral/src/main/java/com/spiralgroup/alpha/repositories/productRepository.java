package com.spiralgroup.alpha.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.spiralgroup.alpha.models.productModel;


@Repository
public interface productRepository extends MongoRepository <productModel, String> {
    
}
