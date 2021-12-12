package co.unab.ciclofour.sprint3.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class AddressModel {
    @Field
    private String ciudad;
    @Field
    private String departamento;
    @Field
    private String codigoPostal;


    public AddressModel() {
    }


    public AddressModel(String ciudad, String departamento, String codigoPostal) {
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getCodigoPostal() {
        return codigoPostal;
    }


    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    
    }
}
