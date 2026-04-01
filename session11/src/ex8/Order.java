package ex8;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Order {
    private int id;
    String customerName;
    LocalDate createdDate;
    Optional<LocalDate> deliveryDate; // Để biểu diễn: “có thể có giá trị hoặc không có” (tránh null)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Order() {
    }

    public Order(int id, String customerName, LocalDate createdDate, Optional<LocalDate> deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Optional<LocalDate> deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void toDisplayString() {
        System.out.println(
                "mã đơn hàng: " + id +
                ", tên khách hàng: " + customerName +
                ", ngày tạo " + createdDate.format(formatter) +
                ", ngày giao hàng: " + deliveryDate
                .map(d->d.format(formatter))
                .orElse("chưa giao")
        );
    }
}
