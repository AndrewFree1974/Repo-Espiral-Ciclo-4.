package co.edu.unab.apirestunab.model;

public class EditorialModel {
    
    private String edicion;
    private String ubicacionBiblioteca;
    private String categoria;

    
    public EditorialModel() {
    }


    public EditorialModel(String edicion, String ubicacionBiblioteca, String categoria) {
        this.edicion = edicion;
        this.ubicacionBiblioteca = ubicacionBiblioteca;
        this.categoria = categoria;
    }


    public String getEdicion() {
        return edicion;
    }


    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }


    public String getUbicacionBiblioteca() {
        return ubicacionBiblioteca;
    }


    public void setUbicacionBiblioteca(String ubicacionBiblioteca) {
        this.ubicacionBiblioteca = ubicacionBiblioteca;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

}
