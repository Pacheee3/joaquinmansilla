package tallerMecanico.garage;

import tallerMecanico.personas.Tecnico;

public class Servicio {

    private String fechaYHora;
    private Vehiculo vehiculo;
    private Tecnico tecnico;

    public Servicio() {
    }

    public Servicio(String fechaYHora, Vehiculo vehiculo, Tecnico tecnico) {
        this.fechaYHora = fechaYHora;
        this.vehiculo = vehiculo;
        this.tecnico = tecnico;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
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
        this.tecnico = tecnico;
        vehiculo.confirmarServicio(this);
    }

}
