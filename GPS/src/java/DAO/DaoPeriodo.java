/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanPeriodo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import util.InterfaceCrud;

/**
 *
 * @author Aprendiz
 */
public class DaoPeriodo extends Conexion implements InterfaceCrud{
    
     public static ArrayList<BeanPeriodo> Listaperiodo(){
        BeanPeriodo Bperiodo= null;
        ArrayList<BeanPeriodo> listPeriodo= new ArrayList<>();
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.obtenerConexion();
            Statement puente = conn.createStatement();
            
            ResultSet rs= puente.executeQuery("select * from periodo");
            while(rs.next()){
                Bperiodo = new BeanPeriodo(rs.getString(1),rs.getString(2));
                
                listPeriodo.add(Bperiodo);
           
            }
            
            rs.close();
            puente.close();
            
        } catch (Exception e) {
              Logger.getLogger(DaoEra.class.getName()).log(Level.SEVERE, null, e);
  
        }
        return listPeriodo;
         }

    @Override
    public boolean AgregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ActualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
