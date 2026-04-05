package ex5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventManage {
    private final List<Event> events;

    public EventManage() {
        events = new ArrayList<>();

    }

    public void addEvent(Scanner sc){
        String eventName = inputData.getString(sc,"nhập tên sự kiện: ");
        LocalDateTime startdate = inputData.getDateTime(sc,"nhập ngày bắt đầu (yyyy/mm/dd hh:mm): ");
        LocalDateTime endtdate = inputData.getDateTime(sc,"nhập ngày kết thúc (yyyy/mm/dd hh:mm): ");
        events.add(new Event(eventName,startdate,endtdate));
        System.out.println("đã thêm sự kiện thành coong");
    }

    public void display(){
        if (events.isEmpty()) System.out.println("không có sự kiện nào trong danh sách");
        else {
            events.forEach(System.out::println);
        }
    }
}
