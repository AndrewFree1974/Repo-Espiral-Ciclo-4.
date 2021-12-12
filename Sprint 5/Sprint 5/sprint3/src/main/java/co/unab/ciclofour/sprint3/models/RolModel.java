package co.unab.ciclofour.sprint3.models;

import org.springframework.data.annotation.Id;

public class RolModel {
    @Id
    private String id_role;
    private String nombre_role;
    
    public RolModel() {
    }

    public RolModel(String id_role, String nombre_role) {
        this.id_role = id_role;
        this.nombre_role = nombre_role;
    }

    public String getId_role() {
        return id_role;
    }

    public void setId_role(String id_role) {
        this.id_role = id_role;
    }

    public String getNombre_role() {
        return nombre_role;
    }

    public void setNombre_role(String nombre_role) {
        this.nombre_role = nombre_role;
    }

    
}
