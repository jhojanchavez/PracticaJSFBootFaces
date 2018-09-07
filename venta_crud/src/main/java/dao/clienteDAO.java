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
public interface clienteDAO {
    public boolean createCliente(Cliente cl);
    public ArrayList<Cliente> readCliente();
    public boolean updateCliente(Cliente cl);
    public boolean deleteCliente(String id);
}
