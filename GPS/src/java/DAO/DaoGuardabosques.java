/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanGuardabosques;
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
 * @author Userdata11
 */
public class DaoGuardabosques extends Conexion implements InterfaceCrud {

  private Connection conexion = null;
  private Statement puente = null;
  private ResultSet comando = null;

  public boolean encontrado = false;
  public boolean listo = false;

  private String id_guarda = "";
  private String nombre = "";
  private String apellido = "";
  private String telefono = "";
  private String poblacionAledana = "";
  private String TipoDocumento = "";
  private String numeroDocumento = "";

  public DaoGuardabosques() {

  }

  public DaoGuardabosques(BeanGuardabosques BGuardabosques) {

    super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      id_guarda = BGuardabosques.getId_guarda();
      nombre = BGuardabosques.getNombre();
      apellido = BGuardabosques.getApellido();
      telefono = BGuardabosques.getTelefono();
      poblacionAledana = BGuardabosques.getPoblacionAledana();
      TipoDocumento = BGuardabosques.getTipoDocumento();
      numeroDocumento = BGuardabosques.getNumeroDocumento();

    } catch (Exception e) {
      Logger.getLogger(DaoGuardabosques.class.getName()).log(Level.SEVERE, null, e);
    }

  }
    public static ArrayList<BeanGuardabosques> ListarGuardabosques() {
       BeanGuardabosques BGuardabosques = null;
       ArrayList<BeanGuardabosques> listGuardabos = new ArrayList<>();
       try {
           Conexion conexion = new Conexion();
           Connection conn = conexion.obtenerConexion();
           Statement puente = conn.createStatement();

           ResultSet rs = puente.executeQuery("select * from guardabosques");
           while (rs.next()) {
               BGuardabosques = new BeanGuardabosques(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

               listGuardabos.add(BGuardabosques);

           }

           rs.close();
           puente.close();

       } catch (Exception e) {
           Logger.getLogger(DaoGuardabosques.class.getName()).log(Level.SEVERE, null, e);

       }
       return listGuardabos;
   }

  @Override
  public boolean AgregarRegistro() {
    try {
      puente.executeUpdate("insert into guardabosques( "
              + "nombre,apellido,telefono,poblacionAledana,TipoDocumento,numeroDocumento)"
              + "values('" + nombre + "','" + apellido + "','" + telefono + "','" + poblacionAledana + "','" + TipoDocumento + "','" + numeroDocumento + "');");
      listo = true;

    } catch (Exception e) {
      Logger.getLogger(DaoGuardabosques.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  @Override
  public boolean ActualizarRegistro() {
    try {
      puente.executeUpdate("update guardabosques set nombre='" + nombre + "', apellido='" + apellido + "', telefono='" + telefono + "', poblacionAledana='" + poblacionAledana + "', TipoDocumento='" + TipoDocumento + "', numeroDocumento='" + numeroDocumento + "';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoGuardabosques.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  public static BeanGuardabosques consultaporidentificador(String idGu) {
    BeanGuardabosques BGu = null;
    try {
      Conexion conexion = new Conexion();
      Connection con = conexion.obtenerConexion();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from guardabosques where id_guarda = '" + idGu + "'");
      while (rs.next()) {
        BGu = new BeanGuardabosques(idGu, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
      }
      rs.close();
      st.close();
    } catch (Exception e) {
    }

    return BGu;
  }

  public ArrayList<BeanGuardabosques> listar() {
    Conexion conexion = new Conexion();
    ArrayList<BeanGuardabosques> listaGuardabosques = new ArrayList<BeanGuardabosques>();

    try {
      puente = conexion.obtenerConexion().createStatement();
      comando = puente.executeQuery("select * from guardabosques");

      while (comando.next()) {
        id_guarda = comando.getString("id_guarda");
        nombre = comando.getString("nombre");
        apellido = comando.getString("apellido");
        telefono = comando.getString("telefono");
        poblacionAledana = comando.getString("poblacionAledana");
        TipoDocumento = comando.getString("TipoDocumento");
        numeroDocumento = comando.getString("numeroDocumento");

        BeanGuardabosques bGuarda = new BeanGuardabosques();
        bGuarda.setId_guarda(id_guarda);
        bGuarda.setNombre(nombre);
        bGuarda.setApellido(apellido);
        bGuarda.setTelefono(telefono);
        bGuarda.setPoblacionAledana(poblacionAledana);
        bGuarda.setTipoDocumento(TipoDocumento);
        bGuarda.setNumeroDocumento(numeroDocumento);

        listaGuardabosques.add(bGuarda);

      }
    } catch (Exception e) {
      Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
    }
    return listaGuardabosques;

  }

}
