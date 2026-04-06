package ex1_4;

import java.util.Scanner;

public interface iStudent {
    void getAllStudents();
    void addStudent(Scanner sc);
    void updateStudent(Scanner sc);
    Student findID(Integer id);
    void deleteStudent(Scanner sc);
}
