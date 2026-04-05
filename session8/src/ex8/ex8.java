package ex8;

public class ex8 {
    static void main(String[] args){
        Product p = new Product("Generic", 1000);
        Electronics e = new Electronics("Laptop", 2000);
        Clothing c = new Clothing("Shirt", 500);
        Food f = new Food("Bread", 100);

        System.out.println("=== No quantity ===");
        System.out.println(p.getFinalPrice());
        System.out.println(e.getFinalPrice());
        System.out.println(c.getFinalPrice());
        System.out.println(f.getFinalPrice());

        System.out.println("\n=== Quantity > 100 ===");
        int qty = 150;

        System.out.println(p.getFinalPrice(qty));
        System.out.println(e.getFinalPrice(qty));
        System.out.println(c.getFinalPrice(qty));
        System.out.println(f.getFinalPrice(qty));
    }
}
