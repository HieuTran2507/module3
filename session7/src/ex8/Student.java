package ex8;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {}

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // input
    public void inputData(Scanner sc) {
        System.out.print("Enter id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
        gender = Gender.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.print("Enter phone: ");
        phoneNumber = sc.nextLine();
    }

    // display
    public void displayData() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Gender: " + gender +
                ", Address: " + address +
                ", Phone: " + phoneNumber);
    }

    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
