/**
 * annotation并不直接影响代码语义，但是它能够工作的方式被看作类似程序的工具或者类库，它会反过来对正在运行的程序语义有所影响。
 * annotation可以从源文件、class文件或者以在运行时反射的多种方式被读取。
 *
 * java.lang.Override是个Marker annotation，用于标示的Annotation，Annotation名称本身即表示了要给工具程序的信息
 * java.lang.Deprecated也是个Marker annotation，Deprecated这个名称在告知编译程序，被@Deprecated标示的方法是一个不建议被使用的方法
 *
 * 使用@interface自行定义Annotation型态时，实际上是自动继承了java.lang.annotation.Annotation接口，由编译程序自动为您完成其它产生的细节
 * 在定义Annotation型态时，不能继承其它的Annotation型态或是接口
 *
 * 预设上父类别中的Annotation并不会被继承至子类别中，可以在定义Annotation型态时加上java.lang.annotation.Inherited型态的Annotation
 *
 */

package com.ssy.annotation;