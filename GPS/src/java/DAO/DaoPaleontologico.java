/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanGeositio;
import BEAN.BeanPaleontologico;
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
public class DaoPaleontologico extends Conexion implements InterfaceCrud {
    private Connection conexion = null;
    private Statement puente = null;
  private ResultSet comando = null;
  
    public boolean encontrado = false;
  public boolean listo = false;
  
  private String id_paleontologico="";
    private String nombre="";
    private String localidad="";
    private String capas="";
    private String fosiles="";
    private String tipo_roca="";
    private String tipo="";
    private String fk_era="";
    private String fk_periodo="";
    
    public DaoPaleontologico (){
    }
    
    public DaoPaleontologico (BeanPaleontologico Bpaleontologico ){
            super();
    try {
      conexion = this.obtenerConexion();
      puente = conexion.createStatement();

      id_paleontologico = Bpaleontologico.getId_paleontologico();
      nombre = Bpaleontologico.getNombre();
      localidad = Bpaleontologico.getLocalidad();
      capas = Bpaleontologico.getCapas();
      fosiles = Bpaleontologico.getFosiles();
      tipo_roca = Bpaleontologico.getTipo_roca();
      tipo = Bpaleontologico.getTipo();
      fk_era = Bpaleontologico.getFk_era();
      fk_periodo = Bpaleontologico.getFk_periodo();


    } catch (Exception e) {
      Logger.getLogger(DaoPaleontologico.class.getName()).log(Level.SEVERE, null, e);
    }
        
        
    
    }

    @Override
    public boolean AgregarRegistro() {
        try {
            puente.executeUpdate("insert into yacimiento_paleontologico(nombre, localidad, capas, fosiles, tipoRoca, tipo, fk_era, fk_periodo)"
                    + "values('" + nombre + "','" + localidad + "','" + capas + "','" + fosiles + "','" + tipo_roca + "','" + tipo + "','" + fk_era + "','" + fk_periodo + "');");
            listo = true;

        } catch (Exception e) {
            Logger.getLogger(DaoYacimientoGeologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    

    @Override
    public boolean ActualizarRegistro() {
        try {
            puente.executeUpdate("update yacimiento_paleontologico set nombre='" + nombre + "', localidad='" + localidad + "', capas='" + capas + "', fosiles='" + fosiles + "', tipoRoca='" + tipo_roca + "', tipo='" + tipo + "', fk_era='" + fk_era + "',fk_periodo='" + fk_periodo + "' where id_paleontologico = '" + id_paleontologico + "';");

            listo = true;
        } catch (Exception e) {
            Logger.getLogger(DaoPaleontologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }
    public static BeanPaleontologico consultaporidentificador(String idPa) {
        BeanPaleontologico BPa = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from yacimiento_paleontologico where id_paleontologico = '" + idPa + "'");
            while (rs.next()){
                BPa = new BeanPaleontologico(idPa, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BPa;
    }
    
        public ArrayList<BeanPaleontologico> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanPaleontologico> listaPale = new ArrayList<BeanPaleontologico>();

        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from yacimiento_paleontologico");

            while (comando.next()) {
                id_paleontologico = comando.getString("id_paleontologico");
                nombre = comando.getString("nombre");
                localidad = comando.getString("localidad");
                capas = comando.getString("capas");
                fosiles = comando.getString("fosiles");
                tipo_roca = comando.getString("tipoRoca");
                tipo = comando.getString("tipo");
                fk_era = comando.getString("fk_era");
                fk_periodo = comando.getString("fk_periodo");

                
                BeanPaleontologico bPale = new BeanPaleontologico();
                bPale.setId_paleontologico(id_paleontologico);
                bPale.setNombre(nombre);
                bPale.setLocalidad(localidad);
                bPale.setCapas(capas);
                bPale.setFosiles(fosiles);
                bPale.setTipo_roca(tipo_roca);
                bPale.setTipo(tipo);
                bPale.setFk_era(fk_era);
                bPale.setFk_periodo(fk_periodo);

                listaPale.add(bPale);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoPaleontologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaPale;

    }
    
    
}
