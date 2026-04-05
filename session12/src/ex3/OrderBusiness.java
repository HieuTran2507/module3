package ex3;

import java.util.*;
import java.util.stream.Collectors;

public class OrderBusiness {
    private final List<Order> orderList;

    public OrderBusiness() {
        orderList = new ArrayList<>();
    }

    // thêm sản phẩm
    public void addOrder(Scanner sc){
        Order order = new Order();
        order.inputData(sc,"pending");
        orderList.add(order);
        System.out.println("thêm đơn hàng thành công");
    }

    // hiển thị dnah sách đơn hàng
    public void display(){
        orderList.forEach(o-> System.out.println(o));
    }

    // findID
    private Order findID(int id){
        return orderList.stream()
                .filter(s->s.getOrderId()==id)
                .findFirst()
                .orElse(null);
    }

    // cập nhật trạng thái theo mã đơn hàng
    public void updateStatus(Scanner sc){
        int id = inputSuggest.getInt(sc, "nhập id cần sửa trạng thái: ");
        Order o = findID(id);
        if(o==null) System.out.println("không tìm thấy đơn hàng");
        else {
            while (true){
                String status = inputSuggest.getString(sc,"nhập trạng thái đơn hàng (pending, shipped, delivered): ");
                if(status.equalsIgnoreCase("pending") || status.equalsIgnoreCase("shipped")|| status.equalsIgnoreCase("delivered")){
                    o.setStatus(status);
                    System.out.println("cập nhật trạng thái thành coong");
                    break;
                } else System.out.println("vui lòng nhập (pending, shipped, delivered)");
            }
        }
    }

    // xóa đơn hàng theo id
    public void delete(Scanner sc){
        int id = inputSuggest.getInt(sc, "nhập id cần sửa trạng thái: ");
        Order o = findID(id);
        if(o==null) System.out.println("không tìm thấy đơn hàng");
        else {
            orderList.remove(o);
            System.out.println("xóa đơn hàng thành công");
        }
    }

    // tìm kiếm theo tên khách hàng
    public void customerSearch(Scanner sc){
        String name = inputSuggest.getString(sc,"nhập tên khách hàng cần tìm: ");
        List<Order> result = orderList.stream()
                .filter(c->c.getCustomerName().toLowerCase().contains(name))
                .toList();
        if (result.isEmpty()) System.out.println("không tìm thấy đơn hàng");
        else result.forEach(r-> System.out.println(r));
    }

    // thng kê tổng số đơn hàng
    public void statistic(){
        System.out.println("tổng số đơn hàng: "+orderList.size());
    }

    // thống kê tổng doanh thu có trnajg thái deliverd
    public void deliveredStatistic(){
        List<Order> deliveredResult = orderList.stream()
                .filter(s-> s.getStatus().equalsIgnoreCase("delivered"))
                .toList();
        Double sum = 0.0;
        for (Order order : deliveredResult) {
            sum += order.getOrderAmount();
        }
        System.out.println("tổng doanh thu đơn hàng delivered: " +sum);
    }

    // Thống kê số lượng đơn hàng theo từng trạng thái
    public void statusStatistic(){
        Map<String,Long> result = orderList.stream()
                .collect(Collectors.groupingBy(Order::getStatus,Collectors.counting()));
        result.forEach((a,b)-> System.out.println("status: "+a+", số lượng: "+b));
    }

    // tìm kếm đơn hag giá trị cao nhất
    public void max(){
        orderList.stream()
                .max(Comparator.comparing(Order::getOrderAmount))
                .ifPresent(System.out::println);
    }
}
