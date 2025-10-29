package m35455_6;

import java.util.Date;
import tallerMecanico.garage.Reparacion;
import tallerMecanico.garage.Servicio;
import tallerMecanico.garage.Vehiculo;
import tallerMecanico.personas.LegajoInvalido;
import tallerMecanico.personas.Tecnico;

public class M35455_6 {

    public static void main(String[] args) {
        try {
            // Intento fallido para demostrar la validación del legajo.
            try {
                new Tecnico(0L, "Legajo Inválido", new Date(), 0L, "N/A");
            } catch (LegajoInvalido e) {
                System.out.println(e.getMessage());
            }

            // 1) Creación de 2 vehículos y 2 técnicos.
            Vehiculo vehiculoUno = new Vehiculo(1L, "EDR500");
            Vehiculo vehiculoDos = new Vehiculo(2L, "HEE201");

            Tecnico tecnicoUno = new Tecnico(1_001L, "José Quiroga", new Date(120, 2, 1),
                    50_123L, "Electricidad en general");
            Tecnico tecnicoDos = new Tecnico(1_502L, "Laura Romero", new Date(121, 6, 15),
                    65_890L, "Mecánica integral");

            System.out.println(tecnicoUno.presentarPersonal());
            System.out.println(tecnicoDos.presentarPersonal());

            // 2) Creación de un servicio para cada técnico.
            Servicio servicioElectricidad = new Servicio("01/06/2024 08:30", vehiculoUno, tecnicoUno);
            Servicio servicioMecanica = new Servicio("01/06/2024 10:30", vehiculoUno, tecnicoDos);

            servicioElectricidad.asignarServicio(vehiculoUno, tecnicoUno);
            servicioMecanica.asignarServicio(vehiculoUno, tecnicoDos);

            // Servicio adicional para el segundo vehículo.
            Servicio servicioMotor = new Servicio("02/06/2024 09:15", vehiculoDos, tecnicoDos);
            servicioMotor.asignarServicio(vehiculoDos, tecnicoDos);

            // 4) Cancelación de uno de los servicios.
            boolean servicioCancelado = vehiculoUno.cancelarServicio(tecnicoUno);
            System.out.println("Se canceló el servicio del técnico "
                    + tecnicoUno.getNombreCompleto() + ": " + (servicioCancelado ? "Sí" : "No"));
            System.out.println("Servicios activos en el vehículo EDR500 tras cancelar: "
                    + vehiculoUno.getServicios().size());

            // 5) Creación de cuatro reparaciones asignadas a los vehículos.
            Reparacion reparacionUno = new Reparacion(
                    "Electricidad en general",
                    "Cambiar cables bujías",
                    1);
            Reparacion reparacionDos = new Reparacion(
                    "Frenos en general",
                    "Cambiar pastillas",
                    2);
            Reparacion reparacionTres = new Reparacion(
                    "Mejorar Motor",
                    "Rectificar cilindros, cambiar pistón y aros",
                    5);
            Reparacion reparacionCuatro = new Reparacion(
                    "Radiador",
                    "Lavar sistema. Cambiar pistón y aros",
                    3);

            tecnicoUno.especificarReparacion(vehiculoUno, reparacionUno);
            tecnicoDos.especificarReparacion(vehiculoUno, reparacionDos);
            tecnicoDos.especificarReparacion(vehiculoDos, reparacionTres);
            tecnicoUno.especificarReparacion(vehiculoDos, reparacionCuatro);

            // 6) Historial de reparaciones de los vehículos.
            vehiculoUno.mostrarHistorialReparaciones();
            vehiculoDos.mostrarHistorialReparaciones();
        } catch (LegajoInvalido e) {
            System.out.println("No se pudo registrar a un técnico: " + e.getMessage());
        }
    }
}
