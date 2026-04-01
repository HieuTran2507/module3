package ex8;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ex8 {
    static void main(String[] args) {
        // khởi tạo ds đơn hàng
        List<Order> oders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.of(LocalDate.of(2025, 3, 25))),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), Optional.empty()),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.of(LocalDate.of(2025, 3, 23))),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), Optional.empty()),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.of(LocalDate.of(2025, 3, 30)))
        );

        // casc đơn hàng đã được giao
        System.out.println("\ncác đơn hàng đã giao");
        oders.stream()
                .filter(o->o.getDeliveryDate().isPresent())
                .forEach(o -> o.toDisplayString());

        // các đơn hàng chưa được giao
        System.out.println("\ncác đơn hàng chưa giao");
        oders.stream()
                .filter(o -> o.getDeliveryDate().isEmpty())
                .forEach(o->o.toDisplayString());

        // Đếm số đơn hàng đã giao trong khoảng từ ngày 2025-03-17 đến 2025-03-23.
        LocalDate start = LocalDate.of(2025,03,17);
        LocalDate end = LocalDate.of(2025,03,23);

        List<Order> result = oders.stream()
                .filter(rs -> rs.getDeliveryDate()
                        .map(o->!o.isBefore(start)&&!o.isAfter(end))
                        .orElse(false))
                .toList();
        System.out.println("\n đơn hàng từ ngày 2025-03-17 đến 2025-03-23");
        result.stream().forEach(r->r.toDisplayString());
    }
}
