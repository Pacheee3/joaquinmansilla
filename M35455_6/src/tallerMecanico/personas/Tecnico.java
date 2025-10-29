
package tallerMecanico.personas;

import java.util.Date;
import tallerMecanico.garage.Reparacion;
import tallerMecanico.garage.Vehiculo;


public class Tecnico extends Personal{
    private Long numeroMatriculaProfesional;
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(Long legajo, String nombreCompleto, Date fechaIngreso,
                   Long numeroMatriculaProfesional, String especialidad) throws LegajoInvalido {
        super(legajo, nombreCompleto, fechaIngreso);
        this.numeroMatriculaProfesional = numeroMatriculaProfesional;
        this.especialidad = especialidad;
    }

    public Tecnico(Long numeroMatriculaProfesional, String especialidad) {
        this.numeroMatriculaProfesional = numeroMatriculaProfesional;
        this.especialidad = especialidad;
    }

    public Long getNumeroMatriculaProfesional() {
        return numeroMatriculaProfesional;
    }

    public void setNumeroMatriculaProfesional(Long numeroMatriculaProfesional) {
        this.numeroMatriculaProfesional = numeroMatriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
 
     /**
     * 10) Establece relación entre Vehiculo y Reparacion llamando a efectuarReparacion().
     */
    public void especificarReparacion(Vehiculo vehiculo, Reparacion reparacion) {
        if (vehiculo != null && reparacion != null) {
            vehiculo.efectuarReparacion(reparacion);
        }
    }

    /**
     * 8) Devuelve concatenación de TODOS los atributos (incluidos los heredados),
     * separados por un espacio en blanco.
     */
    @Override
    public String obtenerDatosPersonal() {
        String m   = (numeroMatriculaProfesional == null ? "null" : String.valueOf(numeroMatriculaProfesional));
        String esp = (especialidad == null ? "null" : especialidad);
        return datosBase() + " " + m + " " + esp;
    }
}
