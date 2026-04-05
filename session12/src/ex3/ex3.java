package ex3;

import java.sql.Connection;
import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderBusiness oderManage = new OrderBusiness();
        int choice;
        while (true){
            System.out.println("*********************QUẢN LÝ ĐƠN HÀNG********************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Hiển thị danh sách đơn hàng");
            System.out.println("3. Cập nhật trạng thái đơn hàng theo mã đơn hàng");
            System.out.println("4. Xóa đơn hàng theo mã đơn hàng");
            System.out.println("5. Tìm kiếm đơn hàng theo tên khách hàng");
            System.out.println("6. Thống kê tổng số đơn hàng");
            System.out.println("7. Thống kê tổng doanh thu các đơn hàng có trạng thái Delivered");
            System.out.println("8. Thống kê số lượng đơn hàng theo từng trạng thái");
            System.out.println("9. Tìm kiếm đơn hàng có giá trị lớn nhất");
            System.out.println("10. Thoát");
            choice = inputSuggest.getInt(sc, "nhập lựa chọn của bạn: ");
            switch (choice){
                case 1:
                    oderManage.addOrder(sc);
                    break;
                case 2:
                    oderManage.display();
                    break;
                case 3:
                    oderManage.updateStatus(sc);
                    break;
                case 4:
                    oderManage.delete(sc);
                    break;
                case 5:
                    oderManage.customerSearch(sc);
                    break;
                case 6:
                    oderManage.statistic();
                    break;
                case 7:
                    oderManage.deliveredStatistic();
                    break;
                case 8:
                    oderManage.statusStatistic();
                    break;
                case 9:
                    oderManage.max();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập lựa chọn từ 1 - 10");
            }
        }
    }
}
