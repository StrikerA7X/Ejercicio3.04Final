/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCliente;

/**
 *
 * @author TUF GAMING
 */
public class Cliente {
     private int codigo;
    private String nombre;
    private String edad;
   
 

    public Cliente(int codigo, String nombre, String edad) {
   
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
          
    }

    public Cliente(int codigo, String nombre, String edad, String placa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
       
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

    public String getedad() {
        return edad;
    }

    public void setedad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + 
                ", nombre=" + nombre + ", edad=" + edad + '}';
    
}

  
}
