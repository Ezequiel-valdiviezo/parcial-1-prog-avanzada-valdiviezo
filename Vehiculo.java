public abstract class Vehiculo implements Calculable, Mostrable {
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
    
    @Override 
    public abstract void mostrarDatos();
    
    @Override 
    public abstract double calcularCosto(int horasPermanencia);

    public abstract String getTipo();

    public String getPatente(){
        return patente;
    } 

    public int getHorasPermanencia() {
        return horasPermanencia;
    }
}
