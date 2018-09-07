/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerimpl;

import configbd.conexionbd;
import dao.clienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class clienteCtrlImpl implements clienteDAO{
    
    conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<cliente> listDatos;
    
    public clienteCtrlImpl(){
        cx = new conexionbd();
    }
    
    @Override
    public boolean createCliente(Cliente cl){
        sql="INSERT INTO public.cliente(id_cliente,nombre_razon_social,telefono,correo,dni_ruc)"
                + "VALUES("+cl.getId_cliente()+"','"+cl.getNombre_razon_social()+"','"
                +cl.getTelefono()+"','"+cl.getCorreo()+"','"+cl.getDni_ruc()+"')";
        return cx.executeInsertUpdate(sql);
    }
    
    @Override
    public ArrayList<Cliente> readCliente(){
        listDatos = new ArrayList<>();
        sql = "SELECT id_cliente, nombre_razon_social , telefono, correo, dni_ruc "
                + "    FROM public.cliente";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Cliente(rs.getString("id_cliente"),rs.getString("nombre_razon_social"),rs.getString("telefono"),rs.getString("correo"),rs.getString("dni_ruc")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }
    
    @Override
    public boolean updateCliente(Cliente cl) {
        sql = "UPDATE public.cliente SET"
                + " nombre_razon_social = '"+cl.getNombre_razon_social()+"' , telefono = '"+cl.getTelefono()+"', correo = '"+cl.getCorreo()+"', dni_ruc = '"+cl.getDni_ruc()+"'"
                + " WHERE id_cliente = "+cl.getId_cliente()+" ";
        return cx.executeInsertUpdate(sql);
    }
    
    public boolean deleteCliente(String id) {       
        sql = "DELETE public.cliente "
                + "WHERE id_cliente = "+id+" ";
        return cx.executeInsertUpdate(sql);
    } 
}
