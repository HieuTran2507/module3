import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        int month;
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập tháng cần kiểm tra: ");
        month = sc.nextInt();

        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.print("có 31 ngày");
                break;
            case 4,6,9,11:
                System.out.print("có 30 ngày");
                break;
            case 2:
                System.out.print("có 28 hoặc 29 ngày");
                break;
            default:
                System.out.print("Tháng không hợp lệ.");
        }

    }
}
