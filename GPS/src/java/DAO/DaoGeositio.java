/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanGeositio;
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
 * @author jennifer
 */
public class DaoGeositio extends Conexion implements InterfaceCrud {

  private Connection conexion = null;
  private Statement puente = null;
  private ResultSet comando = null;
    //encontrado = a buscar en la base datos
  //listo = para saber si todo esta efectuado
  public boolean encontrado = false;
  public boolean listo = false;

  private String idGeositio;
  private String latitud;
  private String longitud;
  private String fk_tipoGositio;
  private String fk_geoparque;
  
  
 public DaoGeositio(){
   
   }

  public DaoGeositio(BeanGeositio BGeositio) {
    super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      idGeositio = BGeositio.getIdGeositio();
      latitud = BGeositio.getLaitud();
      longitud = BGeositio.getLongitud();
      fk_tipoGositio = BGeositio.getFk_tipo_geositio();
      fk_geoparque = BGeositio.getFk_geoparque();

    } catch (Exception e) {

      Logger.getLogger(DaoGeositio.class.getName()).log(Level.SEVERE, null, e);
    }
  }
  
         public static ArrayList<BeanGeositio> ListarGeosi() {
       BeanGeositio BGeo = null;
       ArrayList<BeanGeositio> listGeo = new ArrayList<>();
       try {
           Conexion conexion = new Conexion();
           Connection conn = conexion.obtenerConexion();
           Statement puente = conn.createStatement();

           ResultSet rs = puente.executeQuery("select * from geositio");
           while (rs.next()) {
               BGeo = new BeanGeositio(rs.getString("id_geositio"), rs.getString("latitud"), rs.getString("longitud"), rs.getString("tipo_geositio"), rs.getString("fk_geoparque"));

               listGeo.add(BGeo);

           }

           rs.close();
           puente.close();

       } catch (Exception e) {
           Logger.getLogger(DaoGeositio.class.getName()).log(Level.SEVERE, null, e);

       }
       return listGeo;
   }

  @Override
  public boolean AgregarRegistro() {
    try {
      puente.executeUpdate("insert into geositio(latitud, longitud,tipo_geositio,fk_geoparque)"
              + "values('" + latitud + "','" + longitud + "','" + fk_tipoGositio + "','" + fk_geoparque + "');");
      listo = true;

    } catch (Exception e) {
      Logger.getLogger(DaoGeositio.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  @Override
  public boolean ActualizarRegistro() {
       try {
      puente.executeUpdate("update geositio set latitud='" + latitud + "', longitud='" + longitud + "', tipo_geositio='" + fk_tipoGositio + "', fk_geoparque='" + fk_geoparque + "';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoGeositio.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
    
    
   
  }
  
      public ArrayList<BeanGeositio> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanGeositio> listaGeositio = new ArrayList<BeanGeositio>();

        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from geositio");

            while (comando.next()) {
                idGeositio = comando.getString("id_geositio");
                latitud = comando.getString("latitud");
                longitud = comando.getString("longitud");
                fk_tipoGositio = comando.getString("tipo_geositio");
                fk_geoparque = comando.getString("fk_geoparque");

                
                
                BeanGeositio bGeositio = new BeanGeositio();
                bGeositio.setIdGeositio(idGeositio);
                bGeositio.setLaitud(latitud);
                bGeositio.setLongitud(longitud);
                bGeositio.setFk_tipo_geositio(fk_tipoGositio);
                bGeositio.setFk_geoparque(fk_geoparque);
             
                listaGeositio.add(bGeositio);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoGeositio.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaGeositio;

    }
      
      public static BeanGeositio consultaporidentificador(String idGeo) {
        BeanGeositio BGeo = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from geositio where id_geositio = '" + idGeo + "'");
            while (rs.next()){
                BGeo=new BeanGeositio(idGeo, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BGeo;
    }

}
