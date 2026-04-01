package ex7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        ArrayList<Student> students = new ArrayList<>();
        manager.students.addAll(Arrays.asList(
                new Student(1,"nguyen van a",7.5),
                new Student(2,"nguyen van a",6.5),
                new Student(3,"nguyen van c",4),
                new Student(4,"nguyen van d",9),
                new Student(5,"nguyen van e",5.5),
                new Student(6,"nguyen van f",1)
        ));

        int choice;
        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ SINH VIÊN ***************");
            System.out.println("1. in danh sách sinh viên");
            System.out.println("2. tìm kiếm theo tên");
            System.out.println("3. phân loại theo GPA");
            System.out.println("4. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        manager.display();
                        break;
                    case 2:
                        String findName = inputData.getString(sc,"nhập tên sinh viên cần tìm: ");
                        manager.search(findName);
                        break;
                    case 3:
                        manager.phanloai();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("vui lòng nhập số từ 1 - 4");
                }
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số từ 1 - 4");
            }
        }
    }
}
