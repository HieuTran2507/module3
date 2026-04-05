import java.util.Scanner;

public class ex4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nhap email
        System.out.print("nhap email: ");
        String email = sc.nextLine();

        // loai bo khoang trang
        email = email.trim();

        // regex kiem tra email
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";

        if(email.matches(regex)) System.out.print("email hop le");
        else System.out.print("email khong hop le");
    }
}
