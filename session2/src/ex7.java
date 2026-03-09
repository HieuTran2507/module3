import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        int canh1, canh2, canh3;
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap canh 1 cua tam giac: ");
        canh1 = sc.nextInt();
        System.out.print("nhap canh 2 cua tam giac: ");
        canh2 = sc.nextInt();
        System.out.print("nhap canh 3 cua tam giac: ");
        canh3 = sc.nextInt();

        if(canh1 + canh2 < canh3)
            System.out.print("ba canh khong tao thanh tam giac!");
        else if (canh1 == canh2 && canh2 == canh3)  System.out.print("tam giac deu");
        else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) System.out.print("tam giac can");
        else if (canh1*canh1 == canh2*canh2 + canh3*canh3 ||
                canh2*canh2 == canh1*canh1 + canh3*canh3 ||
                canh3*canh3 == canh1*canh1 + canh2*canh2)
            System.out.print("tam giac vuong");
        else System.out.print("tam giac thuong");
    }
}
