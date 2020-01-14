package com.cj.exception;

public class Exception {
    /**
     * try, catch, finally, throws, throw
     * Checked异常、Runtime异常
     *
     * 无法穷举所有的异常情况
     * 错误处理代码和业务实现代码混杂
     *
     * 抛出异常 throw Exception
     * 捕获异常 catch Exception
     *
     * Throwable, Error, Exception
     * Error 虚拟机相关的问题，如系统崩溃、虚拟机错误、动态链接失败等，这种错误无法恢复或不可捕获，将导致应用程序失败。不需要catch或throws来捕获或抛出
     *
     * 常见RuntimeException: IndexOutOfBoundsException, NumberFormatException, ArithmeticException, NullPointerException, ClassCastException
     *
     * 异常捕获时，先捕获小异常，再捕获大异常
     *
     * Java 7提供的多异常捕获，一个catch块捕获多种类型的异常
     * > 多种异常类型之间用|竖线分隔
     * > 异常变量有隐式的final修饰
     *
     * 异常对象包含的常用方法：
     * getMessage()
     * printStackTrace()
     * printStackTrace(PrintStream s)
     * getStackTrace()
     *
     * 垃圾回收机制不会回收任何物理资源，垃圾回收机制只能回收堆内存中对象所占用的内存
     * finally中需要进行物理资源的回收，例如数据库连接、网络连接和磁盘文件等
     *
     * 不管try中是否发生异常，不管哪个catch捕获了异常，不是try/catch块中是否有return语句，finally都将执行
     * 若try块或catch块中使用System.exit(1)退出虚拟机，finally将不执行
     *
     * try块必选
     * catch块和finally块可选，至少出现一个
     * 自动关闭资源的try块可以没有catch块和finally块，因为try块包含了隐式的finally块
     * 如果需要，自动关闭资源的try语句后也可以带多个catch块和一个finally块
     *
     * Java 7增强了try语句功能---允许在try关键字后紧跟一对圆括号，圆括号可以声明、初始化一个或多个资源，
     * 此处的资源指的是那些必须在程序结束时显示关闭的资源（比如数据库连接、网络连接等），try语句在该语句结束时自动关闭这些资源。
     * 这些资源实现类必须实现AutoCloseable或Closeable接口，实现这两个接口就必须实现close()方法
     *
     * Closeable是AutoCloseable的子接口，可以被自动关闭的资源类要么实现AutoCloseable接口，要么实现Closeable接口。
     * Closeable接口里的close()方法声明抛出了IOException，它的实现类在实现close()方法时只能声明抛出IOException或其子类；
     * AutoCloseable接口里的close()方法声明抛出了Exception，它的实现类在实现close()方法时可以声明抛出任何异常
     *
     *
     * Java 7几乎把所有的“资源类”进行了改写，都实现了AutoCloseable或Closeable接口
     *
     * finally块中使用了return或throw语句，将会导致try块、catch块中的return、throw语句失效。通常情况下不要这么做。
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
