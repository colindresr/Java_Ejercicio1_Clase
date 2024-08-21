public class Main {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();

        Coche coche = new Coche("Toyota", "Corolla", 2020, 180, 4);
        Camion camion = new Camion("International", "ProStar", 2018, 120, 20000);
        Motocicleta moto = new Motocicleta("Honda", "CBR600RR", 2022, 280, "En Z");

        garaje.agregarVehiculo(coche);
        garaje.agregarVehiculo(camion);
        garaje.agregarVehiculo(moto);

        garaje.mostrarVehiculos();
    }
}