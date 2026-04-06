package ex1;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        studentManager manager = new studentManager();
        Scanner sc = new Scanner(System.in);
        String continueInput;

        do{
            String name = inputData.getString(sc, "nhập tên sinh viên: ");
            Integer age = inputData.getInt(sc, "nhập tuổi sinh viên: ");
            Double avgScore = inputData.getDou(sc, "nhập điểm trung bình sinh viên: ");

            student std = new student(name, age, avgScore);
            manager.addStudent(std);

            continueInput = inputData.getString(sc, "bạn có muốn thêm sinh viên khác không (y/n): ");
        }
        while (continueInput.equalsIgnoreCase("y"));

        System.out.println("\ndanh sách sinh viên");
        manager.display();
        sc.close();

    }
}
