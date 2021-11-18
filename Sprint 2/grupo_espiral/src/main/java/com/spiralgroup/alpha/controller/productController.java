package com.spiralgroup.alpha.controller;

import java.util.ArrayList;
import java.util.Optional;


import com.spiralgroup.alpha.models.productModel;
import com.spiralgroup.alpha.services.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/producto")
public class productController {
    @Autowired
    productService productService;

    @GetMapping()
    public ArrayList<productModel> obtenerproductos(){
        return  productService.obtenerProductos();
    }

    @PostMapping()
    public productModel guardarProducto(@RequestBody productModel producto){
        return productService.guardarProducto(producto);
        
    }

     
    @DeleteMapping(path = "/{id}")
    public String eliminarProductoPorId(@PathVariable("id") String id){
        boolean resultadoEliminar=this.productService.eliminarProducto(id);
        if (resultadoEliminar){
            return "Se eliminó el usuario con id: "+id;
        }else{
            return "No se pudo eliminar el usuario con el id: "+id;
        }
    }
    
    @GetMapping(path = "/{id}")
    public Optional<productModel> obtenerProductoPorId(@PathVariable("id") String id){
        return this.productService.obtenerProductoPorId(id);
    }

}
