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
public class BeanGeositio {

  private String idGeositio;
  private String laitud;
  private String longitud;
  private String fk_tipo_geositio;
  private String fk_geoparque;

  public BeanGeositio(String idGeositio, String laitud, String longitud, String fk_tipo_geositio, String fk_geoparque) {
    this.idGeositio = idGeositio;
    this.laitud = laitud;
    this.longitud = longitud;
    this.fk_tipo_geositio = fk_tipo_geositio;
    this.fk_geoparque = fk_geoparque;
  }
  
  public BeanGeositio() {
        
    }

  public String getIdGeositio() {
    return idGeositio;
  }

  public void setIdGeositio(String idGeositio) {
    this.idGeositio = idGeositio;
  }

  public String getLaitud() {
    return laitud;
  }

  public void setLaitud(String laitud) {
    this.laitud = laitud;
  }

  public String getLongitud() {
    return longitud;
  }

  public void setLongitud(String longitud) {
    this.longitud = longitud;
  }

  public String getFk_tipo_geositio() {
    return fk_tipo_geositio;
  }

  public void setFk_tipo_geositio(String fk_tipo_geositio) {
    this.fk_tipo_geositio = fk_tipo_geositio;
  }

  public String getFk_geoparque() {
    return fk_geoparque;
  }

  public void setFk_geoparque(String fk_geoparque) {
    this.fk_geoparque = fk_geoparque;
  }

}
