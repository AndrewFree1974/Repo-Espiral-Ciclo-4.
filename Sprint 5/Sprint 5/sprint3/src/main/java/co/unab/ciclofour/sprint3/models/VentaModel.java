package co.unab.ciclofour.sprint3.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class VentaModel {
    @Id
    private String idVenta;
    @Field
    private UsuarioModel nombre;
    @Field
    private UsuarioModel apellido;
    @Field
    private UsuarioModel telefono;
    @Field
    private UsuarioModel numIdentificacion;
    @Field
    private LibroModel nombreLibro;
    @Field
    private LibroModel precio;
    @Field
    private Number cantidad;
    
    public VentaModel() {
    }

    public VentaModel(String idVenta, UsuarioModel nombre, UsuarioModel apellido, UsuarioModel telefono,
            UsuarioModel numIdentificacion, LibroModel nombreLibro, LibroModel precio, Number cantidad) {
        this.idVenta = idVenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.numIdentificacion = numIdentificacion;
        this.nombreLibro = nombreLibro;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public UsuarioModel getNombre() {
        return nombre;
    }

    public void setNombre(UsuarioModel nombre) {
        this.nombre = nombre;
    }

    public UsuarioModel getApellido() {
        return apellido;
    }

    public void setApellido(UsuarioModel apellido) {
        this.apellido = apellido;
    }

    public UsuarioModel getTelefono() {
        return telefono;
    }

    public void setTelefono(UsuarioModel telefono) {
        this.telefono = telefono;
    }

    public UsuarioModel getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(UsuarioModel numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public LibroModel getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(LibroModel nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public LibroModel getPrecio() {
        return precio;
    }

    public void setPrecio(LibroModel precio) {
        this.precio = precio;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
