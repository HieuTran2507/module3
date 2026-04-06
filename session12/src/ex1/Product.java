package ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Product {
    private static int autoID = 1; // ID tự  tăng

    private final int pID;
    private String pName;
    private Double pPrice;
    private String pCategory;
    private int pQuantity;

    public Product() {
        this.pID = autoID++;
    }


    public Product(String pName, Double pPrice, String pCategory, int pQuantity) {
        this.pID = autoID++;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pCategory = pCategory;
        this.pQuantity = pQuantity;
    }

    public int getpID() {
        return pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName, List<Product> list) {
        if (pName.length()>=10 && pName.length()<=50){
            boolean isDuplicate = list.stream()
                    .anyMatch(p->p.getpName().equalsIgnoreCase(pName));
            if (!isDuplicate){
                this.pName=pName;
            }else System.out.println("tên sản phẩm bị trùng");
        }else System.out.println("vui lòng nhập từ 10 -50 ký tự");
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        if(pPrice>0) this.pPrice = pPrice;
        else System.out.println("vui lòng nhập giá > 0");
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        if(pCategory.length()<=200) this.pCategory = pCategory;
        else System.out.println("vui lòng nhập dưới 200 ký tự");
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        if(pQuantity>=0) this.pQuantity=pQuantity;
        else System.out.println("vui lòng nhập sô lượng >=0");
    }

    public void inputData(Scanner sc, List<Product> p){
        // nhập tên + validate
        while (true){
            String name = input_suggest.getString(sc,"nhập tên sản phẩm: ");
            if(name.length()>=10 && name.length()<=50){
                boolean chkName;
                chkName = p.stream().anyMatch(s->s.getpName().equalsIgnoreCase(name));
                if (!chkName){
                    this.pName = name;
                    break;
                } else System.out.println("tên bị trùng");
            }else System.out.println("vui lòng nhập từ 10 - 50 ký tự");
        }

        // price
        while (true){
            Double price = input_suggest.getDouble(sc,"nhập giá sản phẩm: ");
            if (price>0) {
                this.pPrice = price;
                break;
            }else System.out.println("vui lòng nhập giá > 0");
        }

        // category
        while (true){
            String category = input_suggest.getString(sc,"nhập loại sản phẩm: ");
            if (category.length()<=200){
                this.pCategory = category;
                break;
            } else System.out.println("vui lòng nhập dưới 200 ký tự");
        }

        // số lượng
        while (true){
            Integer quantity = input_suggest.getInt(sc, "nhập số lượng sản phẩm: ");
            if (quantity >= 0){
                this.pQuantity = quantity;
                break;
            } else System.out.println("vui lòng nhập số lượng sản phẩm >= 0");
        }
    }

    @Override
    public String toString(){
        return "\nID: "+pID+
                "\nLoại sản phẩm: "+pCategory+
                "\nTên sản phẩm: "+pName+
                "\nGiá: "+pPrice+
                "\nTồn kho: "+pQuantity;
    }

}
