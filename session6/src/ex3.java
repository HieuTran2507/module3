import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();
        do{
            System.out.println("******************QUẢN LÝ BIỂN SỐ XE****************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    themBienSo(ds,sc);
                    break;
                case 2:
                    dsBienSo(ds);
                    break;
                case 3:
                    timKiemChinhXac(ds, sc);
                    break;
                case 4:
                    timTheoTinh(ds,sc);
                    break;
                case 5:
                    sapxep(ds);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.print("vui long chon tu 1 - 6");
            }
        }
        while (true);
    }

    public static boolean checkBienSo(String bs){
        return bs.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$");
        /*
        REGEX:
        \\d{2} : 2 số đầu (mã tỉnh)
        [A-Z]  : 1 chữ cái
        -      : dấu gạch ngang
        \\d{3} : 3 số
        \\.     : dấu chấm
        \\d{2} : 2 số cuối
        */
    }

    public static void themBienSo(ArrayList<String> arr, Scanner sc){
        System.out.println("nhap bien so, neu dung thi nhap -1");
        while (true){
            System.out.print("nhap bien so: ");
            String newbs = sc.nextLine();
            if(newbs.equals("-1")) break;
            if(!checkBienSo(newbs)){
                System.out.println("bien so khong dung");
                continue;
            }
            arr.add(newbs);
        }
    }

    public static void dsBienSo(ArrayList<String> arr){
        for(String S : arr) System.out.println(S);
    }

    public static void timKiemChinhXac(ArrayList<String> arr, Scanner sc){
        System.out.print("Nhap bien so xe can tim: ");
        String bs = sc.nextLine();
        if(arr.contains(bs)) System.out.println("da tim thay");
        else System.out.println("khong tim thay");
    }

    public static void timTheoTinh(ArrayList<String> arr, Scanner sc){
        System.out.print("nhap ma tinh can tim: ");
        String maTinh = sc.nextLine();
        boolean found = false;
        for(String s : arr){
            if(s.startsWith(maTinh)){
                System.out.println(s);
                found = true;
            }
        }
        if(!found) System.out.println("khong tim thay");
    }

    public static void sapxep(ArrayList<String> arr){
        Collections.sort(arr);
        System.out.println("danh sach bien so da sap xep: ");
        dsBienSo(arr);
    }
}
