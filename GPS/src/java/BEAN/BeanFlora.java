/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author cotrof
 */
public class BeanFlora {

    
      private String id_flora;
    private String tipo;
    private String numeroIndividuos;
    private String tamano;
    private String fk_geositio;
    private String fk_guardabosques;

    public BeanFlora() {
        
    }
    
    public String getId_flora() {
        return id_flora;
    }

    public void setId_flora(String id_flora) {
        this.id_flora = id_flora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroIndividuos() {
        return numeroIndividuos;
    }

    public void setNumeroIndividuos(String numeroIndividuos) {
        this.numeroIndividuos = numeroIndividuos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamaño(String tamaño) {
        this.tamano = tamaño;
    }

    public String getFk_geositio() {
        return fk_geositio;
    }

    public void setFk_geositio(String fk_geositio) {
        this.fk_geositio = fk_geositio;
    }

    public String getFk_guardabosques() {
        return fk_guardabosques;
    }

    public void setFk_guardabosques(String fk_guardabosques) {
        this.fk_guardabosques = fk_guardabosques;
    }

    
      
    
    
    public BeanFlora(String id_flora, String tipo, String numeroIndividuos, String tamano, String fk_geositio, String fk_guardabosques) {
        this.id_flora = id_flora;
        this.tipo = tipo;
        this.numeroIndividuos = numeroIndividuos;
        this.tamano = tamano;
        this.fk_geositio = fk_geositio;
        this.fk_guardabosques = fk_guardabosques;
    }

    
    
}
