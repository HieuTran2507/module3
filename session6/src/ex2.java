import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = "", email = "", sdt = "", mk = "";
        do{
            System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.print("nhap ho ten: ");
                    ten = sc.nextLine();
                    System.out.print("nhap email: ");
                    email = sc.nextLine();
                    System.out.print("nhap sdt: ");
                    sdt = sc.nextLine();
                    System.out.print("nhap mat khau: ");
                    mk = sc.nextLine();
                    break;
                case 2:
                    if(!ten.isEmpty()) {
                        ten = chuanHoaHoTen(ten);
                        System.out.println("ten: "+ten);
                    }
                    else {
                        System.out.println("chua nhap ten!");
                    }
                    break;
                case 3:
                    System.out.println(checkEmail(email) ? "email hop le" : "email khong hop le");
                    break;
                case 4:
                    System.out.println(checkphone(sdt) ? "sdt hop le" : "sdt khong hop le");
                    break;
                case 5:
                    System.out.println(checkPass(mk) ? "mk hop le" : "mk khong hop le");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("vui long chon tu 1 -6");
            }
        }
        while (true);
    }

    public static String chuanHoaHoTen(String ten){
        ten = ten.trim().toLowerCase();
        String[] words = ten.split("\\s+"); // tach chuoi theo 1 hoac nhieu khoang trang
        StringBuilder sb = new StringBuilder(); // dung string builder noi chuoi hieu qua hon string
        for(String w : words){
            sb.append(Character.toUpperCase(w.charAt(0))) // lay ky tu dau va viet hoa
                    .append(w.substring(1)) // lay them cac ky tu con lai
                    .append(" "); // them khoang cach
        }
        return sb.toString().trim();
    }

    public static boolean checkEmail(String email){
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
         /*
        REGEX:
        ^ : bắt đầu chuỗi
        [A-Za-z0-9+_.-]+ : phần trước @
        @ : bắt buộc
        [A-Za-z0-9.-]+ : phần domain
        $ : kết thúc
        */
    }

    public static boolean checkphone(String sdt){
        return sdt.matches("^(03|05|07|08|09)\\d{8}$");
        /*
        REGEX:
        (03|05|07|08|09): đầu số hợp lệ
        \\d{8}: 8 số phía sau
                */
    }

    public static boolean checkPass(String mk){
        return mk.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        /*
        REGEX:
        (?=.*[a-z]) : có chữ thường
                (?=.*[A-Z]) : có chữ hoa
                (?=.*\\d) : có số
        (?=.*[@#$%^&+=!]) : có ký tự đặc biệt
                .{8,} : ít nhất 8 ký tự
        */
    }
}
