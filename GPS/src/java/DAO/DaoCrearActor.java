/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanCrearActor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import util.InterfaceCrud;

/**
 *
 * @author SENA
 */
public class DaoCrearActor extends Conexion implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet comando = null;
    //encontrado = a buscar en la base datos
    //listo = para saber si todo esta efectuado
    public boolean encontrado = false;
    public boolean listo = false;

    private String Tipo;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String PoblacionAledaña;
    private String id_actor;
    private String NumeroIdentificacion;

    public DaoCrearActor(BeanCrearActor BC) {
        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            this.Tipo = BC.getTipo();
            this.Nombres = BC.getNombres();
            this.Apellidos = BC.getApellidos();
            this.Telefono = BC.getTelefono();
            this.PoblacionAledaña = BC.getPoblacionAledaña();
            this.id_actor = BC.getId_actor();
            this.NumeroIdentificacion = BC.getNumeroIdentificacion();
        } catch (Exception e) {
            Logger.getLogger(DaoCrearActor.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean AgregarRegistro() {
        try {

            puente.executeUpdate("insert into guardabosques(`Tipo`, `nombres`, `apellidos`, `telefono`, `PoblacionAledaña`,`NumeroIdentficacion`,)"
                    + "values('" + this.Tipo + "','" + this.Nombres + "','" + this.Apellidos + "','" + this.Telefono + "',"
                    + "'" + this.PoblacionAledaña + "','" + this.NumeroIdentificacion + "');");
            listo = true;

        } catch (Exception e) {
            Logger.getLogger(DaoCrearActor.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    @Override
    public boolean ActualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
