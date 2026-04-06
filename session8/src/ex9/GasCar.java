package ex9;

public class GasCar extends Car implements Refuelable {

    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe chạy xăng " + getInfo() + " đã khởi động với tiếng động cơ.";
    }

    @Override
    public String stop() {
        return "Xe chạy xăng " + getInfo() + " đã dừng và động cơ tắt.";
    }

    @Override
    public void refuel() {
        System.out.println("Xe chạy xăng " + getInfo() + " đang được đổ xăng...");
    }
}
