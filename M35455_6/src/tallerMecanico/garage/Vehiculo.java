package tallerMecanico.garage;

import java.util.ArrayList;
import java.util.List;
import tallerMecanico.personas.Tecnico;

public class Vehiculo {

    private Long numeroFichaTecnica;

    private String matricula;

    private final List<Servicio> servicios = new ArrayList<>();

    private final List<Reparacion> reparaciones = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(Long numeroFichaTecnica, String matricula) {
        this.numeroFichaTecnica = numeroFichaTecnica;
        this.matricula = matricula;
    }

    public Long getNumeroFichaTecnica() {
        return numeroFichaTecnica;
    }

    public void setNumeroFichaTecnica(Long numeroFichaTecnica) {
        this.numeroFichaTecnica = numeroFichaTecnica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    /**
     * 3) Establece un nuevo servicio para el vehículo (agrega al array).
     */
    public void confirmarServicio(Servicio servicio) {
        if (servicio == null) {
            return;
        }

        Vehiculo vehiculoServicio = servicio.getVehiculo();
        if (vehiculoServicio == null) {
            servicio.setVehiculo(this);
        }

        if (!servicios.contains(servicio)) {
            servicios.add(servicio);
        }
    }

    /**
     * 4) Da de baja un servicio buscando por el técnico asociado. 
     * Devuelve true si lo encontró y eliminó; false en caso contrario.
     */
    public boolean cancelarServicio(Tecnico tecnico) {
        if (tecnico == null) {
            return false;
        }
        for (int i = 0; i < servicios.size(); i++) {
            Servicio s = servicios.get(i);
            if (tecnico.equals(s.getTecnico())) {
                s.setVehiculo(null);
                servicios.remove(i);
                return true;
            }
        }
        return false;
    }
    /**
     * 5) Agrega una reparación al array.
     */
    public void efectuarReparacion(Reparacion reparacion) {
        if (reparacion != null) {
            reparaciones.add(reparacion);
        }
    }

    /**
     * 6) Muestra datos del vehículo y todas sus reparaciones.
     */
    public void mostrarHistorialReparaciones() {
        System.out.println("Vehículo -> N° Ficha: " + numeroFichaTecnica + " - Matrícula: " + matricula);
        System.out.println("Reparaciones:");
        if (reparaciones.isEmpty()) {
            System.out.println("    (Sin reparaciones registradas)");
        } else {
            for (Reparacion r : reparaciones) {
                System.out.println(r);
            }
        }
        System.out.println();
    }
}
