package com.reflection;

import java.lang.reflect.*;

public class MainApp {

    public static void main(String[] args) throws Exception {

        Class<?>[] classes = {
            Rectangle.class,
            Student.class,
            Friend.class,
            MyClass.class
        };

        for (Class<?> cls : classes) {
            System.out.println("\nClass: " + cls.getName());
            Method[] methods = cls.getDeclaredMethods();

            for (Method m : methods) {
                System.out.println("Method Name: " + m.getName());
                Parameter[] params = m.getParameters();
                System.out.println("Parameter Count: " + params.length);
                for (Parameter p : params) {
                    System.out.println("Parameter Name: " + p.getName() + ", Type: " + p.getType().getSimpleName());
                }

                // If parameter count >= 3, invoke method
                if (params.length >= 3) {
                    System.out.println("Invoking method with dummy parameters...");

                    Object obj = cls.getDeclaredConstructor().newInstance();
                    Object[] dummyArgs = new Object[params.length];

                    for (int i = 0; i < params.length; i++) {
                        Class<?> type = params[i].getType();
                        if (type == int.class) dummyArgs[i] = 1;
                        else if (type == double.class) dummyArgs[i] = 1.0;
                        else if (type == boolean.class) dummyArgs[i] = true;
                        else if (type == String.class) dummyArgs[i] = "test";
                        else dummyArgs[i] = null;
                    }

                    m.invoke(obj, dummyArgs);
                }

                System.out.println("-----------------------------");
            }
        }
    }
}
