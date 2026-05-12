
/*Q14. Modify code written in Q12. By using ObjectInputStream to read data from file and display it. */
package com.student;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

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
