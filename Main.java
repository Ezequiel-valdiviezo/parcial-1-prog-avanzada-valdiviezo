import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima del garage:"));
        
        System.out.println("Iniciando sistema de estacionamiento de vehículos. Con un maximo de " + capacidad + " espacios disponibles.");
        
        String opcionMenu = JOptionPane.showInputDialog("Ingrese que quiere hacer: " + "1 - Registrar ingreso ," + "2 - Registrar salida ," + "3 - Listar vehiculos ," + "4 - Estado del garage ,"  + "5 - Reportes ,"  + "6 - Salir.");

        Garage garage = new Garage(capacidad);
        
        switch (opcionMenu) {
            case "1":
                System.out.println("Registro ingreso");
                registrarIngreso(garage);
                break;
            case "2":
                System.out.println("Registro salida");
                break;
            case "3":
                System.out.println("Listar vehiculos");
                break;
            case "4":
                System.out.println("Estado del garage");
                break;
            case "5":
                System.out.println("Reportes");
            break;
            case "6":
                System.out.println("Salir");
                System.exit(0);
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
                System.exit(0);
        }
    }


    private static void registrarIngreso(Garage garage){
        String tipoVehiculo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo: " + "1 -    Moto" + "2 - Auto" + "3 - Camion");
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

        garage.agregarVehiculo(vehiculo);

        if (vehiculo != null) {
            vehiculo.mostrarDatos();
        }
    }

}