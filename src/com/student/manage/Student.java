package com.student.manage;

public class Student {
    private int StudentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        super();
        StudentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
