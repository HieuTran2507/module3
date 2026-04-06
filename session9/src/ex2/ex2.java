package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> petList = new ArrayList<>();

        do {
            System.out.println("***********QUẢN LÝ THÚ CƯNG***********");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm thú cưng");
            System.out.println("3. Gọi tiếng kêu");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Tìm theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (petList.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (Pet p : petList) {
                            p.displayData();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Chọn loại (1-Dog | 2-Cat): ");
                    int type = Integer.parseInt(scanner.nextLine());

                    Pet pet = null;
                    if (type == 1) pet = new Dog();
                    else if (type == 2) pet = new Cat();

                    if (pet != null) {
                        pet.inputData(scanner, petList);
                        petList.add(pet);
                        System.out.println("Thêm thành công!");
                    }
                    break;

                case 3:
                    for (Pet p : petList) {
                        p.displayData();
                        p.speak();
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã cần xóa: ");
                    String deleteId = scanner.nextLine();
                    boolean foundDelete = false;

                    for (int i = 0; i < petList.size(); i++) {
                        if (petList.get(i).getPetId().equals(deleteId)) {
                            petList.remove(i);
                            foundDelete = true;
                            System.out.println("Xóa thành công!");
                            break;
                        }
                    }

                    if (!foundDelete) {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String name = scanner.nextLine();
                    boolean foundSearch = false;

                    for (Pet p : petList) {
                        if (p.getPetName().toLowerCase().contains(name.toLowerCase())) {
                            p.displayData();
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
                    System.out.println("Chọn 1-6!");
            }

        } while (true);
    }
}
