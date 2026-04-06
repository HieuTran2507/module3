package ex9;

public abstract class Car {
    protected String model;
    protected int year;
    protected double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract String start();
    public abstract String stop();

    // Hàm hỗ trợ format chung
    protected String getInfo() {
        return model + " (Năm SX: " + year + ", Giá: $" + price + ")";
    }
}
