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
        boolean agregoInformacion = false;

        if (nombreReparacion != null && nombreReparacion.length() > 0) {
            texto += nombreReparacion;
            agregoInformacion = true;
        }

        if (descripcion != null && descripcion.length() > 0) {
            if (agregoInformacion) {
                texto += ". ";
            }
            texto += descripcion;
            agregoInformacion = true;
        }

        if (horasTrabajo != null) {
            if (agregoInformacion) {
                texto += ". ";
            }
            texto += horasTrabajo + " horas.";
            agregoInformacion = true;
        }

        if (!agregoInformacion) {
            texto += "(reparación sin datos)";
        }

        return texto;
    }
}
