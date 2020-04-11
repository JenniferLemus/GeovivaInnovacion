/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jennifer
 */
public class Conexion {
    
         public String driver,urlbd,user,password,bd;
     Connection conexion;
     
     
     public Conexion (){
         
         driver = "com.mysql.jdbc.Driver";
         bd="gps";
         user = "root";
         password="";
         urlbd = "jdbc:mysql://localhost:3306/" + bd;
         
         try{
         Class.forName(driver).newInstance();
         conexion = DriverManager.getConnection(urlbd,user,password);
         
             System.err.println("conexion OK!");
         
         } catch (Exception e) {
             
             System.err.println("error al conectar con base de datos"+e);
         
         }
         
     }

     public Connection obtenerConexion (){
         
        return conexion;
     }
     
     public Connection cerrarConexion() throws SQLException{
         
         conexion.close();
         conexion = null;
         return conexion;
     }
     
     public static void main(String[] args) {
        new Conexion ();
    }
}
   
