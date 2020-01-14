package com.ssy.contest;

/**
 *
 * 编写一个小型的应用程序框架，该框架会向用户公开一个run方法，方法声明为：
 * public void run(String className);
 * 该方法位于类ApplicationRun类中，该类的声明为：
 *
 * public class ApplicationRun {
 *     public void run(String className) {
 *         // 这里是方法的执行代码
 *     }
 * }
 *
 * 其中的字符串参数className为用户提供的一个类的全名（包名+类名），当用户将类的全名以字符串的形式传递给该run方法时，
 * run方法会自动执行用户所提供的类中的所有被@Test注解所修饰的public void且不带参数的方法。
 *
 * 说明： @Test注解为该小型应用程序框架所定义的，用户可以使用该注解修饰自己的方法，同时该@Test注解只能用于修饰方法。
 *
 */

public class ApplicationRun {

    public void run(String className) {

    }
}
