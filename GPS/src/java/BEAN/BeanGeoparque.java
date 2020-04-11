/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author jennifer
 */
public class BeanGeoparque {
    
  private String id_geoparque;
  private String nombre;
  private String latitud;
  private String longitud;
  private String Pais;
  private String temperatura;
  private String piso_termico;
  private String fecha_registro;
  private String fk_geologo;

    public BeanGeoparque() {
        
    }

    public String getId_geoparque() {
        return id_geoparque;
    }

    public void setId_geoparque(String id_geoparque) {
        this.id_geoparque = id_geoparque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPiso_termico() {
        return piso_termico;
    }

    public void setPiso_termico(String piso_termico) {
        this.piso_termico = piso_termico;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFk_geologo() {
        return fk_geologo;
    }

    public void setFk_geologo(String fk_geologo) {
        this.fk_geologo = fk_geologo;
    }
   

    public BeanGeoparque(String id_geoparque, String nombre, String latitud, String longitud, String Pais, String temperatura, String piso_termico, String fecha_registro, String fk_geologo) {
        this.id_geoparque = id_geoparque;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.Pais = Pais;
        this.temperatura = temperatura;
        this.piso_termico = piso_termico;
        this.fecha_registro = fecha_registro;
        this.fk_geologo = fk_geologo;
    }
    
     

}
