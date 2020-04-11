/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author UserData05
 */
public class BeanGeologo {

    
    private String id_geologo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correo;
    private String entidad;
    
    public BeanGeologo(String id_geologo, String nombre, String apellido, String telefono, String tipoDocumento, String numeroDocumento, String correo, String entidad) {
        this.id_geologo = id_geologo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.entidad = entidad;
    }

    public BeanGeologo() {
        
    }
    
   

    public String getId_geologo() {
        return id_geologo;
    }

    public void setId_geologo(String id_geologo) {
        this.id_geologo = id_geologo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    

    
    
}
