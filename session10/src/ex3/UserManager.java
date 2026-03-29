package ex3;

import java.util.LinkedList;

public class UserManager {
    private LinkedList<User> users;

    public UserManager() {
        users = new LinkedList<>();
    }

    // nhap thong tin nguoi dung
    public void addUser(User user){
        users.add(user);
    }

    // xoa nguoi dung dua tren email
    public boolean removeUser(String email){
        return users.removeIf(user -> user.getEmail().equals(email));
    }

    // in danh sach nguoi dung
    public void displayUsers(){
        if(users.isEmpty()) System.out.println("danh sách trống");
        else {
            for(User u : users) {
                System.out.println(u);
            }
        }
    }
}
