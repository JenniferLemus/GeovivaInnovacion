package DAO;

import BEAN.BeanYacimientoGeologico;
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
 * @author Administrador
 */
public class DaoYacimientoGeologico extends Conexion implements InterfaceCrud {

  private Connection conexion = null;
  private Statement puente = null;
  private ResultSet comando = null;
    //encontrado = a buscar en la base datos

  //listo = para saber si todo esta efectuado
  public boolean encontrado = false;
  public boolean listo = false;

  private String id_Geologico = "";
  private String nombre = "";
  private String ubicacion = "";
  private String elevacion = "";
  private String pendiente = "";
  private String orientacion = "";
  private String estratificacion = "";
  private String formacion_rocosa = "";
  private String tipo_suelo = "";
  private String fk_era = "";
  private String fk_periodo = "";

  public DaoYacimientoGeologico() {

  }

  public DaoYacimientoGeologico(BeanYacimientoGeologico Ba) {
    super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      this.id_Geologico = Ba.getId_Geologico();
      this.nombre = Ba.getNombre();
      this.ubicacion = Ba.getUbicacion();
      this.elevacion = Ba.getElevacion();
      this.pendiente = Ba.getPendiente();
      this.orientacion = Ba.getOrientacion();
      this.estratificacion = Ba.getEstratificacion();
      this.formacion_rocosa = Ba.getFormacion_rocosa();
      this.tipo_suelo = Ba.getTipo_suelo();
      this.fk_era = Ba.getFk_era();
      this.fk_periodo = Ba.getFk_periodo();

    } catch (Exception e) {
      Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
    }

  }

  public boolean AgregarRegistro() {
       try {
           puente.executeUpdate("insert into yacimiento_geologico(nombre,ubicacion,elevacion,pendiente, orientacion,estratificacion, formacion_rocosa,tipo_suelo,fk_era,fk_periodo)"
                   + "values('" + nombre + "','" + ubicacion + "','" + elevacion + "','" + pendiente + "','" + orientacion + "','" + estratificacion + "','" + formacion_rocosa + "',"
                           + "'" + tipo_suelo + "','" + fk_era + "','" + fk_periodo + "');");
           listo = true;

       } catch (Exception e) {
           Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
       }
       return listo;
   }

  @Override
  public boolean ActualizarRegistro() {
    try {
      puente.executeUpdate("update yacimiento_geologico set nombre='" + nombre + "', ubicacion='" + ubicacion + "', elevacion='" + elevacion + "', pendiente='" + pendiente + "', orientacion='" + orientacion + "', estratificacion='" + estratificacion + "', formacion_rocosa='" + formacion_rocosa + "', tipo_suelo='" + tipo_suelo + "', fk_era='" + fk_era + "',fk_periodo='" + fk_periodo + "' where id_Geologico = '" + id_Geologico + "';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  public static BeanYacimientoGeologico consultaporidentificador(String idGeo) {
    BeanYacimientoGeologico BGeo = null;
    try {
      Conexion conexion = new Conexion();
      Connection con = conexion.obtenerConexion();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from yacimiento_geologico where id_Geologico = '" + idGeo + "'");
      while (rs.next()) {
        BGeo = new BeanYacimientoGeologico(idGeo, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
      }
      rs.close();
      st.close();
    } catch (Exception e) {
    }

    return BGeo;
  }

  public ArrayList<BeanYacimientoGeologico> listar() {
    Conexion conexion = new Conexion();
    ArrayList<BeanYacimientoGeologico> listaGeologico = new ArrayList<BeanYacimientoGeologico>();

    try {
      puente = conexion.obtenerConexion().createStatement();
      comando = puente.executeQuery("select * from yacimiento_geologico");

      while (comando.next()) {
        id_Geologico = comando.getString("id_Geologico");
        nombre = comando.getString("nombre");
        ubicacion = comando.getString("ubicacion");
        elevacion = comando.getString("elevacion");
        pendiente = comando.getString("pendiente");
        orientacion = comando.getString("orientacion");
        estratificacion = comando.getString("estratificacion");
        formacion_rocosa = comando.getString("formacion_rocosa");
        tipo_suelo = comando.getString("tipo_suelo");
        fk_era = comando.getString("fk_era");
        fk_periodo = comando.getString("fk_periodo");

        BeanYacimientoGeologico bGeologico = new BeanYacimientoGeologico();
        bGeologico.setId_Geologico(id_Geologico);
        bGeologico.setNombre(nombre);
        bGeologico.setUbicacion(ubicacion);
        bGeologico.setElevacion(elevacion);
        bGeologico.setPendiente(pendiente);
        bGeologico.setOrientacion(orientacion);
        bGeologico.setEstratificacion(estratificacion);
        bGeologico.setFormacion_rocosa(formacion_rocosa);
        bGeologico.setTipo_suelo(tipo_suelo);
        bGeologico.setFk_era(fk_era);
        bGeologico.setFk_periodo(fk_periodo);

        listaGeologico.add(bGeologico);

      }
    } catch (Exception e) {
      Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
    }
    return listaGeologico;

  }

} // Fin clase $(name)
