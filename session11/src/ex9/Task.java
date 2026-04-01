package ex9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String title;
    private User assignTo;
    private LocalDate dueDate;
    private boolean completed;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public Task(int id, String title, User assignTo, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.assignTo = assignTo;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(User assignTo) {
        this.assignTo = assignTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void toPrint(){
        System.out.println(
                "\nmã công việc: "+id+
                "\ntên công việc: "+title+
                "\nphụ trách: "+assignTo.toString()+
                "\nhạn nộp: "+dueDate.format(formatter)+
                "\ntrạng thái: "+completed
        );
    }
}
