/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;


import java.util.List;
import modeloCliente.Cliente;

public interface IClienteServicio {
  public Cliente crear( Cliente cliente);
  public Cliente buscarPorCodigo(int codigoCliente);
  public List<Cliente> listar();
}  
