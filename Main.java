import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema de estacionamiento de vehículos. Con un maximo de 20 espacios disponibles.");

        String opcionMenu = JOptionPane.showInputDialog("Ingrese que quiere hacer: " + "1 - Registrar ingreso ," + "2 - Registrar salida ," + "3 - Listar vehiculos ," + "4 - Estado del garage ,"  + "5 - Reportes ,"  + "6 - Salir.");

        switch (opcionMenu) {
            case "1":
                System.out.println("Registro ingreso");
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
}