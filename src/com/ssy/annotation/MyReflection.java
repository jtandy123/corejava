package com.ssy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

    public static void main(String[] args) throws Exception {

        MyTest test = new MyTest();

        Class<?> classType = MyTest.class;

        Method method = classType.getMethod("output", new Class[]{});

        if (method.isAnnotationPresent(MyAnnotation.class)) {
            method.invoke(test, new Object[]{});

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

            String hello = myAnnotation.hello();
            String world = myAnnotation.world();

            System.out.println(hello + ", " + world);
        }

        Annotation[] annotations = method.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}
