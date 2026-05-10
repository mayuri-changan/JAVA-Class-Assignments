package com.annotation;

public class MyClass {

    @CustomAnnotation
    public void method1() {
        System.out.println("Method1 invoked (annotated).");
    }

    public void method2() {
        System.out.println("Method2 invoked (not annotated).");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("Method3 invoked (annotated).");
    }

    public void method4() {
        System.out.println("Method4 invoked (not annotated).");
    }
}
