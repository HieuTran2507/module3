package ex1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        do {
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật sinh viên theo mã");
            System.out.println("4. Xóa sinh viên theo mã");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (Student st : studentList) {
                            st.displayData();
                        }
                    }
                    break;

                case 2:
                    Student newStudent = new Student();
                    newStudent.inputData(scanner);
                    studentList.add(newStudent);
                    System.out.println("Thêm thành công!");
                    break;

                case 3:
                    System.out.print("Nhập mã SV cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    boolean foundUpdate = false;

                    for (Student st : studentList) {
                        if (st.getStudentId().equals(updateId)) {
                            System.out.println("Nhập thông tin mới:");
                            st.inputData(scanner);
                            foundUpdate = true;
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }

                    if (!foundUpdate) {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã SV cần xóa: ");
                    String deleteId = scanner.nextLine();
                    boolean foundDelete = false;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getStudentId().equals(deleteId)) {
                            studentList.remove(i);
                            foundDelete = true;
                            System.out.println("Xóa thành công!");
                            break;
                        }
                    }

                    if (!foundDelete) {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    boolean foundSearch = false;

                    for (Student st : studentList) {
                        if (st.getStudentName().toLowerCase().contains(searchName.toLowerCase())) {
                            st.displayData();
                            foundSearch = true;
                        }
                    }

                    if (!foundSearch) {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Chọn từ 1-6!");
            }
        } while (true);
    }
}
