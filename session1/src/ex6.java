import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        float cd, cr, s, v;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài HCN: ");
        cd = scanner.nextFloat();
        System.out.print("Nhập rộng dài HCN: ");
        cr = scanner.nextFloat();

        s = cd*cr;
        v = 2*(cd+cr);

        System.out.printf("chu vi HCN: %.2f %n", v);
        System.out.printf("diện tích HCN: %.2f %n", s);
    }
}
