package co.edu.unab.apirestunab.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class AdministradorModel {
    


    @Id
    private UsuarioModel usuario;
    private AddressModel direccion;
    
    public AdministradorModel() {
    }

    public AdministradorModel(UsuarioModel usuario, AddressModel direccion) {
        this.usuario = usuario;
        this.direccion = direccion;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public AddressModel getDireccion() {
        return direccion;
    }

    public void setDireccion(AddressModel direccion) {
        this.direccion = direccion;
    }
    

    

    
    
   
}   

