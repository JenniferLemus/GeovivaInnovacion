/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanArqueologico;
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
public class DaoArqueologico extends Conexion implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet comando = null;
    //encontrado = a buscar en la base datos

    //listo = para saber si todo esta efectuado
    public boolean encontrado = false;
    public boolean listo = false;

    private String id_arqueologico;
    private String nombre = "";
    private String ubicacion = "";
    private String cultura = "";
    private String formacion = "";
    private String cronologico = "";
    private String funcional = "";
    private String tipologia = "";
    private String duracion = "";
    private String fk_era = "";
    private String fk_periodo = "";

    public DaoArqueologico() {
    }

    public DaoArqueologico(BeanArqueologico Bar) {
        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            this.id_arqueologico = Bar.getId_arqueologico();
            this.nombre = Bar.getNombre();
            this.ubicacion = Bar.getUbicacion();
            this.cultura = Bar.getCultura();
            this.formacion = Bar.getFormacion();
            this.cronologico = Bar.getCronologico();
            this.funcional = Bar.getFuncional();
            this.tipologia = Bar.getTipologia();
            this.duracion = Bar.getDuracion();
            this.fk_era = Bar.getFk_era();
            this.fk_periodo = Bar.getFk_periodo();

        } catch (Exception e) {
            Logger.getLogger(DaoArqueologico.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean AgregarRegistro() {
        try {
            puente.executeUpdate("insert into arqueologico(nombre,ubicacion,cultura,formacion,cronologico,funcional,tipologia,duracion,fk_era,fk_periodo)"
                    + "values('" + nombre + "','" + ubicacion + "','" + cultura + "','" + formacion + "','" + cronologico + "','" + funcional + "','" + tipologia + "','" + duracion + "','" + fk_era + "','" + fk_periodo + "');");

            listo = true;
        } catch (Exception e) {
            Logger.getLogger(DaoArqueologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    @Override
    public boolean ActualizarRegistro() {
        try {
            puente.executeUpdate("update arqueologico set nombre='" + nombre + "', ubicacion='" + ubicacion + "', cultura='" + cultura + "', formacion='" + formacion + "', cronologico='" + cronologico + "', funcional='" + funcional + "', tipologia='" + tipologia + "', duracion='" + duracion + "', fk_era='" + fk_era + "',fk_periodo='" + fk_periodo + "' where id_arqueologico = '" + id_arqueologico + "';");

            listo = true;
        } catch (Exception e) {
            Logger.getLogger(DaoArqueologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    public static BeanArqueologico consultaporidentificador(String idAr) {
        BeanArqueologico BAr = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from arqueologico where id_arqueologico = '" + idAr + "'");
            while (rs.next()){
                BAr=new BeanArqueologico(idAr, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.     getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BAr;
    }

    public ArrayList<BeanArqueologico> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanArqueologico> listaArqueologico = new ArrayList<BeanArqueologico>();
        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from arqueologico");
            while (comando.next()) {
                id_arqueologico = comando.getString("id_arqueologico");
                nombre = comando.getString("nombre");
                ubicacion = comando.getString("ubicacion");
                cultura = comando.getString("cultura");
                formacion = comando.getString("formacion");
                cronologico = comando.getString("cronologico");
                funcional = comando.getString("funcional");
                tipologia = comando.getString("tipologia");
                duracion = comando.getString("duracion");
                fk_era = comando.getString("fk_era");
                fk_periodo = comando.getString("fk_periodo");

                BeanArqueologico bArqueologico = new BeanArqueologico();
                bArqueologico.setId_arqueologico(id_arqueologico);
                bArqueologico.setNombre(nombre);
                bArqueologico.setUbicacion(ubicacion);
                bArqueologico.setCultura(cultura);
                bArqueologico.setFormacion(formacion);
                bArqueologico.setCronologico(cronologico);
                bArqueologico.setFuncional(funcional);
                bArqueologico.setTipologia(tipologia);
                bArqueologico.setDuracion(duracion);
                bArqueologico.setFk_era(fk_era);
                bArqueologico.setFk_periodo(fk_periodo);

                listaArqueologico.add(bArqueologico);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoArqueologico.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaArqueologico;

    }

}
