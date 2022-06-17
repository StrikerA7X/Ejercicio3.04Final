/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Factura;

/**
 *
 * @author TUF GAMING
 */
public class FacturaServicio implements IFacturaSerivicio {

 private static final List<Factura> facturaList = new ArrayList<>();

    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
        var posicion = this.buscarposicion(this.buscarPorCodigo(codigoFactura));
        this.listar().get(posicion).setCodigo(facturaNuevo.getCodigo());
        this.listar().get(posicion).setNombre(facturaNuevo.getNombre());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        return facturaNuevo;
    }

    public Factura eliminar(int codigoFactura) {
        Factura factura = this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPorCodigo(codigoFactura);
        this.listar().remove(posicion);
        return factura;
    }

    public Factura buscarPorCodigo(int codigoFactura) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFactura==f.getCodigo()){
                factura=f;
                break;
            }
        }
        return factura;
    }

    public int buscarposicion(Factura factura) {
    int posicion=-1;
        for(var f:this.facturaList){
            posicion++;
            if(f.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    public List<Factura> listar() {
        return this.facturaList;
    }
    
}