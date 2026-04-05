package lesson5.business.DAO;

import lesson5.business.model.Student;
import lesson5.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImp implements iStudentDAO{
    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        //B1 mở kết nối
        Connection conn = ConnectionDB.openConnection();
        //B2 tạo truy vấn bằng callable
        try {
            CallableStatement call = conn.prepareCall("{call get_all_student()}");

            //B3 thực thi truy vấn
            ResultSet rs = call.executeQuery();

            // B4 xử lý dữ liệu trả về
                // biến đổi bẳn ghi thành đối tượng trong java
            while (rs.next()){
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender")
                );
                students.add(s);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return students;
    }

    @Override
    public Student findByID(int id) {
        //B1 mở kết nối
        Connection conn = ConnectionDB.openConnection();
        //B2 tạo truy vấn bằng callable
        try {
            CallableStatement call = conn.prepareCall("{call get_student_by_id(?)}");
            call.setInt(1,id);
            //B3 thực thi truy vấn
            ResultSet rs = call.executeQuery();

            // B4 xử lý dữ liệu trả về
            // biến đổi bẳn ghi thành đối tượng trong java
            if (rs.next()){
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender")
                );
                return s;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        Connection conn = ConnectionDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("{call insert_student(?,?,?,?,?)}");
            call.setString(1,student.getFullname());
            call.setString(2,student.getEmail());
            call.setString(3,student.getPhone());
            call.setString(4,student.getAddress());
            call.setBoolean(5,student.getStatus());
            // chỉ thêm vào bảng, không có bảng trả về
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editStudent(Student student) {
        Connection conn = ConnectionDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("{call update_student(?,?,?,?,?,?)}");
            call.setInt(1,student.getId());
            call.setString(2,student.getFullname());
            call.setString(3,student.getEmail());
            call.setString(4,student.getPhone());
            call.setString(5,student.getAddress());
            call.setBoolean(6,student.getStatus());

            // chỉ chỉnh sửa bảng, không có bảng trả về
            call.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteByID(int id) {
        Connection conn = ConnectionDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("{call delete_student(?)}");
            call.setInt(1,id);
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
