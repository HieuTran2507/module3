import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        int num;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số cần tính tổng: ");
        num = scanner.nextInt();

        if(num <= 0) System.out.print("số không hợp lệ");
        else{
            for(int i = 1; i<=num; i++){
                total += i;
            }
            System.out.printf(" tổng từ 1 đến %d là: %d",num,total);
        }
    }
}
