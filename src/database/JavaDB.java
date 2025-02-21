package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDB {
    public static void main(String[] args) {
        String  url = "jdbc:mysql://localhost:3307/";
        String user = "root";
        String password = "";

        Connection con= null;
        Statement statement = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
