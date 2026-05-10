package com.reflection;

public class MyClass {
    public void method1() {}
    public void method2(int a) {}
    public void method3(int a, int b) {}
    public void method4(int a, int b, int c) {
        System.out.println("Method4 invoked: " + (a + b + c));
    }
    public void method5(int a, int b, int c, int d) {
        System.out.println("Method5 invoked: " + (a + b + c + d));
    }
    public void method6(String s, int x, double y, boolean b) {
        System.out.println("Method6 invoked: " + s + ", " + x + ", " + y + ", " + b);
    }
}
