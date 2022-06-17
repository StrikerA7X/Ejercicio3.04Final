/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCliente;

import java.time.LocalDate;

/**
 *
 * @author TUF GAMING
 */
public class Producto {
       private int precio;
    private String nombre;
    private String marca;
   
    

    public Producto(int precio, String nombre, String marca){
            
        this.precio = precio;
        this.nombre = nombre;
        this.marca = marca;
    
      
    }

    public Producto(int precio, String nombre, String marca, 
            LocalDate fechaNacimiento) {
        this.precio = precio;
        this.nombre = nombre;
        this.marca = marca;
        
    }

    public Producto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void set(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + 
                ", nombre=" + nombre + ", marca=" + 
                marca + '}';
    }  

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
