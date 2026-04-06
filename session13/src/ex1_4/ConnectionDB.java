package ex1_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/jdbc?createDatabaseIfNotExist=true";
    public static final String username = "root";
    public static final String password = "123456";

    public static Connection openConnection(){
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }



}




