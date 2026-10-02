import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima del garage:"));
        
        System.out.println("Iniciando sistema de estacionamiento de vehículos. Con un maximo de " + capacidad + " espacios disponibles.");
        
        Garage garage = new Garage(capacidad);
        
        String opcionMenu;

        do{
    
        opcionMenu = JOptionPane.showInputDialog("Ingrese que quiere hacer: " + "1 - Registrar ingreso , " + "2 - Registrar salida , " + "3 - Listar vehiculos , " + "4 - Estado del garage , "  + "5 - Reportes y "  + "6 - Salir.");
        
        switch (opcionMenu) {
            case "1":
                System.out.println("----------Registro ingreso----------");
                registrarIngreso(garage);
                break;
            case "2":
                System.out.println("----------Registro salida----------");
                registrarSalida(garage);
                break;
            case "3":
                System.out.println("----------Listar vehiculos----------");
                listarVehiculos(garage);
                break;
            case "4":
                System.out.println("----------Estado del garage----------");
                estadoGarage(garage);
                break;
            case "5":
                System.out.println("----------Reportes----------");
                reportesGarage(garage);
            break;
            case "6":
                System.out.println("----------Salir----------");
                System.exit(0);
                break;
            default:
                System.out.println("----------Tipo de vehículo inválido.----------");
                System.exit(0);
        }
        } while(!opcionMenu.equals("6"));
    }


    private static void registrarIngreso(Garage garage){
    try {
        int tipoVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de vehículo: " + "1 - Moto, " + "2 - Auto y " + "3 - Camion"));
        
        if (tipoVehiculo != 1 && tipoVehiculo != 2 && tipoVehiculo != 3 ) {
            throw new GarageException(
                "Numero de tipo de vehiculo invalido."
            );
        } 
        String patente = JOptionPane.showInputDialog("Ingrese la patente del vehículo:");

        if (patente == "" || patente == null || patente.isEmpty()) {
            throw new GarageException(
                "La patente no puede estar vacía."
            );
        } 
        
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");

        if (marca == "" || marca == null || marca.isEmpty()) {
            throw new GarageException(
                "La marca no puede estar vacía."
            );
        } 

        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");

        if (modelo == "" || modelo == null || modelo.isEmpty()) {
            throw new GarageException(
                "El modelo no puede estar vacío."
            );
        } 
        
        int horasPermanencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de permanencia del vehículo:"));

        if (horasPermanencia < 0) {
            throw new GarageException(
                "Las horas de permamencia deben ser mayor a 0."
            );
        } 

        Vehiculo vehiculo = null;

            switch (tipoVehiculo) {
                case 1:
                    vehiculo = new Moto(patente, marca, modelo, horasPermanencia);
                break;
                case 2:
                    vehiculo = new Auto(patente, marca, modelo, horasPermanencia);
                break;
                case 3:
                    vehiculo = new Camion(patente, marca, modelo, horasPermanencia);
                break;
                default:
                    System.err.println(
                        "Opción de menú inválida."
                    );
            }
        
            garage.agregarVehiculo(vehiculo, patente);
        } catch (GarageException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void registrarSalida(Garage garage){
        try {
            String patente = JOptionPane.showInputDialog("Ingrese la patente del vehículo:");
            garage.sacarVehiculo(patente);
        } catch (GarageException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void listarVehiculos (Garage garage){
        garage.listarVehiculos();
    }

    private static void estadoGarage(Garage garage){
        garage.mostrarEstadoGarage();
    }

    private static void reportesGarage(Garage garage){
        garage.mostrarReportes();
    }
}