package lesson5.utils;

import lesson5.business.DAO.StudentDAOImp;
import lesson5.business.model.Student;

public class Application {
    static void main(String[] args) {
        StudentDAOImp studentDAO = new StudentDAOImp();
        //studentDAO.getAllStudent().forEach(System.out::println);
        //System.out.println(studentDAO.findByID(2));

        studentDAO.addStudent(new Student(null, "tran tuan hieu","hieu@gmail.com","09900123","toyama",true));
        studentDAO.getAllStudent().forEach(System.out::println);
    }
}
