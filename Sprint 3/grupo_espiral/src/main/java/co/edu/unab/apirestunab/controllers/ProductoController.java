package co.edu.unab.apirestunab.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.unab.apirestunab.model.ProductoModel;
import co.edu.unab.apirestunab.services.ProductoServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/producto")

public class ProductoController {

    @Autowired
    ProductoServices productoService;


    @GetMapping()
    public ArrayList<ProductoModel> obtenerProducto() {
        return productoService.obtenerProducto();
    }

    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto) {
        return productoService.guardarProducto(producto);
    }


    @DeleteMapping(path="/{id}")
    public String eliminarProductoPorId(@PathVariable("id") String id) {
        if (this.productoService.eliminarProducto(id)) {
            return "Producto eliminado con id:" + id;
        } else {
            return "Producto no encontrado"+ id;
        }
    }

    @GetMapping(path="/{id}")
    public Optional <ProductoModel>obtenerProductoPorId(@PathVariable("id") String id) {
        return this.productoService.obtenerProductoPorId(id);
    }

    @GetMapping(path="/titu/{titulo}")
    public ArrayList<ProductoModel> obtenerProductoPorTitulo(@PathVariable("titulo") String titulo) {
        return this.productoService.obtenerProductoPorTitulo(titulo);
    }

    @GetMapping(path="/autor/{autor}")
    public ArrayList<ProductoModel> obtenerProductoPorAutor(@PathVariable("autor") String autor) {
        return this.productoService.obtenerProductoPorAutor(autor);
    }

    @GetMapping(path="/editorial/{editorial}")
    public ArrayList<ProductoModel> obtenerProductoPorEditorial(@PathVariable("editorial") String editorial) {
        return this.productoService.obtenerProductoPorEditorial(editorial);
    }

    @GetMapping(path="/isbn/{isbn}")
    public ArrayList<ProductoModel> obtenerProductoPorIsbn(@PathVariable("isbn") String isbn) {
        return this.productoService.obtenerProductoPorIsbn(isbn);
    }

    @GetMapping(path="/fechaPublicacion/{fechaPublicacion}")
    public ArrayList<ProductoModel> obtenerProductoPorFechaPublicacion(@PathVariable("fechaPublicacion") String fechaPublicacion) {
        return this.productoService.obtenerProductoPorFechaPublicacion(fechaPublicacion);
    }

    @GetMapping(path="/estado/{estado}")
    public ArrayList<ProductoModel> obtenerProductoPorEstado(@PathVariable("estado") String estado) {
        return this.productoService.obtenerProductoPorEstado(estado);
    }

    @GetMapping(path="/catetegoria/{categoria}")
    public ArrayList<ProductoModel> obtenerProductoPorCategoria(@PathVariable("categoria") String categoria) {
        return this.productoService.obtenerProductoPorCategoria(categoria);
    }

    
}
