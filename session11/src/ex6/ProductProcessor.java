package ex6;

import java.util.ArrayList;
import java.util.List;

public interface ProductProcessor {
    public abstract double calculateTotalValue(List<Product> products);
    static void printProductList(List<Product> products){
        products.forEach(p-> System.out.println(p));
    }
    default boolean hasExpensiveProduct(double price, List<Product> products){
        List<Product> filterProduct = new ArrayList<>();
        filterProduct = products.stream()
                .filter(p->p.getPrice()>price)
                .toList();

        if(filterProduct.isEmpty()) {
            System.out.println("không sản phẩm nào có giá cao hơn "+price);
            return false;
        }
        else {
            filterProduct.forEach(p-> System.out.println(p));
            return true;
        }
    }

}
