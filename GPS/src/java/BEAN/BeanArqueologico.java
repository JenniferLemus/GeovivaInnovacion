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
public class BeanArqueologico {
        private String id_arqueologico;
    private String nombre;
    private String ubicacion;
    private String cultura;
    private String formacion;
    private String cronologico;
    private String funcional;
    private String tipologia;
    private String duracion;
    private String fk_era;
    private String fk_periodo;

    public BeanArqueologico() {
       
    }

    public String getId_arqueologico() {
        return id_arqueologico;
    }

    public void setId_arqueologico(String id_arqueologico) {
        this.id_arqueologico = id_arqueologico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getCronologico() {
        return cronologico;
    }

    public void setCronologico(String cronologico) {
        this.cronologico = cronologico;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFk_era() {
        return fk_era;
    }

    public void setFk_era(String fk_era) {
        this.fk_era = fk_era;
    }

    public String getFk_periodo() {
        return fk_periodo;
    }

    public void setFk_periodo(String fk_periodo) {
        this.fk_periodo = fk_periodo;
    }
  

    public BeanArqueologico(String id_arqueologico, String nombre, String ubicacion, String cultura, String formacion, String cronologico, String funcional, String tipologia, String duracion, String fk_era, String fk_periodo) {
        this.id_arqueologico = id_arqueologico;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cultura = cultura;
        this.formacion = formacion;
        this.cronologico = cronologico;
        this.funcional = funcional;
        this.tipologia = tipologia;
        this.duracion = duracion;
        this.fk_era = fk_era;
        this.fk_periodo = fk_periodo;
    }

  
}
