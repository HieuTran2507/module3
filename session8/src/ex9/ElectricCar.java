package ex9;

public class ElectricCar extends Car implements Refuelable {

    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe điện " + getInfo() + " đã khởi động không tiếng ồn.";
    }

    @Override
    public String stop() {
        return "Xe điện " + getInfo() + " đã dừng và ngắt kết nối động cơ.";
    }

    @Override
    public void refuel() {
        System.out.println("Xe điện " + getInfo() + " đang sạc điện...");
    }
}
