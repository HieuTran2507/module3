package ex6;

import java.util.*;

public class ex6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductProcessorImpl pm = new ProductProcessorImpl();
        List<Product> ListProduct = Arrays.asList(
                new Product("laptop asus",120),
                new Product("laptop dell",150),
                new Product("điện thoại samsung",70),
                new Product("điện thoại iphone",50),
                new Product("quạt seiko",20)
        );
        pm.addProducts(ListProduct);
        // kiem tra có sản phẩm giá hơn 100 không
        System.out.println("\n sản phẩm có giá > 100: ");
        pm.hasExpensiveProduct(100,pm.getProducts());
        // tính tông giá trị sản phẩm
        System.out.println();
        pm.calculateTotalValue(pm.getProducts());
        // in ra toàn bộ sản phẩm
        System.out.println("\n danh sách sản phẩm");
        pm.display();
    }
}
