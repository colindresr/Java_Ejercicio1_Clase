public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int año, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año < 1886) {
            this.año = año;
            System.out.println("No se ha creado ningún vehiculo en ese año");
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima < 0) {
            this.velocidadMaxima = velocidadMaxima;
            System.out.println("Velocidad máxima no puede ser negativa");
        }
    }

    public abstract void acelerar();

}
