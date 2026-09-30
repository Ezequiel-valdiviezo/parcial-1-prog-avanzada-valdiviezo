import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Garage {
     public static final int capaciadadMaxima = 20;
    private List<Vehiculo> vehiculos;

    public Garage() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo() {
        String tipoVehiculo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo: " + "1 - Moto" + "2 - Auto" + "3 - Camion");
        String patente = JOptionPane.showInputDialog("Ingrese la patente del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        int horasPermanencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de permanencia del vehículo:"));

        Vehiculo vehiculo = null;

        switch (tipoVehiculo) {
            case "1":
                vehiculo = new Moto(patente, marca, modelo, horasPermanencia);
            break;
            case "2":
                vehiculo = new Auto(patente, marca, modelo, horasPermanencia);
            break;
            case "3":
                vehiculo = new Camion(patente, marca, modelo, horasPermanencia);
            break;
            default:
                System.out.println("Tipo de vehículo inválido.");
                System.exit(0);
        }

        try {
            this.vehiculos.add(vehiculo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

        if (vehiculo != null) {
            vehiculo.mostrarDatos();
        }

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
