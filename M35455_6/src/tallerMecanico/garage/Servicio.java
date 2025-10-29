
package tallerMecanico.garage;

import tallerMecanico.personas.Tecnico;


public class Servicio {
    private String fechayHora;
    private Vehiculo vehiculo;
    private Tecnico tecnico;

    public Servicio() {
    }

    public Servicio(String fechayHora, Vehiculo vehiculo, Tecnico tecnico) {
        this.fechayHora = fechayHora;
        this.vehiculo = vehiculo;
        this.tecnico = tecnico;
    }

    public String getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(String fechayHora) {
        this.fechayHora = fechayHora;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public void asignarServicio(Vehiculo vehiculo, Tecnico tecnico) {
        if (vehiculo == null || tecnico == null) {
            return;
        }

        this.vehiculo = vehiculo;
        this.tecnico  = tecnico;
        vehiculo.confirmarServicio(this);
    }

}
