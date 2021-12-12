package co.unab.ciclofour.sprint3.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.ciclofour.sprint3.models.VentaModel;
import co.unab.ciclofour.sprint3.repositories.VentaRepository;

@Service
public class VentaService {
    
    @Autowired
    VentaRepository ventaRepository;

    public ArrayList<VentaModel> obtenerFacturas(){
        return (ArrayList<VentaModel>) ventaRepository.findAll();
    }

    public VentaModel guardarVenta(VentaModel venta){
        venta.setNombre(venta.getNombre());
        return ventaRepository.save(venta);
    }

    public boolean eliminarFactura(String idVenta){
        if(ventaRepository.existsById(idVenta)){
            ventaRepository.deleteById(idVenta);
            return true;
        }else{
            return false;
        }
    }

}
