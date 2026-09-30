public class Camion extends Vehiculo {
    public double tarifaHora = 1500;
    public int espacioOcupado = 4;

    public Camion(String patente, String marca, String modelo, int horasPermanencia) {
        super(patente, marca, modelo, horasPermanencia);
    }

    @Override
    public int MostrarEspacioOcupado() {
        return espacioOcupado;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("=== MOTO ===");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas de permanencia: " + horasPermanencia);
        System.out.println("Espacio ocupado: " + espacioOcupado);
        System.out.println("Tarifa por hora: $" + tarifaHora);
        System.out.println("Costo total: $" + calcularCosto(horasPermanencia));
    }
    
    @Override
    public double calcularCosto(int horasPermanencia) {
        return tarifaHora * horasPermanencia;
    }
}
