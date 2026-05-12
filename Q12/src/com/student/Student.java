/*Q12. Write another program to read data from file created in Q11. and store it in the ArrayList and
dipsplay all the Students information on the screen. */
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

    @Override
    public String toString() {
        return "ID: " + studId + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
    }
}
