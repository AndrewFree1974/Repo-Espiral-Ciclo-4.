package com.spiralgroup.alpha.services;

import java.util.ArrayList;
import java.util.Optional;


import com.spiralgroup.alpha.models.productModel;
import com.spiralgroup.alpha.repositories.productRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

    @Autowired
    productRepository productrepository;

    public ArrayList<productModel> obtenerProductos(){
    return(ArrayList<productModel>) productrepository.findAll();

    }  

    public productModel guardarProducto(productModel producto){
    return productrepository.save(producto);
    }

    public boolean eliminarProducto(String id){

        if (productrepository.existsById(id)){
            productrepository.deleteById(id);
            return true;
        }else{
            return false;
        }      
                             
    }  
    
    public Optional<productModel> obtenerProductoPorId(String id){
        return productrepository.findById(id);
    }

    
}
