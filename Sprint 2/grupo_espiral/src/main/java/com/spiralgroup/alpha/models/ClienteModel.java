package com.spiralgroup.alpha.models;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

public class ClienteModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fRegistro;
    private  List<productModel> productos;

    public ClienteModel() {
    }

    public ClienteModel(String id, String nombre, String apellido, String telefono, LocalDate fRegistro, List<productModel> productos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fRegistro = fRegistro;
        this.productos = productos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(LocalDate fRegistro) {
        this.fRegistro = fRegistro;
    }
    public List<productModel> obtenerProductos() {
        return productos;
    }

    public void setProductos(List<productModel> productos) {
        this.productos = productos;
    }



    
}







    

