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
public class cliente {
   String id_cliente;
   String nombre_razon_social;
   String telefono;
   String correo;
   String dni_ruc;

    public cliente(String id_cliente, String nombre_razon_social, String telefono, String correo, String dni_ruc) {
        this.id_cliente = id_cliente;
        this.nombre_razon_social = nombre_razon_social;
        this.telefono = telefono;
        this.correo = correo;
        this.dni_ruc = dni_ruc;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_razon_social() {
        return nombre_razon_social;
    }

    public void setNombre_razon_social(String nombre_razon_social) {
        this.nombre_razon_social = nombre_razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni_ruc() {
        return dni_ruc;
    }

    public void setDni_ruc(String dni_ruc) {
        this.dni_ruc = dni_ruc;
    }

   
}
