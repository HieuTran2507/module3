package ex2;

import java.util.List;
import java.util.Scanner;

public abstract class Pet {
    protected String petId;
    protected String petName;
    protected int age;

    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    // Getter/Setter
    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Input
    public void inputData(Scanner scanner, List<Pet> petList) {
        // ID
        while (true) {
            System.out.print("Nhập mã (C/D + 3 số): ");
            String id = scanner.nextLine();
            if (id.matches("[CD]\\d{3}") && !isDuplicate(id, petList)) {
                this.petId = id;
                break;
            }
            System.out.println("ID không hợp lệ hoặc bị trùng!");
        }

        // Name
        while (true) {
            System.out.print("Nhập tên (20-50 ký tự): ");
            String name = scanner.nextLine();
            if (name.length() >= 20 && name.length() <= 50) {
                this.petName = name;
                break;
            }
            System.out.println("Tên không hợp lệ!");
        }

        // Age
        while (true) {
            System.out.print("Nhập tuổi (>0): ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age > 0) {
                this.age = age;
                break;
            }
            System.out.println("Tuổi không hợp lệ!");
        }
    }

    private boolean isDuplicate(String id, List<Pet> petList) {
        for (Pet p : petList) {
            if (p.petId.equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Display
    public void displayData() {
        System.out.printf("Mã: %s | Tên: %s | Tuổi: %d\n", petId, petName, age);
    }

    public abstract void speak();
}
