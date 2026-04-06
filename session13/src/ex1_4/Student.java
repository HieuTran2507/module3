package ex1_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private Integer id;
    private String name;
    private LocalDate bod;
    private String email;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public Student() {
    }

    public Student(Integer id, String name, LocalDate bod, String email) {
        this.id = id;
        this.name = name;
        this.bod = bod;
        this.email = email;
    }

    public Student(String name, LocalDate bod, String email) {
        this.name = name;
        this.bod = bod;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBod() {
        return bod;
    }

    public void setBod(LocalDate bod) {
        this.bod = bod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bod=" + bod.format(formatter) +
                ", email='" + email + '\'' +
                '}';
    }
}
