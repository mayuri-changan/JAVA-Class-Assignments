/*Q11. Write a Java program to store Student information studid, name, degree, email in a ArrayList
at the time of exit write data in a file in csv format */

package com.student;

public class Student {
    private int studId;
    private String name;
    private String degree;
    private String email;

    public Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    // Getters
    public int getStudId() { return studId; }
    public String getName() { return name; }
    public String getDegree() { return degree; }
    public String getEmail() { return email; }

    // CSV format
    public String toCSV() {
        return studId + "," + name + "," + degree + "," + email;
    }

    @Override
    public String toString() {
        return "ID: " + studId + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
    }
}
