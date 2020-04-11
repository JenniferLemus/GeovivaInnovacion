/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanGeologo;
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
 * @author UserData05
 */
public class DaoGeologo extends Conexion implements InterfaceCrud {
    private Connection conexion = null;
    private Statement puente = null;
  private ResultSet comando = null;

  public boolean encontrado = false;
  public boolean listo = false;
  
  private String id_geologo="";
    private String nombre="";
    private String apellido="";
    private String telefono="";
    private String tipoDocumento="";
    private String numeroDocumento="";
    private String correo="";
    private String entidad="";

    public DaoGeologo (){
        
    }
    
    public DaoGeologo (BeanGeologo BGeologo ){
            super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      id_geologo = BGeologo.getId_geologo();
      nombre = BGeologo.getNombre();
      apellido = BGeologo.getApellido();
      telefono = BGeologo.getTelefono();
      tipoDocumento = BGeologo.getTipoDocumento();
      numeroDocumento = BGeologo.getNumeroDocumento();
      correo = BGeologo.getCorreo();
      entidad = BGeologo.getEntidad();


    } catch (Exception e) {
      Logger.getLogger(DaoGeologo.class.getName()).log(Level.SEVERE, null, e);
    }
        
        
    
    }
          public static ArrayList<BeanGeologo> ListarGeologo(){
        BeanGeologo BGe= null;
        ArrayList<BeanGeologo> listGeo= new ArrayList<>();
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.obtenerConexion();
            Statement puente = conn.createStatement();
            
            ResultSet rs= puente.executeQuery("select * from geologo");
            while(rs.next()){
                BGe = new BeanGeologo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                
                listGeo.add(BGe);
           
            }
            
            rs.close();
            puente.close();
            
        } catch (Exception e) {
              Logger.getLogger(DaoGeologo.class.getName()).log(Level.SEVERE, null, e);
  
        }
        return listGeo;
         }
    
    @Override
    public boolean AgregarRegistro() {
        try {
            puente.executeUpdate("insert into geologo(nombre, apellido, telefono, tipoDocumento, numeroDocumento, correo, entidad)"
            +"values('"+nombre + "','" + apellido +"','" + telefono + "','" + tipoDocumento + "','" + numeroDocumento + "','" + correo + "','" + entidad + "');");        
            
            listo = true;
            
        } catch (Exception e) {
            Logger.getLogger(DaoGeologo.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    @Override
    public boolean ActualizarRegistro() {
          try {
      puente.executeUpdate("update geologo set nombre='" + nombre + "', apellido='" + apellido + "', telefono='" + telefono + "', telefono='" + telefono + "', tipoDocumento='" + tipoDocumento + "', numeroDocumento='" + numeroDocumento + "',correo='"+correo+"',entidad='"+entidad+"';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoGeologo.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
    }
     public static BeanGeologo consultaporidentificador(String idGe) {
        BeanGeologo BGe = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from geologo where id_geologo = '" + idGe + "'");
            while (rs.next()){
                BGe=new BeanGeologo(idGe, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BGe;
    }
    
    
    public ArrayList<BeanGeologo> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanGeologo> listaGeologos = new ArrayList<BeanGeologo>();

        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from geologo");

            while (comando.next()) {
                id_geologo = comando.getString("id_geologo");
                nombre = comando.getString("nombre");
                apellido = comando.getString("apellido");
                telefono = comando.getString("telefono");
                tipoDocumento = comando.getString("tipoDocumento");
                numeroDocumento = comando.getString("numeroDocumento");
                correo = comando.getString("correo");
                entidad = comando.getString("entidad");
                
                
                BeanGeologo bGeologo = new BeanGeologo();
                bGeologo.setId_geologo(id_geologo);
                bGeologo.setNombre(nombre);
                bGeologo.setApellido(apellido);
                bGeologo.setTelefono(telefono);
                bGeologo.setTipoDocumento(tipoDocumento);
                bGeologo.setNumeroDocumento(numeroDocumento);
                bGeologo.setCorreo(correo);
                bGeologo.setEntidad(entidad);
       

                listaGeologos.add(bGeologo);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoGeologo.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaGeologos;

    }
}

    