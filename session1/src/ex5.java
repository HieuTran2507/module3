import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        int a1,a2,b1,b2, a12, b12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tử số của phân số thứ nhất: ");
        a1 = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ nhất: ");
        b1 = scanner.nextInt();
        System.out.print("Nhập tử số của phân số thứ hai: ");
        a2 = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ hai: ");
        b2 = scanner.nextInt();

        a12 = a1*b2 + a2*b1;
        b12 = b1*b2;

        System.out.printf("kết quả: %d/%d",a12,b12);
    }
}
