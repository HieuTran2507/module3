import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap vao so amstrong can kiem tra: ");
        int n = sc.nextInt();
        if (n < 0 ){
            System.out.print("so nhap vao khong hop le");
            return;
        }
        // luu gia tri ban dau
        int original = n;

        // dem chu so
        int digits = String.valueOf(n).length();
        int sum = 0;
        // tinh toan
        while (n>0){
            // lay chu so cuoi cung
            int digit = n%10;
            // tinh tong
            sum += Math.pow(digit,digits);
            // bo chu so cuoi cung
            n = n/10;
        }
        if(sum == original) System.out.print("la so amstrong");
        else System.out.print("khong phai la so amstrong");
    }
}
