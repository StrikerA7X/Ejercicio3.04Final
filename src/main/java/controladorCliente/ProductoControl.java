/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorCliente;

import java.time.LocalDate;
import java.util.List;
import modeloCliente.Producto;
import servicioCliente.ProductoServicio;

/**
 *
 * @author TUF GAMING
 */
public class ProductoControl {
    
    private final ProductoServicio productoServicio = new ProductoServicio();
    
       private final ProductoServicio facturaServicio = new ProductoServicio();
    
    public Producto crear(String [] args){
        var producto= new Producto(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.crear(producto);
        return producto;
    }
    
    public List<Producto> listar(){
        return this.facturaServicio.listar();
    }
}
