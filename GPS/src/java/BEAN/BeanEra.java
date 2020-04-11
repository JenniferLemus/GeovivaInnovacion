/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author Aprendiz
 */
public class BeanEra {
     String id_era;
    String tipo;

    public BeanEra(String id_era, String tipo) {
        this.id_era = id_era;
        this.tipo = tipo;
    }

    public BeanEra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_era() {
        return id_era;
    }

    public void setId_era(String id_era) {
        this.id_era = id_era;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    
}
