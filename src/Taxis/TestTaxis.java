package Taxis;

public class TestTaxis {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("xxzzcc", "Mañana", 100, 500, 1000);
        System.out.println("El recargo al valor base es de: " + taxi.recargo());
        System.out.println("Valor ganado del viaje es de: " + taxi.totalGanado());
    }

}
