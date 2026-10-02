import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int capaciadadMaxima;
    private List<Vehiculo> vehiculos;

    public Garage(int capaciadadMaxima) {
        this.capaciadadMaxima = capaciadadMaxima;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo, String patente) throws GarageException {

        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                throw new GarageException(
                    "Ya existe un vehículo con la patente " + patente + " en el garage."
                );
            }
        }
        
        int espacioRestante = espacioLibre();
        
        int espacioOcupadoVehiculo = 0;
        espacioOcupadoVehiculo += vehiculo.MostrarEspacioOcupado();
        if (espacioRestante >= espacioOcupadoVehiculo) {
            vehiculos.add(vehiculo);
            vehiculo.mostrarDatos();
        } else {
            throw new GarageException(
                "No hay espacio suficiente para ingresar el vehículo."
            );
        }
    }

    public int espacioLibre(){
        int espacioOcupadoTotal = 0;
    
        for (Vehiculo vehiculo : vehiculos){
            espacioOcupadoTotal += vehiculo.MostrarEspacioOcupado();
        }

        int espacioLibre = capaciadadMaxima - espacioOcupadoTotal;

        return espacioLibre;
    }

    public void sacarVehiculo(String patente) {
        Vehiculo vehiculoEncontrado = null;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
                vehiculoEncontrado = vehiculo;
                break;
            }
        }

        if (vehiculoEncontrado != null) {
        vehiculos.remove(vehiculoEncontrado);

        System.out.println("Vehículo retirado correctamente:");
        vehiculoEncontrado.mostrarDatos();
        } else {
            System.out.println("No se encontró un vehículo con la patente " + patente);
        }
    }

    public void buscarVehiculo(String patente) {
        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
                System.err.println(vehiculo);
            }
        }
    }

    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos estacionados.");
        }

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
        }
    }

    public void mostrarEstadoGarage() {

        int espacioOcupadoTotal = 0;
    
        for (Vehiculo vehiculo : vehiculos){
            espacioOcupadoTotal += vehiculo.MostrarEspacioOcupado();
        }

        int espacioLibre = capaciadadMaxima - espacioOcupadoTotal;

        System.err.println("Capacidad máxima: " + capaciadadMaxima);
        System.err.println("Espacio total ocupado: " + espacioOcupadoTotal);
        System.err.println("Espacio total libre: " + espacioLibre);
    }

    public void mostrarReportes() {
        int cantidadTotalVehiculos = 0;
        int cantidadMotos = 0;
        int cantidadAutos = 0;
        int cantidadCamiones = 0;

        int espacioOcupadoTotal = 0;
        double recaudacionTotalEstimada = 0;

        for (Vehiculo vehiculo : vehiculos) {

            cantidadTotalVehiculos++;

            espacioOcupadoTotal += vehiculo.MostrarEspacioOcupado();

            recaudacionTotalEstimada += vehiculo.calcularCosto(
                vehiculo.getHorasPermanencia()
            );

            switch (vehiculo.getTipo()) {
                case "Moto":
                    cantidadMotos++;
                    break;

                case "Auto":
                    cantidadAutos++;
                    break;

                case "Camion":
                    cantidadCamiones++;
                    break;
            }
        }

        int espacioLibre = capaciadadMaxima - espacioOcupadoTotal;

        System.out.println("Reportes:");
        System.out.println("Cantidad total de vehículos: " + cantidadTotalVehiculos);
        System.out.println("Cantidad de motos: " + cantidadMotos);
        System.out.println("Cantidad de autos: " + cantidadAutos);
        System.out.println("Cantidad de camiones: " + cantidadCamiones);
        System.out.println("Espacio ocupado: " + espacioOcupadoTotal);
        System.out.println("Espacio libre: " + espacioLibre);
        System.out.println("Recaudación total estimada: $" + recaudacionTotalEstimada);
    }
}
