import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Garage {
     public static final int capaciadadMaxima = 20;
    private List<Vehiculo> vehiculos;

    public Garage() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void sacarVehiculo(Vehiculo vehiculo) {
        // this.vehiculos.remove(vehiculo);
    }

    public void buscarVehiculo(Vehiculo vehiculo) {
        
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
