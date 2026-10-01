import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int capaciadadMaxima;
    private List<Vehiculo> vehiculos;

    public Garage(int capaciadadMaxima) {
        this.capaciadadMaxima = capaciadadMaxima;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
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

    public void calcularEspacioOcupado() {

        int espacioOcupadoTotal = 0;
    
        for (Vehiculo vehiculo : vehiculos){
            espacioOcupadoTotal += vehiculo.MostrarEspacioOcupado();
        }

        int espacioLibre = capaciadadMaxima - espacioOcupadoTotal;

        System.err.println("Espacio total ocupado: " + espacioOcupadoTotal);
        System.err.println("Espacio total libre: " + espacioLibre);
    }

    public void calcularEspacioDisponible() {
    }

    public void mostrarEstadoGarage() {
        //System.err.println(vehiculos);
    }
}
