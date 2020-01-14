/**
 *
 * GUI组件可分为基本组件和容器。组件又称构件，诸如按钮、文本框之类的图形界面元素。容器其实是一种比较特殊的组件，可以容纳其他组件，如窗口、对话框等。
 * 所有的容器类都是java.awt.Container的直接或间接子类。Container是Component的一个子类，且包括两个主要子类：java.awt.Panel和java.awt.Window。
 * 基本的AWT库处理用户界面元素的方法是把这些元素的创建和行为委托给每个目标平台（Windows、Unix、Mactonish等）上的本地GUI工具进行处理。
 * java.awt.Window的子类java.awt.Dialog（没有菜单条，可移动不可缩放）、java.awt.Frame（带标题和缩放角的窗口）
 * java.awt.Panel包含在另一个容器中，或是在Web浏览器的窗口中。Panel确定一个四边形，其他组件可以放入其中。Panel必须放在Window之中（或Window的子类中）以便能显示出来。
 * 容器不但能容纳组件，还能容纳其他容器。
 * 容器里的组件的位置和大小是由布局管理器决定的。可以通过停用布局管理器来控制组件的大小或位置。
 * 然后必须用组件上的setLocation()，setSize()，或setBounds()来定位它们在容器里的位置。
 *
 * java.awt.Window的子类java.awt.Frame和java.awt.Dialog，默认布局管理器java.awt.BorderLayout
 * java.awt.Panel的子类java.applet.Applet，默认布局管理器java.awt.FlowLayout
 *
 * 事件委托模型的优点：
 * - 事件不会被意外地处理
 * - 有可能创建并使用适配器（adapter）类对事件动作进行分类。
 * - 委托模型有利于把工作分布到各个类中
 *
 */

package com.ssy.awt;