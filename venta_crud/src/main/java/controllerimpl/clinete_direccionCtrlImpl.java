/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerimpl;

import configbd.conexionbd;
import dao.cliente_direccionDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author W10
 */
public class clinete_direccionCtrlImpl implements cliente_direccionDAO{
    
    conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<cliente_direccion> listDatos;
    
    
}
