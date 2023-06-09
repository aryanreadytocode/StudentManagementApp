package com.student.manage;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection connection;
    public static Connection createConnection() {

        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the connection
            String user = "root";
            String password = "123456";
            String url = "jdbc:mysql://localhost:3306/student_manage";
//            String url = "jdbc:mysql://localhost:3306/student_manage?characterEncoding=latin1";
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
