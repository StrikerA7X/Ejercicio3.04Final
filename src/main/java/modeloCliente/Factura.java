/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCliente;

/**
 *
 * @author TUF GAMING
 */
public class Factura {

     
    private int codigo;
    private String nombre;
    private String direccion;
    private Cliente cliente;

    public Factura(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Factura(Integer valueOf, String arg, String arg0, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  
    public Cliente getCliente() {
       
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", direccion=" + direccion + ", cliente=" + cliente.toString() + '}';
    }

    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
