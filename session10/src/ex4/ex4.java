package ex4;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();
        int choice;
        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ SINH VIÊN ***************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Update sinh viên");
            System.out.println("3. Xóa sinh viên bằng chỉ số");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        int id = inputData.getInt(sc, "nhập id sinh viên: ");
                        String name = inputData.getString(sc, "nhaajp tên sinh viên: ");
                        Student std = new Student(id, name);
                        manager.add(std);
                        break;
                    case 2:
                        int updateId = inputData.getInt(sc, "nhập id sinh viên cần sửa: ");
                        int index = -1;
                        for(int i = 0; i<manager.students.size(); i++){
                            if(manager.students.get(i).getId() == updateId){
                                index = i;
                                break;
                            }
                        }
                        if (index == -1) System.out.println("khoong tìm thấy sinh viên trong danh sách");
                        else {
                            String newName = inputData.getString(sc,"nhập tên sinh viên mới: ");
                            manager.update(index,new Student(updateId,newName));
                        }
                        break;
                    case 3:
                        int deleteID = inputData.getInt(sc,"nhập id sinh viên cần xóa: ");
                        int deleteIndex = -1;
                        for(int i = 0; i < manager.students.size(); i++){
                            if(manager.students.get(deleteIndex).getId() == deleteID){
                                deleteIndex = i;
                                break;
                            }
                        }
                        if(deleteIndex == -1) System.out.println("sinh viên không có trong danh sách");
                        else{
                            manager.delete(deleteIndex);
                        }
                        break;
                    case 4:
                        manager.display();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("vui lòng nhập số từ 1 - 5");
                }
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số từ 1 - 5");
            }
        }
    }
}
