package com.reflection;

public class Friend {
    String name;
    int age;

    public Friend() {}

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, I am " + name);
    }

    public void birthday(int years, String message) {
        age += years;
        System.out.println(message + " Happy Birthday! Age now: " + age);
    }
}
