/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.BeanFauna;
import BEAN.BeanGeositio;
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
 * @author cotrof
 */
public class DaoFauna extends Conexion implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet comando = null;

    public boolean encontrado = false;
    public boolean listo = false;

    private String id_fauna = "";
    private String especie = "";
    private String Ecosistema = "";
    private String habitat = "";
    private String tipo = "";
    private String fk_geositio = "";
    private String fk_guardabosques = "";

    
    public DaoFauna(){
      
    }
    public DaoFauna(BeanFauna BFauna) {
        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            id_fauna = BFauna.getId_fauna();
            especie = BFauna.getEspecie();
            Ecosistema = BFauna.getEcosistema();
            habitat = BFauna.getHabitat();
            tipo = BFauna.getTipo();
            fk_geositio = BFauna.getFk_geositio();
            fk_guardabosques = BFauna.getFk_guardabosques();

        } catch (Exception e) {
            Logger.getLogger(DaoFauna.class.getName()).log(Level.SEVERE, null, e);

        }

    }
    
    
 
     
   

    @Override
    public boolean AgregarRegistro() {
        try {
            puente.executeUpdate("insert into fauna(especie,Ecosistema,habitat,tipo,fk_geositio,fk_guardabosques)"
                    + "values('" + especie + "','" + Ecosistema + "','" + habitat + "','" + tipo + "','" + fk_geositio + "','" + fk_guardabosques + "');");
            listo = true;

        } catch (Exception e) {
            Logger.getLogger(DaoFauna.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }

    @Override
    public boolean ActualizarRegistro() {
        try {
            puente.executeUpdate("update fauna set especie='" + especie + "', Ecosistema='" + Ecosistema + "', habitat='" + habitat + "', tipo='" + tipo + "', fk_geositio='" + fk_geositio + "', fk_guardabosques='" +fk_guardabosques + "' where id_fauna = '" + id_fauna + "';");

            listo = true;
        } catch (Exception e) {
            Logger.getLogger(DaoFauna.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }
    
    
    
    public static BeanFauna consultaporidentificador(String idFa) {
        BeanFauna BFa = null;
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from fauna where id_fauna = '" + idFa + "'");
            while (rs.next()){
                BFa=new BeanFauna(idFa, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        
        return BFa;
    }
     public ArrayList<BeanFauna> listar() {
        Conexion conexion = new Conexion();
        ArrayList<BeanFauna> listaFauna = new ArrayList<BeanFauna>();
        try {
            puente = conexion.obtenerConexion().createStatement();
            comando = puente.executeQuery("select * from fauna");
            while (comando.next()) {
                id_fauna = comando.getString("id_fauna");
                especie = comando.getString("especie");
                Ecosistema = comando.getString("Ecosistema");
                habitat = comando.getString("habitat");
                tipo = comando.getString("tipo");
                fk_geositio = comando.getString("fk_geositio");
                fk_guardabosques = comando.getString("fk_guardabosques");
               

                BeanFauna bFauna = new BeanFauna();
                bFauna.setId_fauna(id_fauna);
                bFauna.setEspecie(especie);
                bFauna.setEcosistema(Ecosistema);
                bFauna.setHabitat(habitat);
                bFauna.setTipo(tipo);
                bFauna.setFk_geositio(fk_geositio);
                bFauna.setFk_guardabosques(fk_guardabosques);

                listaFauna.add(bFauna);

            }
        } catch (Exception e) {
            Logger.getLogger(DaoFauna.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaFauna;

    }
    


}
