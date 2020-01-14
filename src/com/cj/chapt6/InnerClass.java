package com.cj.chapt6;

public class InnerClass {
    /**
     * 内部类可以使用任意访问控制符，例如private, protected, public等
     * 内部类与外部类成员变量同名，可用this和外部类类名.this作为限定来区分
     *
     * 非静态内部类里可以直接访问外部类的private成员
     * 非静态内部类里不能定义静态成员，例如静态初始化块、静态成员变量、静态方法
     * 外部类不能直接使用非静态内部类的成员，除非显示创建非静态内部类对象来调用访问其实例成员
     * 外部类的静态方法、静态代码块不能直接访问非静态内部类，包括不能使用非静态内部类定义变量、创建实例等
     *
     * static关键字不可修饰外部类，但可修饰内部类
     * StaticInnerClass可以包含静态成员，也可以包含非静态成员
     * StaticInnerClass不能访问外部类的实例成员，只能访问外部类的类成员
     *
     * 静态内部类对象不是寄生在外部类的实例中，而是寄生在外部类的类本身中。静态内部类对象只持有外部类的类引用，没有持有外部类对象的引用
     * 外部类的所有方法、所有初始化块中可以直接使用静态内部类来定义变量、创建对象
     * 外部类不能直接访问静态内部类的成员，但可以使用静态内部类的类名作为调用者来访问静态内部类的类成员，或者使用静态内部类对象作为调用者来访问静态内部类的实例成员
     *
     * 接口里可以定义内部类，接口里定义的内部类默认使用public static修饰，即接口内部类只能是静态内部类
     *
     * 定义类的主要作用：定义变量、创建实例、作为父类被继承
     *
     * 在外部类以外的地方定义内部类变量：
     * OuterClass.InnerClass varName
     *
     * 创建非静态内部类对象：
     * OuterInstance.new InnerConstructor()
     *
     * 创建非静态内部类的子类时，须让子类构造器可以调用非静态内部类的构造器，调用非静态内部类的构造器时，必须存在一个外部类对象
     * public class SubClass extends Out.In
     * {
     *     public SubClass(Out out)
     *     {
     *         out.super("hello");
     *     }
     * }
     *
     * 非静态内部类的子类不一定是内部类，可以是一个外部类。但非静态内部类的子类实例一样需要保留一个引用，该引用指向其父类所在外部类的对象
     * 如果有一个内部类子类的对象存在，则一定存在与之对应的外部类对象
     *
     * 创建静态内部类实例：
     * new OuterClass.InnerConstructor()
     *
     * public class SubClass extends Out.StaticIn {}
     *
     * 相比之下，使用静态内部类比使用非静态内部类要简单很多，只要把外部类当成静态内部类的包空间即可。优先使用静态内部类
     *
     * 局部内部类仅在方法内有效，不能在外部类的方法以外的地方使用，所以局部内部类也不能使用访问控制符和static修饰符修饰
     * 局部内部类实际开发中很少使用
     *
     * 匿名内部类适合创建只需要一次使用的类
     * new 实现接口() | 父类构造器(实参列表)
     * {
     *     // 匿名内部类的类体部分
     * }
     * 匿名内部类不能是抽象类，系统在创建匿名内部类时，会立即创建匿名内部类的对象
     * 匿名内部类不能定义构造器，匿名内部类可以定义初始化块，可以通过实例初始化块来完成构造器需要完成的事情
     *
     * 最常用的创建匿名内部类的方式是需要创建某个接口类型的对象
     * 通过实现接口来创建匿名内部类时，匿名内部类不能显示创建构造器，只有一个隐式的无参数构造器，故new接口名后的括号里不能传入参数值
     * 通过继承父类来创建匿名内部类时，匿名内部类拥有和父类相似的构造器(拥有相同的形参列表)
     *
     * 当创建匿名内部类时，必须实现接口或抽象父类里的所有抽象方法。如果有需要，也可以重写父类中的普通方法
     *
     * 被局部内部类、匿名内部类访问的局部变量必须使用final修饰。Java 8开始，可以省略final，系统会自动添加final
     *
     * Lambda表达式允许使用更简洁的代码来创建只有一个抽象方法的接口(称为函数式接口)的实例
     * 函数式接口可以包含多个默认方法、类方法，但只能声明一个抽象方法
     *
     * (形参列表) -> {}
     * 形参列表允许省略形参类型。若只有一个参数，形参列表的圆括号也可以省略
     * Lambda表达式的结果就是对象，完全可以使用Lambda表达式进行赋值
     *
     * Lambda表达式的代码块只有一条代码，可以在代码块中使用方法引用和构造器引用
     *
     * Lambda表达式与匿名内部类都可以直接访问effectively final的局部变量，以及外部类的成员变量(包括实例变量和类变量)
     * Lambda表达式创建的对象与匿名内部类生产的对象都可以直接调用从接口中继承的默认方法
     *
     * 匿名内部类实现的抽象方法的方法体允许调用接口中定义的默认方法；但Lambda表达式的代码块中不允许调用接口中定义的默认方法
     *
     */
}