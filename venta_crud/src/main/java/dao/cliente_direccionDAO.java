/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author W10
 */
public interface cliente_direccionDAO {
    public boolean createCliente_direccion(Cliente_direccion cd);
    public ArrayList<Cliente_direccion> readCliente();
    public boolean updateCliente(Cliente_direccion cd);
    public boolean deleteCliente_direccion(String id);
}
