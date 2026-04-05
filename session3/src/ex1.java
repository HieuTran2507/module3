import java.util.Scanner;

public class ex1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ten khach hang: ");
        String customerName = sc.nextLine();
        System.out.print("nhap ten san pham: ");
        String productName = sc.nextLine();
        System.out.print("nhap gia san pham: ");
        double price = sc.nextDouble();
        System.out.print("nhap so luong mua: ");
        int quantity = sc.nextInt();
        System.out.print("co the khach hang hay khong (true false): ");
        boolean card = sc.nextBoolean();
        double discount = 0;
        double vat = 0;
        double total = 0;

        System.out.printf("khach hang: " +customerName);
        System.out.println();
        System.out.printf("san pham: " +productName);
        System.out.println();
        System.out.printf("so luong: %d", quantity);
        System.out.println();
        System.out.printf("don gia: %f" , price);
        System.out.println();
        System.out.printf("thanh tien: %f" , quantity*price);
        System.out.println();

        if(card){
            discount = price*0.1;
            System.out.printf("giam gia: %f" , discount);
            System.out.println();
        }
        else {
            discount = 0;
            System.out.printf("giam gia: %f" , discount);
            System.out.println();
        }
        vat = price*0.08;
        System.out.printf("VAT: %f" , vat);
        System.out.println();

        total = quantity*price - discount + vat;
        System.out.printf("tong thanh toan: %f" , total);
        System.out.println();
    }
}
