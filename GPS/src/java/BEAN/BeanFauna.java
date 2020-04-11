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
public class BeanFauna {
    
      private String id_fauna;
    private String especie;
    private String Ecosistema;
    private String habitat;
    private String tipo;
    private String fk_geositio;
    private String fk_guardabosques;

  public BeanFauna() {
   
  }

    public String getId_fauna() {
        return id_fauna;
    }

    public void setId_fauna(String id_fauna) {
        this.id_fauna = id_fauna;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEcosistema() {
        return Ecosistema;
    }

    public void setEcosistema(String Ecosistema) {
        this.Ecosistema = Ecosistema;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    

    public BeanFauna(String id_fauna, String especie, String Ecosistema, String habitat, String tipo, String fk_geositio, String fk_guardabosques) {
        this.id_fauna = id_fauna;
        this.especie = especie;
        this.Ecosistema = Ecosistema;
        this.habitat = habitat;
        this.tipo = tipo;
        this.fk_geositio = fk_geositio;
        this.fk_guardabosques = fk_guardabosques;
    }
    
  
    
}
