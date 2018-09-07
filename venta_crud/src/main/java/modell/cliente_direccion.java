/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author W10
 */
public class cliente_direccion {
    String id_cliente_direccion;
    String direccion;
    String id_cliente;

    public cliente_direccion(String id_cliente_direccion, String direccion, String id_cliente) {
        this.id_cliente_direccion = id_cliente_direccion;
        this.direccion = direccion;
        this.id_cliente = id_cliente;
    }

    public String getId_cliente_direccion() {
        return id_cliente_direccion;
    }

    public void setId_cliente_direccion(String id_cliente_direccion) {
        this.id_cliente_direccion = id_cliente_direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
