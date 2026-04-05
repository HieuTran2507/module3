package lesson3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    static void main(String[] args) {
        // đăng ký driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // mở keet nối
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lesson3_testconn?createDatabaseIfNotExist=true",
                    "root",
                    "123456");
            if (conn != null) System.out.println("kết nối thành công");
            else System.out.println("kết nối thất bại");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
