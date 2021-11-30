package controller;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class connect {
    private static String dbUrl = "jdbc:mysql://localhost:3306/login";
    private static String username = "root";
    private static String password = "";
    
    public static Connection getConnection() throws ClassNotFoundException{
        Connection conn = null; // Khởi tạo connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connection Success!");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Connection Fail!");
        }
        return conn;
    }
    
//    public static void main(String[] args) throws ClassNotFoundException {
//        getConnection();
//    }
}
