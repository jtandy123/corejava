/**
 * 装饰模式又名包装（Wrapper）模式
 * 装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案
 * 装饰模式以对客户透明的方式动态的给一个对象附加上更多的责任。换言之，客户端并不会觉得对象在装饰前和装饰后有什么不同。
 * 装饰模式可以在不创造更多子类的情况下将对象的功能加以扩展。
 * 装饰模式把客户端的调用委派到被装饰类。装饰模式的关键在于这种扩展完全是透明的。
 * 装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 *
 * 抽象构建（Component）角色 InputStream/OutputStream
 *   给出一个抽象接口，以规范准备接收附加责任的对象。
 * 具体构建角色 FileInputStream/FileOutputStream
 *   定义一个将要接收附加责任的类。
 * 装饰角色 FilterInputStream/FilterOutputStream
 *   持有一个构件(Component)对象的引用，并定义一个与抽象构件接口一致的接口（实现抽象构件接口）
 * 具体装饰角色 DataInputStream/DataOutputStream
 *   负责给构件对象“粘上”附加的责任
 *
类 */

package com.design.pattern.decorator;