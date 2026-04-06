package ex1;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String major;

    // Constructor không tham số
    public Student() {
    }

    // Constructor đầy đủ
    public Student(String studentId, String studentName, int age, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.major = major;
    }

    // Getter/Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Nhập dữ liệu
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã SV: ");
        this.studentId = scanner.nextLine();

        System.out.print("Nhập tên SV: ");
        this.studentName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chuyên ngành: ");
        this.major = scanner.nextLine();
    }

    // Hiển thị
    public void displayData() {
        System.out.printf("Mã: %s | Tên: %s | Tuổi: %d | Ngành: %s\n",
                studentId, studentName, age, major);
    }
}
