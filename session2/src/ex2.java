import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập vào số nguyên từ 1-7: ");
        num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.print("chủ nhật");
                break;
            case 2:
                System.out.print("Thứ hai");
                break;
            case 3:
                System.out.print("Thứ ba");
                break;
            case 4:
                System.out.print("Thứ tư");
                break;
            case 5:
                System.out.print("Thứ năm");
                break;
            case 6:
                System.out.print("Thứ sáu");
                break;
            case 7:
                System.out.print("Thứ bảy");
                break;
            default:
                System.out.print("Số nhập vào không hợp lệ");
        }


    }
}
