package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductBusiness {
    private final List<Product> products;

    public ProductBusiness() {
        products = new ArrayList<>();
    }

    // thêm sản phẩm
    public void addProduct(Scanner sc){
        Product p = new Product();
        p.inputData(sc,products);
        products.add(p);
        System.out.println("Thêm sản phẩm thành công");
    }

    // hiển thị danh sách sản phẩm
    public void display(){
        products.forEach(p-> System.out.println(p));
    }

    // update sản phẩm
    public void updateProduct(Scanner sc){
        Integer updateID = input_suggest.getInt(sc, "nhập ID sản phẩm cần update: ");
        Product p = findByID(updateID);
        if (p == null) {
            System.out.println("Không tìm thấy!");
            return;
        }
        String name = input_suggest.getString(sc,"nhập tên mới sản phẩm: ");
        p.setpName(name, products);
        Double price = input_suggest.getDouble(sc,"nhâp giá mới: ");
        p.setpPrice(price);
        String category = input_suggest.getString(sc,"nhập tên danh mục mới: ");
        p.setpCategory(category);
        int quantity = input_suggest.getInt(sc,"nhập soo lượng tồn kho: ");
        p.setpQuantity(quantity);
    }
    private Product findByID(int ID){
        return products.stream()
                .filter(p->p.getpID()==ID)
                .findFirst()
                .orElse(null);

    }

    // xóa sản phẩm theo ID
    public void deleteProduct(Scanner sc){
        int deleteID = input_suggest.getInt(sc,"nhập id sản phaamr cần xóa: ");
        Product p = findByID(deleteID);
        if (p == null) {
            System.out.println("không tìm thấy sản phẩm trong danh sách");
            return;
        }
        products.remove(p);
        System.out.println("đã xóa sản phẩm thành công");
    }

    // tìm kiếm theo tên gần đúng
    public void search(Scanner sc){
        String name = input_suggest.getString(sc,"nhaajp tên sản phẩm cần tìm: ");
        List<Product> list = products.stream()
                .filter(p->p.getpName().toLowerCase().contains(name))
                .toList();

        if(list.isEmpty()) System.out.println("không tìm thấy sản phẩm");
        else list.forEach(p -> System.out.println(p));
    }

    // sắp xếp giá tăng dần
    public void filterPriceASC(){
        products.stream()
                .sorted(Comparator.comparing(Product::getpPrice))
                .forEach(p-> System.out.println(p));
    }

    public void filterQuantityDesc(){
        products.stream()
                .sorted(Comparator.comparing(Product::getpQuantity).reversed())
                .forEach(p-> System.out.println(p));
    }
}
