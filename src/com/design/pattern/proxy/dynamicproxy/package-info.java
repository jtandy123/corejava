/**
 * Java动态代理类位于java.lang.reflect包下，一般主要涉及到以下两个类：
 * 1）Interface InvocationHandler: 该接口中仅定义了一个方法
 *      public Object invoke(Object proxy, Method method, Object[] args)
 *    在实际使用时，第一个参数obj一般是指代理类，method是被代理的方法，args为该方法的参数数组。这个抽象方法在代理类中动态实现
 *
 *    InvocationHandler是一个接口，该接口被代理实例（proxy instance）的调用处理器（invocation handler）实现。
 *    每一个代理实例（proxy instance）都有一个与之关联的调用处理器（invocation handler）。
 *    当调用代理实例的一个方法时，该方法调用将被编码，并且派发到代理实例的调用处理器的invoke方法。
 *
 * 2）Proxy: 该类即为动态代理类，作用类似于静态代理中的ProxySubject，其中主要包含以下内容
 *    protected Proxy(InvocationHandler h);
 *    static Class getProxyClass(ClassLoader loader, Class[] interfaces): iterfaces是真实类所拥有的全部接口的数组
 *    static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h):
 *    返回代理类的一个实例，返回后的代理类可以当作被代理类（即真实类）使用（可使用被代理类的在Subject接口中声明过的方法）
 *
 * 所谓Dynamic Proxy是这样一种class：它是在运行时生成的class，在生成它时你必须提供一组interface给它，然后该class就宣称它实现了这些interface。
 * 你当然可以把该class的实例当作这些interface中的任何一个来用。当然，这个Dynamic Proxy其实就是一个Proxy，它不会替你做实质性的工作，在生成它的
 * 实例时你必须提供一个handler，由它接管实际的工作。在使用动态代理类时，必须实现InvocationHandler接口
 *
 */

package com.design.pattern.proxy.dynamicproxy;