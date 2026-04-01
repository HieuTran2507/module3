package ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ex2 {
    static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 8.5),
                new Student("Bob", 22, 6.0),
                new Student("Charlie", 21, 7.5),
                new Student("David", 23, 9.0),
                new Student("Eve", 20, 5.5),
                new Student("Frank", 22, 8.0),
                new Student("Grace", 21, 7.0),
                new Student("Heidi", 23, 8.8),
                new Student("Ivan", 20, 6.5),
                new Student("Judy", 22, 7.2)
        );

        // lọc sinh viên có điểm lớn hơn 7 và sắp xếp theo tên
        List<Student> filteredStudent = students.stream()
                .filter(std -> std.getGpa()>7)
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        // in danh sách sinh viên đã lọc
        for (Student s : filteredStudent) System.out.println(s);
    }
}
