import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> dsDiem = new ArrayList<>();
        do{
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("vui long chon 1 - 8: ");
            int choice = sc.nextInt();


            switch (choice){
                case 1:
                    nhapdiem(dsDiem, sc);
                    break;
                case 2:
                    inDSDiem(dsDiem);
                    break;
                case 3:
                    diemTB(dsDiem);
                    break;
                case 4:
                    maxMin(dsDiem);
                    break;
                case 5:
                    passOrNot(dsDiem);
                    break;
                case 6:
                    sxTangDan(dsDiem);
                    break;
                case 7:
                    thongke(dsDiem);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("vui long chon tu 1 - 8!");
            }

        }while (true);
    }

    public static void nhapdiem(ArrayList<Double> dsDiem, Scanner sc){
        System.out.println("nhap diem sinh vien, nhap -1 neu ket thuc");
        while (true){
            System.out.print("nhap diem hoc sinh: ");
            double diem = sc.nextDouble();
            if (diem == -1) break;
            if(diem < 0 || diem > 10){
                System.out.println("vui long nhap diem tu 0 - 10");
                continue;
            }
            dsDiem.add(diem);
        }
    }

    public static void inDSDiem(ArrayList<Double> arr){
        System.out.println("danh sach diem sinh vien: ");
        System.out.println(arr.toString());
    }

    public static void diemTB(ArrayList<Double> arr){
        double sum = 0;
        if(arr.size()<=0){
            System.out.println("danh sach diem rong");
        }
        else {
            for( Double d : arr ) sum += d;
            System.out.println(sum + " " + arr.size());
            System.out.println("diem trung binh: "+(sum/arr.size()));
        }
    }
    public static void maxMin(ArrayList<Double> arr){
        if(arr.size() <= 0) System.out.println("danh sach diem trong");
        else {
            double max = Collections.max(arr);
            double min = Collections.min(arr);
            System.out.println("diem cao nhat: "+max);
            System.out.println("diem thap nhat: "+min);
        }
    }

    public static void passOrNot(ArrayList<Double> arr){
        int pass = 0;
        int notPass = 0;
        if(arr.size() <= 0) System.out.println("danh sach diem trong");
        else {
            for(Double d : arr){
                if(d>=5) pass++;
                else notPass++;
            }
            System.out.println("so sinh vien dau: " + pass);
            System.out.println("so sinh vien truot: " + notPass);
        }
    }

    public static void sxTangDan(ArrayList<Double> arr){
        if(arr.size() <= 0) System.out.println("danh sach diem trong");
        else{
            Collections.sort(arr);
            System.out.println("danh sach diem tang dan: ");
            System.out.println(arr);
        }
    }

    public static void thongke(ArrayList<Double> arr){
        int gioi = 0;
        if(arr.size() <= 0) System.out.println("danh sach diem trong");
        else{
            for(Double d : arr){
                if(d>= 8) gioi++;
            }
            System.out.println("so luong sinh vien gioi, xuat sac: "+ gioi);
        }
    }
}
