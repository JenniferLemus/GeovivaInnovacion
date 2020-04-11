/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author Userdata11
 */
public class BeanPaleontologico {
    private String id_paleontologico;
    private String nombre;
    private String localidad;
    private String capas;
    private String fosiles;
    private String tipo_roca;
    private String tipo;
    private String fk_era;
    private String fk_periodo;
    
      public BeanPaleontologico(String id_paleontologico, String nombre, String localidad, String capas, String fosiles, String tipo_roca, String tipo, String fk_era, String fk_periodo) {
    
        this.id_paleontologico = id_paleontologico;
        this.nombre = nombre;
        this.localidad = localidad;
        this.capas = capas;
        this.fosiles = fosiles;
        this.tipo_roca = tipo_roca;
        this.tipo = tipo;
        this.fk_era = fk_era;
        this.fk_periodo = fk_periodo;

    }

    public BeanPaleontologico() {
       
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
    
    
    


    public String getId_paleontologico() {
        return id_paleontologico;
    }

    public void setId_paleontologico(String id_paleontologico) {
        this.id_paleontologico = id_paleontologico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCapas() {
        return capas;
    }

    public void setCapas(String capas) {
        this.capas = capas;
    }

    public String getFosiles() {
        return fosiles;
    }

    public void setFosiles(String fosiles) {
        this.fosiles = fosiles;
    }

    public String getTipo_roca() {
        return tipo_roca;
    }

    public void setTipo_roca(String tipo_roca) {
        this.tipo_roca = tipo_roca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
  
    
}
