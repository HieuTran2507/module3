package ex4;

import java.util.ArrayList;

public class AttendanceManager implements Manage<Student>{
    public ArrayList<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    @Override
    public void add(Student student){
        students.add(student);
    }

    @Override
    public void update(int index, Student student) {
        if(index >= 0 && index < students.size()) students.set(index,student);
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < students.size()) students.remove(index);
    }

    @Override
    public void display() {
        for(Student s : students) System.out.println(s);
    }
}
