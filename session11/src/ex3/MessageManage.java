package ex3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageManage {
    private List<Message> messages;

    public MessageManage() {
        messages = new ArrayList<>();
    }

    public void sendMessage(Message m){
        messages.add(m);
        System.out.println("đã gửi tin nhắn");
    }

    public void showMessage(){
        for (Message m : messages) System.out.println(m);
    }

    public List<Message> senderFilter(String sender){
        List<Message> result = new ArrayList<>();

        messages.stream()
                .filter(s -> s.getSender().equalsIgnoreCase(sender))
                .forEach(s -> {
                    result.add(s);
                    System.out.println(s);
                });

        return result;
    }

    public List<Message> dateFilter(LocalDate d){
        List<Message> result = new ArrayList<>();
        try {

            messages.stream()
                    .filter(m->m.getTimestamp().toLocalDate().equals(d))
                    .forEach(m->{
                        result.add(m);
                        System.out.println(m);
                    });

        } catch (DateTimeException e){
            System.out.println("hãy nhập đúng định dạng yyyy-mm-dd");
        }
        return result;
    }
}
