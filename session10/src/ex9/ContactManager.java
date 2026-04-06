package ex9;

import java.util.HashSet;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    // Thêm
    public void addContact(Contact contact) {
        if (!contacts.add(contact)) {
            System.out.println("Số điện thoại đã tồn tại!");
        } else {
            System.out.println("Thêm thành công!");
        }
    }

    // Xóa theo phone
    public void removeContact(String phone) {
        Contact temp = new Contact("", phone);
        if (contacts.remove(temp)) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    // Tìm kiếm
    public void searchContact(String phone) {
        Contact temp = new Contact("", phone);
        if (contacts.contains(temp)) {
            for (Contact c : contacts) {
                if (c.getPhoneNumber().equals(phone)) {
                    System.out.println("Tìm thấy: " + c);
                }
            }
        } else {
            System.out.println("Không tồn tại!");
        }
    }

    // Hiển thị
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống!");
            return;
        }
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}