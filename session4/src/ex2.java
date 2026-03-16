import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap kich thuoc mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int total = 0;
        for(int i = 0; i<n; i++){
            System.out.print("nhap gia tri phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        System.out.print("tong cac phan tu la: "+total);


    }
}
