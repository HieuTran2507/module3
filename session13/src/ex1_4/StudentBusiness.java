package ex1_4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentBusiness implements iStudent{
    private List<Student> students;

    public StudentBusiness() {
        students = new ArrayList<>();
    }

    @Override
    public void getAllStudents() {
        Connection conn = ConnectionDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("{call ex_get_all_student()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()){
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getDate("day_of_birth").toLocalDate(),
                        rs.getString("email")
                );
                students.add(s);
            }
            if(students.isEmpty()) System.out.println("danh sách troonsg");
            else students.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void addStudent(Scanner sc) {
        String name = inputSuggest.getString(sc,"nhập tên sinh viên: ");
        LocalDate date = inputSuggest.getDate(sc,"nhập ngay tháng năm sinh: ");
        String email = inputSuggest.getString(sc,"nhập email: ");

        Student std = new Student(name,date,email);

        Connection conn = ConnectionDB.openConnection();

        try {
            CallableStatement call = conn.prepareCall("{call ex_insert_student(?,?,?)}");
            call.setString(1,std.getName());
            call.setDate(2,java.sql.Date.valueOf(std.getBod()));
            call.setString(3,std.getEmail());

            call.executeUpdate();
            System.out.println("thêm thành công");
            call.close();
        } catch (SQLException e) {
            System.out.println("thêm không thành công");
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void updateStudent(Scanner sc) {
        Student std = new Student();
        Integer id;
        while (true){
            id = inputSuggest.getInt(sc,"nhập id sinh viên cần update: ");
            if (id<=0) System.out.println("nhập id > 0");
            else {
                std = findID(id);
                break;
            }
        }
        if (std!=null){
            String name = inputSuggest.getString(sc, "nhaajp tên sinh viên: ");
            LocalDate dob = inputSuggest.getDate(sc,"nhập ngày tháng năm sinh: ");
            String email = inputSuggest.getString(sc,"nhập email sinh viên: ");

            Connection conn = ConnectionDB.openConnection();
            try {
                CallableStatement call = conn.prepareCall("{call ex_update_student(?,?,?,?)}");
                call.setInt(1,id);
                call.setString(2,name);
                call.setDate(3,java.sql.Date.valueOf(dob));
                call.setString(4,email);

                call.executeUpdate();
                System.out.println("update thành công");
                call.close();
            } catch (SQLException e) {
                System.out.println("update không thành công");
                e.printStackTrace();
            } finally {
                ConnectionDB.closeConnection(conn);
            }
        }else System.out.println("update không thành công");
    }

    @Override
    public Student findID(Integer id) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement call = null;
        try {
            call = conn.prepareCall("{call ex_find_by_id(?)}");
            call.setInt(1,id);
            ResultSet rs = call.executeQuery();
            if (rs.next()){
                Student std = new Student(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getDate("day_of_birth").toLocalDate(),
                        rs.getString("email")
                );
                call.close();
                System.out.println(std);
                return std;
            }else {
                System.out.println("không tìm thấy id sinh viên");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("không tìm thấy id sinh viên");
            e.printStackTrace();
            return null;
        }finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void deleteStudent(Scanner sc) {
        Integer id;
        Student std = new Student();
        while (true){
            id = inputSuggest.getInt(sc,"nhập id sinh viên cần xóa: ");
            if (id<0) System.out.println("vui lòng nhập i > 0");
            else {
                std = findID(id);
                break;
            }
        }
        if (std==null) System.out.println("xóa không thành công");
        else {
            Connection conn = ConnectionDB.openConnection();
            try {
                CallableStatement call = conn.prepareCall("{call ex_delete(?)}");
                call.setInt(1,id);
                call.executeUpdate();
                call.close();
                System.out.println("xóa sinh viên thành công");
            } catch (SQLException e) {
                System.out.println("Lỗi sql");
                e.printStackTrace();
            }
        }
    }
}
