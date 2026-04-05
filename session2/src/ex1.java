import java.util.Scanner;

public class ex1 {
    static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập vào số cần kiểm tra: ");
        num = scanner.nextInt();

        if (num == 0) System.out.print(" số 0 không phải là số chẵn cũng không phải là số lẻ");
        else if (num%2 == 0) System.out.print("số chẵn");
        else System.out.print("số lẻ");
    }
}
