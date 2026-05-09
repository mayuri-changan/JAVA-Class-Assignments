/*2. ABC Recruitment company wants to maintain information about studentsDesign a menu
driven program to store Student object as a key and skill set of student as value in a Map
for every student store sid,name,bdate,degree, marks for degree.
and perform following operation
1. add new student
2. add new skill for a student
3. delete student
4. delete skill for a student
5. display all students with given skill(accept skill from user)
6. display all students with given degree(accept degree from user
7. exit  */

package com.abc.recruitment;

public class Student {
    int sid;
    String name;
    String bdate;
    String degree;
    double marks;

    public Student(int sid, String name, String bdate, String degree, double marks) {
        this.sid = sid;
        this.name = name;
        this.bdate = bdate;
        this.degree = degree;
        this.marks = marks;
    }

    public String toString() {
        return sid + " - " + name + " - " + degree + " - " + marks;
    }

    // IMPORTANT for Map key uniqueness
    public int hashCode() {
        return sid;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.sid == s.sid;
    }
}
