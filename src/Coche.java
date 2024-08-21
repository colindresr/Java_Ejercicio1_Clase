public class Coche extends Vehiculo{

    private int numeroDePuertas;

    public Coche(String marca, String modelo, int año, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, año, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche acelera moderadamente.");
    }
}

