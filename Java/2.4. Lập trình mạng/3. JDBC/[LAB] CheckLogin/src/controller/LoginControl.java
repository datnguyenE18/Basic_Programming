package controller;

import com.mysql.jdbc.Connection;
import model.LoginModel;
import view.LoginView;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginControl {

    private LoginModel model;
    private LoginView view;
    private connect conn;

    public static boolean CheckLogin(String username, String password) throws ClassNotFoundException, SQLException {
        Connection conn = connect.getConnection();
        String sql = "SELECT pass FROM user WHERE username = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();

        String getPass = null; // lưu giá trị password nhận được từ database
        if (rs.next()) {
            getPass = rs.getString("pass");
        }
        conn.close();

        if (getPass == null) {
            return false;
        } else if (getPass.equals(password)) {
            return true;
        }
        return false;
    }

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.out.println(CheckLogin("test", "test"));
//    }
}
