package co.edu.unab.apirestunab.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;


public class ProductoModel {
    
    @Id
    private String id;
    private String tituloLibro;
    private String autor;
    private EditorialModel editorial;
    private String isbn;
    private long precio;
    private LocalDate fechaPublicacion;
    private String descripcion;
    private String estado;
    

    public ProductoModel() {
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    public ProductoModel(String id, String tituloLibro, String autor, EditorialModel editorial, String isbn,
            long precio, LocalDate fechaPublicacion, String descripcion, String estado) {
        this.id = id;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EditorialModel getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialModel editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    



}
