package com.cj.collection;

public class Collection {
    /**
     *
     * Java集合大致可分为Set、List、Queue和Map四种体系
     * Set代表无序、不可重复的集合
     * List代表有序、重复的集合
     * Map代表具有映射关系的集合
     * Queue代表一种队列集合实现，Java 5新增
     *
     * Java 5之前，Java集合会丢失容器中所有对象的数据类型，把所有对象都当成Object类型处理
     * Java 5增加了泛型之后，使用泛型来限制集合里元素的类型，并让集合记住所有集合元素的类型（Java集合可以记住容器中所有对象的数据类型）
     *
     * 集合类 == 容器类
     * 所有集合类都位于java.util包下
     * java.util.concurrent包下提供了一些多线程支持的集合类
     *
     * 数组元素可以是基本数据类型的值，也可以是对象（对象的引用变量）
     * 集合里只能保存对象
     *
     * Collection和Map是Java集合框架的根接口
     * Set、Queue和List接口是Collection接口的子接口
     *
     * 如果访问List集合中元素，可以直接根据元素的索引来访问
     * 如果访问Map集合中的元素，可以根据每项元素的key来访问其value
     * 如果访问Set集合中的元素，只能根据元素本身来访问
     *
     * 对于Set、List、Queue和Map四种集合，最常用的实现类分别为：HashSet、TreeSet、ArrayList、ArrayDeque、LinkedList和HashMap、TreeMap等实现类
     * Collection接口定义操作集合元素的方法：
     * boolean add(Object o)
     * boolean addAll(Collection c)
     * void clear() 将集合长度变为0
     * boolean contains(Object o)
     * boolean containsAll(Collection c)
     * boolean isEmpty() 当集合长度为0时返回true
     * Iterator iterator() 返回一个Iterator对象，用于遍历集合里的元素
     * boolean remove(Object o) 删除第一个符合条件的元素
     * boolean removeAll(Collection c) 取差集，去除c中存在的元素
     * boolean retainAll(Collection c) 取交集，去除c中不存在的元素
     * int size()
     * Object[] toArray() 把集合转换成一个数组
     *
     * 遍历集合元素：
     * 1.
     * Iterable接口是Collection接口的父接口
     * Java 8为java.lang.Iterable接口新增forEach(Consumer action)默认方法，Consumer是函数式接口，可以使用Lambda表达式来遍历集合元素
     * 当调用Iterable的forEach(Consumer action)遍历集合元素时，会依次将集合元素传给Consumer的accept(T t)方法
     * c.forEach(obj -> System.out.println(obj));
     *
     * 2.
     * java.util.Iterator接口也是Java集合框架的成员。主要用于遍历Colleciton集合中的元素
     * Iterator接口隐藏了各种Collection实现类的底层细节，提供了遍历Collection集合元素的统一编程接口
     * boolean hasNext() 若被迭代的集合元素还没有被遍历完，则返回true
     * Object next() 返回集合里的下一个元素
     * void remove() 删除集合里上一次next方法返回的元素
     * void forEachRemaining(Consumer action), Java 8新增的默认方法，可使用Lambda表达式来遍历集合元素
     *
     * Iterator必须依附于Collection对象，若有一个Iterator对象，则必然有一个与之关联的Collection对象
     * Iterator并不是把集合元素本身传给了迭代变量，而是把集合元素的值传给了迭代变量，所以修改迭代变量的值对集合元素本身没有任何影响
     * Iterator迭代器采用的是快速失败（fail-fast）机制，一旦在迭代过程中检测到该集合已经被修改，程序立即引发ConcurrentModificationException异常
     *
     * 3.
     * 使用Iterator的forEachRemaining(Consumer action)方法遍历集合元素
     * Iterator it = c.iterator();
     * it.forEachRemaining(obj -> System.out.println(obj));
     *
     * 4.
     * 使用foreach循环遍历集合元素
     * for (Object obj : c) {
     *     System.out.println(obj);
     * }
     * 当使用foreach循环迭代访问集合元素时，该集合也不能被改变，否则将引发ConcurrentModificationException异常
     *
     * ---------------------------------------------------------------------------------------
     *
     * 使用Java 8新增的Predicate操作集合
     * Java 8为Collection集合新增了一个removeIf(Predicate filter)方法，该方法将会批量删除符合filter条件的所有元素
     * Predicate 函数式接口，可使用Lambda表达式作为参数：Predicate的test(T t)方法
     *
     * 使用Predicate可以充分简化集合的运算，统计符合Predicate条件的元素
     * for (Object obj : c) {
     *     if (p.test(obj)) {
     *         ...
     *     }
     * }
     *
     * 使用Java 8新增的Stream操作集合
     * Stream、IntStream、LongStream、DoubleStream等流式API
     * Stream是一个通用的流接口，而IntStream、LongStream、DoubleStream则代表元素类型为int、long、double的流
     *
     * 独立使用Stream的步骤如下：
     * 1. 使用Stream或XxxStream的builder()类方法创建该Stream对应的Builder
     * 2. 重复调用Builder的add()方法向流中添加多个元素
     * 3. 调用Builder的build()方法获取对应的Stream
     * 4. 调用Stream的聚集方法
     * 第4步可以根据具体需求来调用不同的方法，Stream提供了大量的聚集方法供用户调用。对于大部分聚集方法而言，每个Stream只能执行一次
     *
     * Stream 中间方法 末端方法
     * 中间方法返回另外一个流
     * 末端方法后，流将会被"消耗"且不再可用
     *
     * 有状态的方法 会给流增加一些新的属性，比如元素的唯一性、元素的最大数量、保证元素以排序的方式被处理等。需要更大的性能开销
     * 短路方法 尽早结束对流的操作，不必检查所有元素
     *
     * 常用的中间方法：
     * filter(Predicate predicate) 过滤Stream中所有不符合predicate的元素
     * mapToXxx(ToXxxFunction mapper) 使用ToXxxFunction对流中的元素执行一对一的转换，返回的新流中包含了ToXxxFunction转换生成的所有元素
     * peek(Consumer action) 依次对每个元素执行一些操作，返回的流与原有流包含相同的元素。该方法主要用于调试
     * distinct() 用于排除流中所有重复的元素（equals()比较返回true），这是一个有状态的方法
     * sorted() 用于保证流中的元素在后续的访问中处于有序状态，这是一个有状态的方法
     * limit(long maxSize) 用于保证对该流的后续访问中最大允许访问的元素个数。这是一个有状态的、短路方法
     *
     * 常用的末端方法：
     * forEach(Consumer action)
     * toArray() 将流中所有元素转换为一个数组
     * reduce() 有三个重载的版本，用于通过某种操作来合并流中的元素
     * min()
     * max()
     * count()
     * anyMatch(Predicate predicate)
     * allMatch(Predicate predicate)
     * noneMatch(Predicate predicate) 判断流中是否所有元素都不符合Predicate条件
     * findFirst() 返回流中的第一个元素
     * findAny() 返回流中的任意一个元素
     *
     * Java 8允许使用流式API来操作集合，Collection接口提供了一个stream()默认方法，该方法可返回该集合对应的流，接下来即可通过流式API来操作集合元素
     *
     *
     * Set集合与Collection基本相同，没有提供任何额外的方法。实际上Set就是Collection，只是行为略有不同（Set不允许包含重复元素）
     * 若把两个相同的元素加入同一个Set集合中，则添加操作失败，add()方法返回false，且新元素不会被加入
     * HashSet - 大多数都使用此实现类，按Hash算法来存储集合中的元素，具有很好的存取和查找性能
     * > 不保证元素排列顺序
     * > 不同步，多线程时需要通过代码来保证其同步
     * > 集合元素值可以为null
     * 当向HashSet集合中存入一个元素时，HashSet会调用对象的hashCode()方法来得到该对象的hashCode值，然后根据该hashCode值决定该对象在HashSet中的存储位置。
     * 如果两个元素通过equals()方法比较返回true，但hashCode()方法返回值不相等，HashSet将会把它们存储在不同的位置，依然可以添加成功
     *
     * HashSet集合判断两个元素相等的标准是两个对象通过equals()方法比较相等，并且两个对象的hashCode()方法返回值也相等
     *
     * 当把一个对象放入HashSet中时，如果需要重写该对象对应类的equals()方法，则也应该重写其hashCode()方法。
     * 规则是：如果两个对象通过equals()方法比较返回true，这两个对象的hashCode值也应该相同。
     *
     * equals结果为true，hashCode结果不同，保存在HashSet的不同位置
     * equals结果为false，hashCode结果相同，保存在同一个位置，会在这个位置用链式结构来保存多个对象
     * HashSet访问集合元素时也是根据元素的hashCode值来快速定位的，如果HashSet中两个以上的元素具有相同的hashCode值，将会导致性能下降
     *
     * boolean hashCode = f ? 0 : 1;
     * 整型 hashCode = (int)f;
     * long hashCode = (int)(f^(f>>>32));
     * float hashCode = Float.floatToIntBits(f);
     * double long l = Double.doubleToLongBits(f); hashCode = (int)(l^(l>>>32));
     * 引用类型 hashCode = f.hashCode();
     *
     * 当向HashSet中添加可变对象时，必须十分小心。如果修改HashSet集合中的对象，有可能导致该对象与集合中的其他对象相等，从而导致HashSet无法准确访问该对象
     *
     * TreeSet
     * EnumSet
     *
     *
     *
     *
     *
     *
     */
}
