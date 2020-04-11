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
public class BeanGuardabosques {
    private String id_guarda;
    private String nombre;
    private String apellido;
    private String telefono;
    private String poblacionAledana;
    private String TipoDocumento;
    private String numeroDocumento;
    
    public BeanGuardabosques(String id_guarda, String nombre, String apellido, String telefono, String poblacionAledana, String TipoDocumento, String numeroDocumento){
        this.id_guarda = id_guarda;
        this.nombre  = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.poblacionAledana = poblacionAledana;
        this.TipoDocumento = TipoDocumento;
        this.numeroDocumento = numeroDocumento;
        



}

    public BeanGuardabosques() {
        
    }

    public String getId_guarda() {
        return id_guarda;
    }

    public void setId_guarda(String id_guarda) {
        this.id_guarda = id_guarda;
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

    public String getPoblacionAledana() {
        return poblacionAledana;
    }

    public void setPoblacionAledana(String poblacionAledana) {
        this.poblacionAledana = poblacionAledana;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
