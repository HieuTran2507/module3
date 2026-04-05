import java.util.Scanner;

public class ex4 {
    static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("vui lòng nhập tuổi của bạn: ");
        age = sc.nextInt();

        while (age<=0){
            System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
            System.out.print("vui lòng nhập tuổi của bạn: ");
            age = sc.nextInt();
        }
        System.out.printf("tuổi của bạn là %d", age);
    }
}
