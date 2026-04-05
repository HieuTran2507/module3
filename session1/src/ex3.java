import java.util.Scanner;

public class ex3 {
    static void main(String[] args){
        double radius;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập bán kính hình tròn: ");
        radius = scanner.nextDouble();

        area = radius*radius*Math.PI;

        System.out.printf("diện tích hình tròn là: %.2f", area);

        scanner.close();
    }
}
