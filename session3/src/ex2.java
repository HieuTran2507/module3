import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalStudents = 0;
        double totalMarks = 0;
        double min = 11;
        double max = -1;
        do {
            System.out.println("***************MENU NHẬP ĐIỂM***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoat ");
            System.out.println("Moi ban chon tu 1 - 3 ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.println("nhap diem hoc vien, neu khong muon nhap nua thi nhap -1");
                    while (true){
                        System.out.println("nhap diem hoc vien");
                        double studentMarks = Double.parseDouble(sc.nextLine());
                        if(studentMarks == -1) break;
                        if(studentMarks < 0 || studentMarks > 10){
                            System.out.println("vui long nhap diem tu 0 - 10");
                            continue;
                        }
                        if(studentMarks < 5) System.out.println("hoc luc yeu");
                        else if (studentMarks < 7) System.out.println("hoc luc trung binh");
                        else if (studentMarks < 8) System.out.println("hoc luc kha");
                        else if (studentMarks < 9) System.out.println("hoc luc gioi");
                        else System.out.println("hoc luc xuat sac");

                        // thong ke
                        totalStudents++;
                        totalMarks += studentMarks;
                        if(studentMarks > max) max = studentMarks;
                        if(studentMarks < min) min = studentMarks;
                    }
                    break;
                case 2:
                    if(totalStudents == 0) System.out.println("chua nhap du lieu");
                    else {
                        System.out.println("so hoc vien da nhap: " +totalStudents);
                        System.out.println("diem trung binh: " +(totalMarks/totalStudents));
                        System.out.println("diem cao nhat: "+max);
                        System.out.println("diem thap nhat: "+min);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("vui long chon 1-3");
            }
        }
        while (true);
    }
}
