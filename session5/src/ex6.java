import java.util.Scanner;

public class ex6 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap mat khau: ");
        String password = sc.nextLine();

        // Regex kiểm tra mật khẩu
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

        if(password.matches(regex)) System.out.print("mat khau hop le: ");
        else System.out.print("mat khau khong hop le: ");
    }
}
