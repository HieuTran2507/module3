import java.util.HashSet;
import java.util.Scanner;

public class ex10 {
    // ham tinh tong binh phuong cac so
    public static int sumSquare(int n){
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }

    // ham tinh happy numbers
    public static boolean isHappy(int n){
        // HashSet dùng để lưu các giá trị đã xuất hiện
        // mục đích: phát hiện vòng lặp vô hạn
        HashSet<Integer> set = new HashSet<>();

        // lặp cho đến khi:
        // 1) n = 1 → happy number
        // 2) n đã xuất hiện trước đó → vòng lặp
        while (n != 1 && !set.contains(n)) {
            set.add(n); // lưu số hiện tại vào set
            // tính tổng bình phương các chữ số
            n = sumSquare(n);
        }
        // nếu cuối cùng n = 1 → true (happy)
        return n == 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so N: ");
        int N = sc.nextInt();

        System.out.println("Cac so Happy tu 1 den " + N + ":");

        // duyệt các số từ 1 đến N
        for (int i = 1; i <= N; i++) {
            // nếu i là happy number
            if (isHappy(i)) {
                // in số đó ra màn hình
                System.out.print(i + " ");
            }
        }
    }
}
