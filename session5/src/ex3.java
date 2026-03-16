import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap chuoi: ");
        String text = sc.nextLine();

        // thay the cac so bang *
        String result = text.replaceAll("[0-9]","*");
        System.out.print("chuoi sau khi thay the: "+result);
    }
}
