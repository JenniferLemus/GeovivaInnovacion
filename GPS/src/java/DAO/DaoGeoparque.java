/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanGeoparque;
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
public class DaoGeoparque extends Conexion implements InterfaceCrud {

  private Connection conexion = null;
  private Statement puente = null;
  private ResultSet comando = null;

  public boolean encontrado = false;
  public boolean listo = false;

  private String id_geoparque = "";
  private String nombre = "";
  private String latitud = "";
  private String longitud = "";
  private String Pais = "";
  private String temperatura = "";
  private String piso_termico = "";
  private String fecha_registro = "";
  private String fk_geologo = "";

  public DaoGeoparque() {

  }

  public DaoGeoparque(BeanGeoparque BGeoparque) {

    super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      id_geoparque = BGeoparque.getId_geoparque();
      nombre = BGeoparque.getNombre();
      latitud = BGeoparque.getLatitud();
      longitud = BGeoparque.getLongitud();
      Pais = BGeoparque.getPais();
      temperatura = BGeoparque.getTemperatura();
      piso_termico = BGeoparque.getPiso_termico();
      fecha_registro = BGeoparque.getFecha_registro();
      fk_geologo = BGeoparque.getFk_geologo();

    } catch (Exception e) {
      Logger.getLogger(DaoGeoparque.class.getName()).log(Level.SEVERE, null, e);
    }

  }

  @Override
public boolean AgregarRegistro() {
       try {
           puente.executeUpdate("insert into geoparque(nombre, latitud, longitud, Pais, temperatura, piso_termico, fecha_registro, fk_geologo)"
                   + "values('" + nombre + "','" + latitud + "','" + longitud + "','" + Pais + "','" + temperatura + "','" + piso_termico + "','" + fecha_registro + "','" + fk_geologo + "');");

           listo = true;

       } catch (Exception e) {
           Logger.getLogger(DaoGeoparque.class.getName()).log(Level.SEVERE, null, e);
       }
       return listo;
   }

  @Override
  public boolean ActualizarRegistro() {
  try {
      puente.executeUpdate("update geoparque set nombre='" + nombre + "', latitud='" + latitud + "', longitud='" + longitud + "', Pais='" + Pais+ "',temperatura='"+temperatura+"',piso_termico='"+piso_termico+"',fecha_registro='"+fecha_registro+"',fk_geologo='"+fk_geologo+"';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoGeoparque.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
    
  }
  
   public ArrayList<BeanGeoparque> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanGeoparque> listaGeoparque = new ArrayList<BeanGeoparque>();

        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from geoparque");

            while (comando.next()) {
                id_geoparque = comando.getString("id_geoparque");
                nombre = comando.getString("nombre");
                latitud = comando.getString("latitud");
                longitud = comando.getString("longitud");
                Pais=comando.getString("Pais");
                temperatura = comando.getString("temperatura");
                piso_termico = comando.getString("piso_termico");
                fecha_registro = comando.getString("fecha_registro");
                fk_geologo = comando.getString("fk_geologo");
                
                
                BeanGeoparque bGeoparque = new BeanGeoparque();
                bGeoparque.setId_geoparque(id_geoparque);
                bGeoparque.setNombre(nombre);
                bGeoparque.setLatitud(latitud);
                bGeoparque.setLongitud(longitud);
                bGeoparque.setPais(Pais);
                bGeoparque.setTemperatura(temperatura);
                bGeoparque.setPiso_termico(piso_termico);
                bGeoparque.setFecha_registro(fecha_registro);
                bGeoparque.setFk_geologo(fk_geologo);
       

                listaGeoparque.add(bGeoparque);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoGeoparque.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaGeoparque;
        
        

    }
   
   
      public static ArrayList<BeanGeoparque> ListarGeoparque() {
       BeanGeoparque BGeopa = null;
       ArrayList<BeanGeoparque> listGeopa = new ArrayList<>();
       try {
           Conexion conexion = new Conexion();
           Connection conn = conexion.obtenerConexion();
           Statement puente = conn.createStatement();

           ResultSet rs = puente.executeQuery("select * from geoparque");
           while (rs.next()) {
               BGeopa = new BeanGeoparque(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

               listGeopa.add(BGeopa);

           }

           rs.close();
           puente.close();

       } catch (Exception e) {
           Logger.getLogger(DaoGeoparque.class.getName()).log(Level.SEVERE, null, e);

       }
       return listGeopa;
   }
   public static BeanGeoparque consultaporidentificador(String idGeo) {
        BeanGeoparque BGeo = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from geoparque where id_geoparque = '" + idGeo + "'");
            while (rs.next()){
                BGeo=new BeanGeoparque(idGeo, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BGeo;
    }
}
