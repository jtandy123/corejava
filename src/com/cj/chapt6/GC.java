package com.cj.chapt6;

public class GC {
    /**
     * 垃圾回收机制只负责回收堆内存中的对象，不会回收任何物理资源（例如数据库连接、网络IO等资源）
     * 程序无法精确控制垃圾回收的运行，垃圾回收会在合适的时候进行
     * 在垃圾回收机制回收任何对象之前，总会先调用它的finalize()方法，该方法可能使该对象重新复活（让一个引用变量重新引用该对象），从而导致垃圾回收机制取消回收
     *
     * 可达状态、可恢复状态、不可达状态
     * 只有当一个对象处于不可达状态时，系统才会真正回收该对象所占有的资源
     *
     * 强制系统进行垃圾回收---只是通知系统进行垃圾回收，但系统是否进行垃圾回收依然不确定
     * 调用System类的gc()静态方法：System.gc()
     * 调用Runtime对象的gc()实例方法：Runtime.getRuntime().gc()
     * java -verbose:gc GcTest
     *
     * 当finalize()方法返回后，对象消失，垃圾回收机制开始执行
     *
     * 永远不要主动调用某个对象的finalize()方法，该方法应交给垃圾回收机制调用
     * finalize()方法何时被调用，是否被调用具有不确定性
     * 当JVM执行可恢复对象的finalize()方法时，可能使该对象或系统中其他对象重新变成可达状态
     * 当JVM执行finalize()方法出现异常时，垃圾回收机制不会报告异常，程序继续执行
     *
     * obj = wr.get();
     * if (obj == null) {
     *     wr = new WeakReference(recreateIt());
     *     obj = wr.get();
     * }
     * ...
     * obj = null;
     * ---------------------------------------------
     * obj = wr.get();
     * if (obj == null) {
     *     obj = recreateIt();
     *     wr = new WeakReference(obj);
     * }
     * ...
     * obj = null;
     *
     *
     * 4个访问控制符是互斥的，最多只能出现其中之一
     * abstract和final永远不能同时使用
     * abstract和static不能同时修饰方法，可以同时修饰内部类
     * abstract和private不能同时修饰方法，可以同时修饰内部类
     * private和final同时修饰方法虽然是合法的，但没有太大意义
     *
     *
     * JAR文件与ZIP文件的区别就是在JAR文件中默认包含了一个名为META-INF/MANIFEST.MF的清单文件，这个清单文件是在生成JAR文件时由系统自动创建的
     * JAR文件提供给别人使用，只要别人在系统的CLASSPATH环境变量中添加这个JAR文件，则JVM就可以自动在内存中解压这个JAR包，
     * 把这个JAR文件当成一个路径，在这个路径中查找所需要的类或包层次对应的路径结构
     *
     * jar命令，运行jar命令需要JDK安装目录下lib目录中的tools.jar文件，通常系统会自动加载tools.jar，无须显示设置
     *
     * jar cf test.jar test
     * jar cvf test.jar test
     * jar cvfM test.jar test
     * jar cvfm test.jar manifest.mf test
     * jar tf test.jar > a.txt
     * jar tvf test.jar > a.txt
     * jar xf test.jar
     * jar xvf test.jar
     * jar uf test.jar Hello.class
     * jar uvf test.jar Hello.class
     *
     * 创建可执行的JAR包
     * 当一个应用程序开发成功后，大致有如下三种发布方式：
     * > 使用平台相关的编译器将整个应用编译成平台相关的可执行性文件。这种方式常需要第三方编译器的支持，且编译生成的可执行性文件丧失了跨平台特性，甚至可能有一定的性能下降
     * > 为应用编辑一个批处理文件。java package.MainClass 或者 start javaw package.MainClass
     * > 将一个应用程序制作成可执行的JAR包，通过JAR包来发布应用程序
     *
     * 创建可执行的JAR包的关键在于：让javaw命令知道JAR包中哪个类是主类，javaw命令可以通过运行该主类来运行程序
     * jar cvfe test.jar test.Test test // 把test目录下的所有文件都压缩到test.jar包中，并指定使用test.Test类（如果主类带包名，此处必须指定完整类名）作为程序的入口
     *
     * 运行JAR包有两种方式：
     * 使用java命令, java -jar test.jar
     * 使用javaw命令, javaw test.jar
     *
     * WAR文件是Web Archive File, 对应一个Web应用文档
     * EAR文件是Enterprise Archive File, 对应一个企业应用文档（通常由Web应用和EJB两个部分组成）
     * WAR包和EAR包的压缩格式及压缩方式与JAR包完全一样，只是改变了文件后缀而已
     *
     * java.exe 用于启动window console控制台程序
     * javaw.exe 用于启动GUI程序, 不启用控制台
     * javaws.exe 用于web程序
     * jvm.dll就是java虚拟机规范在windows平台上的一种实现
     *
     */
}
