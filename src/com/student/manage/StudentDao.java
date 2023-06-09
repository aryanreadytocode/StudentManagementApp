package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static boolean insertStudent(Student student) {
        boolean f = false;
        // jdbc connection
        try {
            Connection connection = ConnectionProvider.createConnection();
            String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";
            // prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            // set the values of parameters
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentPhone());
            preparedStatement.setString(3, student.getStudentCity());

            //execute
            preparedStatement.executeUpdate();
            f = true;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int studentId) {
        boolean f = false;
        // jdbc connection
        try {
            Connection connection = ConnectionProvider.createConnection();
            String q = "delete from students where sId = ?";
            // prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            // set the values of parameters
            preparedStatement.setInt(1, studentId);

            //execute
            preparedStatement.executeUpdate();
            f = true;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return f;
    }

    public static List<Student> showStudent() {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = ConnectionProvider.createConnection();
            String q = "select * from students";
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(q);
            while (set.next()) {
                students.add(new Student(
                      set.getInt(1),
                      set.getString(2),
                      set.getString(3),
                      set.getString(4)
                ));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
