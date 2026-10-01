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

    public void sacarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);
    }

    public void buscarVehiculo(String patente) {
        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
                System.err.println(vehiculo);
            }
        }
    }

    public void listarVehiculos(Vehiculo vehiculo) {
        //System.err.println(vehiculos);
    }

    public void calcularEspacioOcupado() {
    }

    public void calcularEspacioDisponible() {
    }

    public void mostrarEstadoGarage() {
        //System.err.println(vehiculos);
    }
}
