package com.reflection;

public class Student {
    int sid;
    String name;
    double marks;

    public Student() {}

    public Student(int sid, String name, double marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + sid + ", Name: " + name + ", Marks: " + marks);
    }

    public void updateMarks(double marks) {
        this.marks = marks;
    }

    public void setDetails(int sid, String name, double marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }
}
