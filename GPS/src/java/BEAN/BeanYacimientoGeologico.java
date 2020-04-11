package BEAN;

/**
 *
 * @author Administrador
 */
public class BeanYacimientoGeologico {

    private String id_Geologico;
    private String nombre;
    private String ubicacion;
    private String elevacion;
    private String pendiente;
    private String orientacion;
    private String estratificacion;
    private String formacion_rocosa;
    private String tipo_suelo;
    private String fk_era;
    private String fk_periodo;

    public BeanYacimientoGeologico(String id_Geologico, String nombre, String ubicacion, String elevacion, String pendiente, String orientacion, String estratificacion, String formacion_rocosa, String tipo_suelo, String fk_era, String fk_periodo) {
        this.id_Geologico = id_Geologico;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.elevacion = elevacion;
        this.pendiente = pendiente;
        this.orientacion = orientacion;
        this.estratificacion = estratificacion;
        this.formacion_rocosa = formacion_rocosa;
        this.tipo_suelo = tipo_suelo;
        this.fk_era = fk_era;
        this.fk_periodo = fk_periodo;
    }

    public String getId_Geologico() {
        return id_Geologico;
    }
    
    public BeanYacimientoGeologico(){
    
    
}

    public void setId_Geologico(String id_Geologico) {
        this.id_Geologico = id_Geologico;
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

    public String getElevacion() {
        return elevacion;
    }

    public void setElevacion(String elevacion) {
        this.elevacion = elevacion;
    }

    public String getPendiente() {
        return pendiente;
    }

    public void setPendiente(String pendiente) {
        this.pendiente = pendiente;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getEstratificacion() {
        return estratificacion;
    }

    public void setEstratificacion(String estratificacion) {
        this.estratificacion = estratificacion;
    }

    public String getFormacion_rocosa() {
        return formacion_rocosa;
    }

    public void setFormacion_rocosa(String formacion_rocosa) {
        this.formacion_rocosa = formacion_rocosa;
    }

    public String getTipo_suelo() {
        return tipo_suelo;
    }

    public void setTipo_suelo(String tipo_suelo) {
        this.tipo_suelo = tipo_suelo;
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

} // Fin clase $(name)
