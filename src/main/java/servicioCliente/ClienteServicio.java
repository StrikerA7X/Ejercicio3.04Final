/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Cliente;

/**
 *
 * @author TUF GAMING
 */
public abstract class ClienteServicio implements IClienteServicio {
        private static final List<Cliente> clienteList = new ArrayList<>();

         @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }

    @Override
    public Cliente buscarPorCodigo(int codigoCliente) {
    Cliente cliente = null;
    for(var c: this.clienteList){
        if(codigoCliente==c.getCodigo()){
            cliente=c;
            break;
        }
    }
    return cliente;
    }    

}