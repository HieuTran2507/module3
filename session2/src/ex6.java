import java.util.Scanner;

public class ex6 {
    static void main(String[] args){
        System.out.print("nhập dãy số cần tính tổng: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Nếu số là âm, chuyển nó thành số dương.
        if(num < 0) num = Math.abs(num);

        // Sử dụng vòng lặp để tách từng chữ số của N (lấy phần dư khi chia 10).
        int sum = 0;
        while (num > 0){
            int n = num % 10; // lấy chữ số cuối
            sum += n; //
            num = num/10; // bỏ chữ số cuối
        }
        System.out.printf("tổng các chữ số = %d", sum );

    }
}
