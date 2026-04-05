package ex3;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    public static int autoID = 1;

    private final int orderId;
    private String customerName;
    private String phoneNumber;
    private String address;
    private Float orderAmount;
    private String status;

    public Order() {
        this.orderId = autoID++;
    }

    public Order(String customerName, String phoneNumber, String address, Float orderAmount, String status) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderAmount = orderAmount;
        this.status = status;
        this.orderId = autoID++;
    }

    public static int getAutoID() {
        return autoID;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void inputData(Scanner sc, String defStatus){
        // nhập tên khách hàng
        while (true){
            String customerName = inputSuggest.getString(sc,"nhập tên khách hàng: ");
            if (customerName.length()>=6 && customerName.length()<=200){
                this.customerName = customerName;
                break;
            } else System.out.println("vui lòng nhập từ 6 - 200 ký tự");
        }

        // nhập số điện thoại
        while (true){
            String phone = inputSuggest.getString(sc,"nhập sdt khách hàng: ");
            if(Pattern.matches("^(03|05|07|09)\\d{8}$",phone)){
                this.phoneNumber=phone;
                break;
            }else System.out.println("vui lòng nhập đúng định dạng sdt VN");
        }

        // nhập địa chỉ giao hàng
        String address = inputSuggest.getString(sc,"nhập địa chỉ giao hàng: ");
        this.address = address;

        // nhập giá trị đơn hàng có giá trị > 0
        while (true){
            Float total = inputSuggest.getFloat(sc,"nhập giá trị đơn hàng: ");
            if(total > 0) {
                this.orderAmount = total;
                break;
            } else System.out.println("vui lòng nhập số > 0");
        }

        // nhập trạng thái
        if (defStatus.equalsIgnoreCase("pending")) this.status = defStatus;
        else {
            while (true){
                String status = inputSuggest.getString(sc,"nhập trạng thái đơn hàng (pending, shipped, delivered): ");
                if(status.equalsIgnoreCase("pending") || status.equalsIgnoreCase("shipped")|| status.equalsIgnoreCase("delivered")){
                    this.status = status;
                    break;
                } else System.out.println("vui lòng nhập (pending, shipped, delivered)");
            }
        }
    }

    @Override
    public String toString(){
        return "\nMã đơn hàng: "+orderId+
                "\nTên khách hàng: "+customerName+
                "\nSố điện thoại: "+phoneNumber+
                "\nĐịa chỉ giao hàng:"+address+
                "\nGiá trị đơn hàng: "+orderAmount+
                "\nTrạng thái đơn hàng: "+status;
    }
}
