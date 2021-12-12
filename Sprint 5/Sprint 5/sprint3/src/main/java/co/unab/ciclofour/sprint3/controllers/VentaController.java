package co.unab.ciclofour.sprint3.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.ciclofour.sprint3.models.VentaModel;
import co.unab.ciclofour.sprint3.services.VentaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/ventas")
public class VentaController {
    
    @Autowired
    VentaService ventaService;

    @GetMapping()
    public ArrayList<VentaModel> obtenerFacturas(){
        return ventaService.obtenerFacturas();
    }

    @PostMapping
    public VentaModel guardarVenta(@RequestBody VentaModel venta){
        return ventaService.guardarVenta(venta);
    }

    @DeleteMapping(path = "/{idVenta}")
    public String eliminarVentaById(@PathVariable("idVenta") String idVenta){
        boolean resultadoEliminar=this.ventaService.eliminarFactura(idVenta);
        if(resultadoEliminar){
            return "Se eliminó el libro con el ISBN: " + idVenta;
        }else{
            return "No se logró eliminar el libro con el ISBN: " + idVenta;
        }
    }

}
