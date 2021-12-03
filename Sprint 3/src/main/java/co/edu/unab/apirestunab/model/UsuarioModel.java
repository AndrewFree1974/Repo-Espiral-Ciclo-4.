package co.edu.unab.apirestunab.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class UsuarioModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Number telefono;
    private String correo;
    private Number numIdentificacion;
    private AddressModel direccion;
    private String contraseña;
    private String rol;

    

    
    public UsuarioModel(String id, String nombre, String apellido, Number telefono, String correo,
            Number numIdentificacion, AddressModel direccion, String contraseña, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.numIdentificacion = numIdentificacion;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.rol = rol;
    }




    public UsuarioModel() {
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


    public Number getTelefono() {
        return telefono;
    }


    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public Number getNumIdentificacion() {
        return numIdentificacion;
    }


    public void setNumIdentificacion(Number numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }




    public AddressModel getDireccion() {
        return direccion;
    }




    public void setDireccion(AddressModel direccion) {
        this.direccion = direccion;
    }




    public String getContraseña() {
        return contraseña;
    }




    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }




    public String getRol() {
        return rol;
    }




    public void setRol(String rol) {
        this.rol = rol;
    }


    
    
   
}   
