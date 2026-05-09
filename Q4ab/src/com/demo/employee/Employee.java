/*Q4. Use employee class to store id,name,sal,dept and designation.
a. Use HashSet to store multiple employee objects. Add required functions in the appropriate
class.
No duplicate employee entries are allowed.
-2 Employee objects are same if their id is same
b. b. Use Treemap to store multiple Employee objects. Add required functions in the
appropriate class.*/


package com.demo.employee;

public class Employee {
    private int id;
    private String name;
    private double sal;
    private String dept;
    private String designation;

    public Employee(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public String getDept() {
        return dept;
    }

    public String getDesignation() {
        return designation;
    }

    // 🔴 Important: uniqueness based on ID only
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal + " " + dept + " " + designation;
    }
}
