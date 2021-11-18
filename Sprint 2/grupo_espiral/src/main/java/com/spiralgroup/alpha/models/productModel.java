package com.spiralgroup.alpha.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class productModel {
    @Id
    private String id;
    private String nombre;
    private int cantidad;
    private int price;
    private List<productModel> productos;
    private String producto;

    
    public productModel() {
    }


    public String getProducto() {
        return producto;
    }


    public void setProducto(String producto) {
        this.producto = producto;
    }


    public productModel(String nombre, int cantidad, int price, List<productModel>productos, String producto) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.price = price;
        this.productos = productos;
        
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public List<productModel> obtenerProductos() {
        return productos;
    }

    public void guardarProducto(productModel producto) {
        this.guardarProducto(producto);
    }
    

    

}

    

