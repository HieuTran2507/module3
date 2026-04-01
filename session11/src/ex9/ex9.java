package ex9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ex9 {
    static void main(String[] args) {
        User u1 = new User(1, "Quý", Optional.of("quy@example.com"));
        User u2 = new User(2, "Lan", Optional.empty());
        User u3 = new User(3, "Huyền", Optional.of("huyen@example.com"));

        List<Task> tasks = List.of(
                new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),
                new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),
                new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),
                new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),
                new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true)
        );

        System.out.println("\nCông việc quá hạn chưa hoàn thành: ");
        tasks.stream().filter(t->!t.isCompleted()).forEach(t->t.toPrint());

        System.out.println("\nCông việc đã hoàn thành: ");
        tasks.stream().filter(t->t.isCompleted()).forEach(t->t.toPrint());

        System.out.println("\ndanh sách người dùng");
        List<User> users = List.of(u1,u2,u3);
        users.stream().forEach(u->{
            System.out.println("tên: "+u.getName()+", email: "+u.getEmail().orElse("không có email"));
        });

    }
}
