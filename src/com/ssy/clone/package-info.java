/**
 * deep clone与shallow clone
 *
 * Java中对象的克隆
 * 1. 为了获取对象的一份拷贝，可以利用Object类的clone()方法。
 * 2. 在派生类中覆盖基类的clone()方法，并声明为public（Object类中的clone()方法为protected的）。
 * 3. 在派生类的clone()方法中，调用super.clone()。
 * 4. 在派生类中实现Cloneable接口。
 *
 * 在运行时刻，Object中的clone()识别出你要复制的是哪一个对象，然后为此对象分配空间，并进行对象的复制，将原始对象的内容一一复制到新对象的存储空间中。
 * 继承自java.lang.Object类的clone()方法是浅复制
 *
 * 在Java语言里深复制一个对象，常常可以先使对象实现Serializable接口，然后把对象（实际上只是对象的一个拷贝）写到一个流里，再从流里读出来，便可以重建对象。
 * 这样做的前提是对象以及对象内部所有引用到的对象都是可串行化的，否则，就需要仔细考察那些不可串行化的对象可否设成transient，从而将之排除在复制过程之外。
 *
 */

package com.ssy.clone;