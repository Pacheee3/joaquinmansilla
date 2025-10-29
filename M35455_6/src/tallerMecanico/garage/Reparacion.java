
package tallerMecanico.garage;



public class Reparacion {

    private String nombreReparacion;
    private String descripcion;
    private Integer horasTrabajo;

    public Reparacion() {
    }

    public Reparacion(String nombreReparacion, String descripcion, Integer horasTrabajo) {
        this.nombreReparacion = nombreReparacion;
        this.descripcion = descripcion;
        this.horasTrabajo = horasTrabajo;
    }

    public String getNombreReparacion() {
        return nombreReparacion;
    }

    public void setNombreReparacion(String nombreReparacion) {
        this.nombreReparacion = nombreReparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(Integer horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public String toString() {
        String texto = "    ";
        if (nombreReparacion != null) {
            texto += nombreReparacion;
        }
        if (descripcion != null && descripcion.length() > 0) {
            texto += ". " + descripcion;
        }
        if (horasTrabajo != null) {
            texto += ". " + horasTrabajo + " días.";
        }
        return texto;
    }
}
