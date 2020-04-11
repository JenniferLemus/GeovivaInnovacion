 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanFlora;
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
 * @author cotrof
 */
public class DaoFlora extends Conexion implements InterfaceCrud {

  private Connection conexion = null;
  private Statement puente = null;
  private ResultSet comando = null;

  public boolean encontrado = false;
  public boolean listo = false;

  private String id_flora = "";
  private String tipo = "";
  private String numeroIndividuos = "";
  private String tamano = "";
  private String fk_geositio = "";
  private String fk_guardabosques = "";

  public DaoFlora() {
  }

  public DaoFlora(BeanFlora BFlora) {
    super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      id_flora = BFlora.getId_flora();
      tipo = BFlora.getTipo();
      numeroIndividuos = BFlora.getNumeroIndividuos();
      tamano = BFlora.getTamano();
      fk_geositio = BFlora.getFk_geositio();
      fk_guardabosques = BFlora.getFk_guardabosques();

    } catch (Exception e) {
      Logger.getLogger(DaoFlora.class.getName()).log(Level.SEVERE, null, e);

    }

  }

  @Override
  public boolean AgregarRegistro() {
    try {
      puente.executeUpdate("insert into flora(tipo,numeroIndividuos,tamano,fk_geositio,fk_guardabosques)"
              + "values('" + tipo + "','" + numeroIndividuos + "','" + tamano + "','" + fk_geositio + "','" + fk_guardabosques + "');");
      listo = true;

    } catch (Exception e) {
      Logger.getLogger(DaoFlora.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  @Override
  public boolean ActualizarRegistro() {
    try {
      puente.executeUpdate("update flora set tipo='" + tipo + "', numeroIndividuos='" + numeroIndividuos + "', tamano='" + tamano + "', fk_geositio='" + fk_geositio + "', fk_guardabosques='" + fk_guardabosques + "' where id_flora = '" + id_flora + "';");

      listo = true;
    } catch (Exception e) {
      Logger.getLogger(DaoFlora.class.getName()).log(Level.SEVERE, null, e);
    }
    return listo;
  }

  public static BeanFlora consultaporidentificador(String idFlo) {
    BeanFlora BFlo = null;
    try {
      Conexion conexion = new Conexion();
      Connection con = conexion.obtenerConexion();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from flora where id_flora = '" + idFlo + "'");
      while (rs.next()) {
        BFlo = new BeanFlora(idFlo, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
      }
      rs.close();
      st.close();
    } catch (Exception e) {
    }

    return BFlo;
  }

  public ArrayList<BeanFlora> listar() {
    Conexion conexion = new Conexion();
    ArrayList<BeanFlora> listaFlora = new ArrayList<BeanFlora>();

    try {
      puente = conexion.obtenerConexion().createStatement();
      comando = puente.executeQuery("select * from flora");

      while (comando.next()) {
        id_flora = comando.getString("id_flora");
        tipo = comando.getString("tipo");
        numeroIndividuos = comando.getString("numeroIndividuos");
        tamano = comando.getString("tamano");
        fk_geositio = comando.getString("fk_geositio");
        fk_guardabosques = comando.getString("fk_guardabosques");

        BeanFlora bflora = new BeanFlora();
        bflora.setId_flora(id_flora);
        bflora.setTipo(tipo);
        bflora.setNumeroIndividuos(numeroIndividuos);
        bflora.setTamaño(tamano);
        bflora.setFk_geositio(fk_geositio);
        bflora.setFk_guardabosques(fk_guardabosques);

        listaFlora.add(bflora);

      }
    } catch (Exception e) {
      Logger.getLogger(DaoFlora.class.getName()).log(Level.SEVERE, null, e);
    }
    return listaFlora;

  }
}
