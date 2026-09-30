public class Camion extends Vehiculo {
    public double tarifaHora = 1500;
    public int espacioOcupado = 4;

    public Camion(String patente, String marca, String modelo, int horasPermanencia) {
        super(patente, marca, modelo, horasPermanencia);
    }

}
