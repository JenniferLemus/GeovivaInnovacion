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
public class BeanPeriodo {

    private String id_periodo;
    private String nombre;

    public String getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(String id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BeanPeriodo(String id_periodo, String nombre) {
        this.id_periodo = id_periodo;
        this.nombre = nombre;
    }

}
