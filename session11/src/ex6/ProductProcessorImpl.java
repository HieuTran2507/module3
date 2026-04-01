package ex6;

import java.util.ArrayList;
import java.util.List;

public class ProductProcessorImpl implements ProductProcessor{
    private List<Product> products;

    public ProductProcessorImpl() {
        products = new ArrayList<>();
    }

    public void addProducts(List<Product> p){
        if(!p.isEmpty()){
            products.addAll(p);
        }
        else System.out.println("không có sản phẩm nào");
    }

    public void display(){
        products.forEach(p-> System.out.println(p));
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public double calculateTotalValue(List<Product> products) {
        double sum;
        if(!products.isEmpty()){
            sum = products.stream().mapToDouble(p -> p.getPrice()).sum();
            System.out.println("tông giá trị sản phẩm: "+sum);
            return sum;
        }
        else {
            System.out.println("không có sản phẩm nào");
            return 0;
        }
    }

    @Override
    public boolean hasExpensiveProduct(double price, List<Product> products) {
        return ProductProcessor.super.hasExpensiveProduct(price, products);
    }
}
