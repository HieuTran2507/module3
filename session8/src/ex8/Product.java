package ex8;

public class Product {
    protected String name;
    protected double price;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // mặc định 0%
    public double getDiscount() {
        return 0;
    }

    // Overloading
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5; // override hết
        }
        return getDiscount(); // gọi version không tham số
    }

    // không có số lượng
    public double getFinalPrice() {
        return price - (price * getDiscount()) / 100;
    }

    // có số lượng
    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        return price - (price * discount) / 100;
    }
}
