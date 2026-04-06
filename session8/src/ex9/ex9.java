package ex9;

public class ex9 {
    static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new ElectricCar("Tesla Model 3", 2023, 40000);
        Car car2 = new GasCar("Toyota Camry", 2020, 25000);

        garage.addCar(car1);
        garage.addCar(car2);

        System.out.println("=== START ===");
        garage.startAll();

        System.out.println("=== STOP ===");
        garage.stopAll();

        System.out.println("=== REFUEL ===");
        garage.refuelAll();
    }
}
