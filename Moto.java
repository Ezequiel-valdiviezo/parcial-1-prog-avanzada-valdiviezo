public class Moto extends Vehiculo {
    public double tarifaHora = 700;
    public int espacioOcupado = 1;

    public Moto(String patente, String marca, String modelo, int horasPermanencia) {
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
