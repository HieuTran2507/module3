package ex1;

import java.util.List;
import java.util.Scanner;

public interface iStudent {
    void getAllStudents();
    void addStudent(Scanner sc);
    void updateStudent(Scanner sc);
    void findID(Integer id);
    void deleteStudent(Integer id);
}
