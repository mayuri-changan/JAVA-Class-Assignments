/*Q5. Reflection Assignment.

1. Write a java program to find name of class, name of methods,
count of parameters, names of parameters, types of parameters for
following classes
1. Rectangle
2. Student
3. Friend
4. MyClass - add 2 methods method 5 and method6 which accepts 4 parameters
If number of parameters to a method >= 3 then invoke that method */
package com.reflection;

public class Rectangle {
    int length, width;

    public Rectangle() {}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public void setDimensions(int l, int w) {
        this.length = l;
        this.width = w;
    }
}
