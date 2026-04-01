package ex9;

import java.util.Optional;

public class User {
    private int id;
    private String name;
    Optional<String> email;

    public User(int id, String name, Optional<String> email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "id: "+id+", tên: "+name+", email: "+email.orElse("không có email");
    }
}
