package com.annotation;

import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args) throws Exception {

        Class<MyClass> cls = MyClass.class;
        Object obj = cls.getDeclaredConstructor().newInstance();

        System.out.println("Invoking only annotated methods:");
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(CustomAnnotation.class)) {
                System.out.println("Invoking: " + m.getName());
                m.invoke(obj);
            }
        }

        System.out.println("\nMethods not annotated:");
        for (Method m : methods) {
            if (!m.isAnnotationPresent(CustomAnnotation.class)) {
                System.out.println(m.getName());
            }
        }
    }
}
