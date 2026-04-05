package lesson5.business.DAO;

import lesson5.business.model.Student;

import java.util.List;

public interface iStudentDAO {
    List<Student> getAllStudent();
    Student findByID(int id);
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteByID(int id);
}
