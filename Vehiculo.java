public abstract class Vehiculo {
    protected String patente;
    protected String marca;
    protected String modelo;
    protected int horasPermanencia;

    public Vehiculo(String patente, String marca, String modelo, int horasPermanencia) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.horasPermanencia = horasPermanencia;
    }

    public abstract int MostrarEspacioOcupado();
    
    public abstract void mostrarDatos();
    
    public abstract double calcularCosto(int horasPermanencia);
}
