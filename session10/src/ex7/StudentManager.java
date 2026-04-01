package ex7;

import java.util.ArrayList;

public class StudentManager implements Manage<Student>{
    public ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public void display() {
        for(Student s : students) System.out.println(s);
    }

    @Override
    public void search(String findName) {
        int count = 0;
        for (int i = 0; i< students.size(); i++){
            if( students.get(i).getName().equals(findName)){
                System.out.println(students.get(i));
                count ++;
            }
        }
        if(count==0) System.out.println("không tìm thấy sinh viên trong danh sách");
    }

    @Override
    public void phanloai() {
        for (Student s : students){
            if(s.getGpa() >= 8.5) System.out.println(s+", xếp loại giỏi");
            else if (s.getGpa()>=7 && s.getGpa()<8.5) System.out.println(s+", xếp loại giỏi");
            else if (s.getGpa()>=5.5 && s.getGpa()<7) System.out.println(s+", xếp loại khá");
            else System.out.println(s+", xếp loại trung bình/yếu");
        }
    }
}
