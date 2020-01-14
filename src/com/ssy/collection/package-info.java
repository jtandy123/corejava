/**
 * 关于Object类的equals方法的特点：
 * a. 自反性：x.equals(x)应该返回true
 * b. 对称性：x.equals(y)为true，那么y.equals(x)也为true
 * c. 传递性：x.equals(y)为true并且y.equals(z)为true，那么x.equals(z)也应该为true
 * d. 一致性：x.equals(y)的第一次调用为true，那么x.equals(y)的第二次、第三次、第n次调用也应该为true，前提条件是在比较之间没有修改x，也没有修改y
 * e. 对于非空引用x，x.equals(null)返回false
 *
 * 关于Object类的hashCode()方法的特点：
 * a. 在Java应用的一次执行过程当中，对于同一个对象的hashCode方法的多次调用，它们应该返回同样的值（前提是该对象的信息没有发生变化）
 * b. 对于两个对象来说，如果使用equals方法比较返回true，那么两个对象的hashCode值一定是相同的
 * c. 对于两个对象来说，如果使用equals方法比较返回false，那么这两个对象的hashCode值不要求一定不同（可以相同，也可以不同），但是如果不同则可以提高应用HashTable的性能
 * d. 对于Object类来说，不同的Object对象的hashCode值是不同的（Object类的hashCode值表示的是对象的地址）
 *
 * 当使用HashSet时，hashCode()方法就会得到调用，判断已经存储在集合中的对象的hash code值是否与增加的对象的hash code值一致；
 * 如果不一致，直接加进去；如果一致，再进行equals方法的比较，equals方法如果返回true，表示对象已经加进去了，就不会再增加新的对象，否则加进去。
 *
 * 如果重写equals方法，那么也要重写hashCode方法，反之亦然。
 *
 * Map(映射)：Map的keySet()方法会返回key的集合，因为Map的键是不能重复的，因此keySet()方法的返回类型是Set；
 * 而Map的值是可以重复的，因此values()方法的返回类型是Collection，可以容纳重复的元素
 *
 */
package com.ssy.collection;