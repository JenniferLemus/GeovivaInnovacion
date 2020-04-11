/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import util.InterfaceCrud;

/**
 *
 * @author jennifer
 */
public class DaoUsuario extends Conexion implements InterfaceCrud{

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet comando = null;
    //encontrado = a buscar en la base datos

    //listo = para saber si todo esta efectuado
    public boolean encontrado = false;
    public boolean listo = false;

    private String id = "";
    private String username = "";
    private String pass = "";
    private String nivel = "";
    
       public DaoUsuario(BeanUsuario Busu) {
        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            this.id = Busu.getId();
            this.username = Busu.getUsername();
            this.pass = Busu.getPass();
            this.nivel = Busu.getNivel();
    

        } catch (Exception e) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean AgregarRegistro() {
            try {
            puente.executeUpdate("insert into usuarios (username, pass, nivel) values ('" + username + "','" + pass + "','" + nivel + "');");
            listo = true;
        } catch (Exception e) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    @Override
    public boolean ActualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
