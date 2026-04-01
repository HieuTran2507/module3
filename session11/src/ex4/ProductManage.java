package ex4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductManage {
    private Map<Integer,Product> products;

    public ProductManage() {
        products = new HashMap<>();
    }

    public void addProduct(Product p){
        products.put(p.getId(), p);
    }

    public boolean chkID(int id){
        return products.containsKey(id);
    }
    public void editProduct(Product p){
        products.put(p.getId(),p);
    }

    public void deleteProduct(int id){
        products.remove(id);
    }
    public void display(){
        products.values().forEach(System.out::println);
    }

    public void priceFilter(double price){
        products.values().stream()
                .filter(s -> s.getPrice()>=price)
                .forEach(s -> System.out.println(s));
    }

    public double getTotal(){
        return products.values().stream()
                .mapToDouble(p-> p.getPrice())
                .sum();
    }
}
