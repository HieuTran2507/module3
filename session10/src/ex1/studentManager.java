package ex1;

import java.util.ArrayList;

public class studentManager {
    // khai bao arrayList students
    private ArrayList<student> students;

    // constructor khi tạo studentManger thì tạo luôn danh sách students rỗng
    public studentManager() {
        students = new ArrayList<>();
    }

    // thêm sinh viên
    public void addStudent(student std){
        students.add(std);
    }

    // hiển thị sinh viên
    public void display(){
        if(students.isEmpty()) System.out.println("chưa có sinh viên nào trong danh sách!");
        else {
            for(student s : students) System.out.println(s);
        }
    }
}
