
package tallerMecanico.personas;

import java.util.Date;


public abstract class  Personal {
    private Long legajo;
    private String nombreCompleto;
    private Date fechaIngreso;

    public Personal() {
    }

    public Personal(Long legajo, String nombreCompleto, Date fechaIngreso) throws LegajoInvalido {
        setLegajo(legajo);
        this.nombreCompleto = nombreCompleto;
        this.fechaIngreso = fechaIngreso;
    }

    public Long getLegajo() {
        return legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setLegajo(Long legajo) throws LegajoInvalido {
        if (legajo == null || legajo < 1 || legajo > 999_999) {
            throw new LegajoInvalido("El legajo es incorrecto. El rango de valores permitidos es entre 1 y 999.999.");
        }
        this.legajo = legajo;
    }

    /*
     * Helper protegido para reutilizar en subclases (punto 8). 
     */
    protected String datosBase() {
        return (legajo == null ? "null" : String.valueOf(legajo)) + " " +
               (nombreCompleto == null ? "null" : nombreCompleto) + " " +
               (fechaIngreso == null ? "null" : fechaIngreso.toString());
    }

    
    public abstract String obtenerDatosPersonal();

    public String presentarPersonal() {
        String nombre = nombreCompleto == null ? "" : nombreCompleto;
        return "La persona \"" + nombre + "\" ha ingresado al Sistema.";
    }
}
