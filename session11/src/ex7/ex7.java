package ex7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex7 {
    static void main(String[] args) {
        // khởi tạo danh sách sinh viên
        List<Student> students = List.of(
                new Student("Quý", "IT", 8.5),
                new Student("Lan", "Business", 7.2),
                new Student("Minh", "IT", 9.0),
                new Student("Huyền", "Design", 6.8),
                new Student("Long", "IT", 7.9),
                new Student("Trang", "Business", 8.1),
                new Student("Việt", "IT", 8.0),
                new Student("Tú", "Design", 7.5),
                new Student("Phúc", "Business", 6.9),
                new Student("An", "AI", 9.5)
        );

        // in ra danh sách thống kê theo major
        Map<String, Long> result = students.stream()
                .collect(
                        Collectors.groupingBy(m->m.getMajor(),Collectors.counting())
                );
        // sắp xếp giảm dần
        result
                .entrySet() // giữ cả key và value
                .stream()
                .sorted(Map // interface để lưu kiểu dữ liệu key, value
                        .Entry // đại diện cho một cặp key - value
                        .<String,Long>comparingByValue() // <String,Long> : generic của method. comparingByValue(): ss ằng value
                        .reversed()) // đảo ngược
                .forEach(s-> System.out.println(s));

    }
}
