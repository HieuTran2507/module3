import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("nhap n: ");
        int n = sc.nextInt();

        if(n<1 || n>1000){
            System.out.print("gia tri khong hop le");
            return;
        }

        // tap ky tu cho phep
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder result = new StringBuilder();

        for(int i=0;i<n;i++){
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        System.out.println("chuoi ngau nhien: "+result.toString());

    }
}
