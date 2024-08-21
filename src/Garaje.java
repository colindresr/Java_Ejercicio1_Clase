import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private List<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println( vehiculo.getMarca() + " " + vehiculo.getModelo() + " del año " + vehiculo.getAño() );
            vehiculo.acelerar();
        }
    }
}
