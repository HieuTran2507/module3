import java.util.Scanner;

public class ex1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nhap chuoi
        System.out.print("nhap chuoi: ");
        String text = sc.nextLine();

        // nhap tu can tim
        System.out.print("nhap tu can tim: ");
        String word = sc.nextLine();

        int index = text.indexOf(word);

        if(index != -1) System.out.print("tu xuat hien tai vi tri: "+index);
        else System.out.print("tu khong xuat hien trong chuoi");
    }
}
