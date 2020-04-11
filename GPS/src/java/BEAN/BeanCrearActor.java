/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author SENA
 */
public class BeanCrearActor {
     private String Tipo;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String PoblacionAledaña;
    private String id_actor;
    private String NumeroIdentificacion;

    public BeanCrearActor(String Tipo, String Nombres, String Apellidos, String Telefono, String PoblacionAledaña, String id_actor, String NumeroIdentificacion) {
        this.Tipo = Tipo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.PoblacionAledaña = PoblacionAledaña;
        this.id_actor = id_actor;
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPoblacionAledaña() {
        return PoblacionAledaña;
    }

    public void setPoblacionAledaña(String PoblacionAledaña) {
        this.PoblacionAledaña = PoblacionAledaña;
    }

    public String getId_actor() {
        return id_actor;
    }

    public void setId_actor(String id_actor) {
        this.id_actor = id_actor;
    }

    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(String NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

 

}
