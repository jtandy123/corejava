package com.cj.chapter7;

public class BaseClass {
    /**
     *
     * Scanner 一个基于正则表达式的文本扫描器，它可以从文件、输入流、字符串中解析出基本类型值和字符串值
     * hasNext()
     * next()
     * hasNextInt()
     * nextInt()
     * hasNextLine()
     * nextLine()
     *
     * System 代表当前Java程序的运行平台，提供了代表标准输入、标准输出和错误输出的类变量，并提供了一个静态方法用于访问环境变量、系统属性的方法，还提供了加载文件和动态链接库的方法
     * Map<String, String> getenv()
     * Properties getProperties() HashTable
     * String getProperty(String propertyName)
     * long currentTimeMillis()
     * long nanoTime()
     * int identityHashCode(Object o)
     *
     * Runtime 代表Java程序的运行时环境，每个Java程序都有一个与之对应的Runtime实例，应用程序通过该对象与其运行时环境相连。应用程序不能创建自己的Runtime实例，但可以通过getRuntime()方法获取与之关联的Runtime对象
     * getRuntime()
     * exec() 单独启动一个进程来运行操作系统的命令
     * gc()
     * runFinalization()
     * load(String filename)
     * loadLibrary(String libname)
     *
     * Object 所有类、数组、枚举类的父类
     * boolean equals(Object obj)
     * protected void finalize()
     * Class<?> getClass() 返回该对象的运行时类
     * int hashCode()
     * String toString() 返回运行时类名@十六进制hashCode值
     * wait()
     * notify()
     * notifyAll()
     * protected Object clone() 自我克隆，得到当前对象的副本，浅克隆---只克隆该对象的所有成员变量值，不会对引用类型的成员变量值所引用的对象进行克隆
     *
     * 自定义类实现"克隆"步骤：
     * > 自定义类实现Cloneable接口
     * > 自定义类实现自己的clone()方法
     * > 实现clone()方法时通过super.clone()调用Object的clone()方法来得到对象的副本，并返回该副本
     *
     * Objects 提供了一些工具方法来操作对象，这些工具方法大多是"空指针"安全的
     * Java为工具类的命名习惯是添加一个字母s，例如Arrays, Collections
     *
     * Objects.requireNonNull()，传入参数不为null时，该方法返回参数本身；否则引发NullPointerException异常。该方法主要用来对方法形参进行输入校验
     *
     * StringBuffer 代表一个字符序列可变的字符串，是线程安全的，一旦通过StringBuffer生成了最终想要的字符串，就可以调用它的toString()方法将其转换为一个String对象
     * append()
     * insert()
     * reverse()
     * setCharAt()
     * setLength()
     *
     * StringBuilder 与StringBuffer类似，没有实现线程安全功能，所以性能略高。通常情况下优先考虑使用StringBuilder类
     * String, StringBuffer, StringBuilder都实现了CharSequence接口，可认为CharSequence是一个字符串的协议接口
     *
     * 线程安全，是指当多个线程访问同一个变量时，该变量不会因为多线程访问产生意想不到的问题，
     * 为了避免多线程访问的不可预知的问题，对于程序中多线程能访问到的变量要加锁，即加synchronized，放在同步块中，或者对改变该变量值的方法加synchronized限制。
     * 当然jdk中自带的一些类本身就实现了该机制，本身就是线程安全的，比如StringBuffer，Vector等。
     *
     * String
     * char charAt(int index)
     * int compareTo(String anotherString) 字符序列相等，返回0; 不等返回第一个不相等的字符差或者字符长度差
     * String concat(String str)
     * boolean contentEquals(StringBuffer sb)
     * static String copyValueOf(char[] data) 同String(char[] content)
     * static String copyValueOf(char[] data, int offset, int count) 同String(char[] value, int offset, int count)
     * boolean endsWith(String suffix)
     * boolean equals(Object anObject)
     * boolean equalsIgnoreCase(String str)
     * byte[] getBytes() 将该String对象转换成byte数组
     * void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 将字符串中从srcBegin开始，到srcEnd结束的字符串复制到dst字符数组中，其中dstBegin为目标字符数组的起始复制位置
     * int indexOf(int ch)
     * int indexOf(int ch, int fromIndex)
     * int indexOf(String str)
     * int indexOf(String str, int fromIndex)
     * int lastIndexOf(int ch)
     * int lastIndexOf(int ch, int fromIndex)
     * int lastIndexOf(String str) str最后一次出现的位置
     * int lastIndexOf(String str, int fromIndex)
     * int length()
     * String replace(char oldChar, char newChar) 替换第一个
     * boolean startsWith(String prefix)
     * boolean startsWith(String prefix, int toffset)
     * String substring(int beginIndex)
     * String substring(int beginIndex, int endIndex)
     * char[] toCharArray() 将String对象转换成char数组
     * String toLowerCase()
     * String toUpperCase()
     * static String valueOf(X x) 将基本类型值转换为String对象的方法
     *
     * String是不可变的，所以会额外产生很多临时变量，使用StringBuffer或StringBuilder可以避免这个问题
     *
     * Math 无法创建Math类，所有方法都是类方法
     *
     * Random 生成一个伪随机数
     * nextBoolean()
     * nextInt() 生成一个处于int整数取值范围的伪随机数
     * nextInt(int bound) [0, bound)
     * nextDouble() [0.0, 1.0)
     * nextFloat() [0.0, 1.0)
     * nextLong() 生成一个处于long整数取值范围的伪随机数
     * nextGaussian() 生成平均值是0，标准差是1.0的伪高斯数
     *
     * ThreadLocalRandom 在并发访问环境下使用
     *
     * BigDecimal 解决基本浮点类型的浮点数精度容易丢失
     * 优先使用基于String的构造器，BigDecimal(String val) or BigDecimal.valueOf(double value)
     *
     * Date和Calendar用于处理日期、时间的类，包括创建日期、时间对象，获取系统当前日期、时间等操作。
     * Date无法实现国际化
     * Calendar显得过于复杂
     * Java 8吸取了Joda-Time库的经验，提供了一套全新的日期时间库
     *
     * Date() 调用Date(long date),date为System.currentTimeMillis()
     * Date(long date) data毫秒为单位
     * boolean after(Date when) 测试该日期是否在指定日期when之后
     * boolean before(Date when)
     * long getTime() 从GMT 1970-01-01 00:00:00到该Date对象之间的时间差，以毫秒作为计时单位
     * void setTime(long time) 设置该Date对象的时间
     *
     * Calendar
     * GregorianCalendar Gregorian Calendar 公元几几年
     * static Calendar getInstance()
     * Date getTime()
     * void setTime(Date date)
     * void add(int field, int amount)
     * > 当被修改的字段超出它允许的范围时，会发生进位，即上一级字段会增大
     * > 如果下一级字段也需要改变，那么该字段会修正到变化最小的值，如7-31 -> 2-31 -> 2-29
     *
     * int get(int field)
     * int getActualMaximum(int field) 返回指定日历字段可能拥有的最大值
     * int getActualMinimum(int field)
     * void roll(int field, int amount) 类似add方法，区别：加上amount后超过该字段所能表示的最大范围时，也不会向上一个字段进位
     * void set(int field, int value)
     * void set(int year, int month, int date) 设置年月日三个字段
     * void set(int year, int month, int date, int hourOfDay, int minute, int second)
     * field -> Calendar.YEAR, Calendar.MONTH, ...
     *
     * Calendar默认支持较好的容错性，通过setLenient(false)可以关闭Calendar的容错性，让它进行严格的参数检查
     * setLenient()此方法只对set()方法生效
     *
     * set(f, value)方法将日历字段f更改为value, 此外还设置了一个内部成员变量isTimeSet，以指示日志字段f已经被更改。
     * 尽管日历字段f是立即更改的，但该Calendar所代表的时间却不会立即修改，知道下次调用get(), getTime(), getTimeInMillis(), add()或roll()时才会重新计算日历的时间
     * 采用延迟修改的优势是多次调用set()不会触发多次不必要的计算（需要计算出一个代表实际时间的long型整数）
     *
     * Java 8新增了一个java.time包
     * Clock 用于获取指定时区的当前日期、时间
     * Duration 代表持续时间
     * Instant         now() now(Clock clock) plusXxx() minusXxx()
     * LocalDate       now() now(Clock clock) plusXxx() minusXxx()
     * LocalTime       now() now(Clock clock) plusXxx() minusXxx()
     * LocalDateTime   now() now(Clock clock) plusXxx() minusXxx()
     * MonthDay        now() now(Clock clock)
     * Year            now() now(Clock clock) plusYears() minusYears()
     * YearMonth       now() now(Clock clock) plusXxx() minusXxx()
     * ZonedDateTime 代表一个时区化的日期、时间
     * ZoneId 代表一个时区
     * DayOfWeek 枚举类，定义了周日到周六的枚举值
     * Month 枚举类，定义了一月到十二月的枚举值
     *
     *
     * Regular Expression
     * String类
     * boolean matches(String regex)
     * String replaceAll(String regex, String replacement)
     * String replaceFirst(String regex, String replacement)
     * String[] split(String regex)
     *
     * Pattern和Matcher这两个类来提供正则表达式支持
     * 正则表达式是一个用于匹配字符串的模板
     *
     * 正则表达式所支持的合法字符
     * x 字符x（x可代表任何合法的字符）
     * \0mnn 八进制数0mnn所表示的字符
     * \xhh 十六进制值0xhh所表示的Unicode字符
     * \\uhhhh 十六进制值0xhhhh所表示的Unicode字符
     * \t 制表符（\u0009）
     * \n 换行符（\u000A）
     * \r 回车符（\u000D）
     * \f 换页符（\u000C）
     * \a 报警符（\u0007）
     * \e Escape符（\u001B）
     * \cx x对应的控制符，x值必须为A~Z或a~z之一，例如\cM匹配Ctrl-M
     *
     * 正则表达式中的特殊字符
     * $ 匹配一行的结尾
     * ^ 匹配一行的开头
     * () 标记子表达式的开始和结束位置
     * [] 中括号表达式的开始和结束位置
     * {} 标记前面子表达式的出现频度
     * * 指定前面子表达式可以出现0次或多次
     * + 一次或多次
     * ? 0次或一次
     * . 匹配除换行符\n和\r之外的任何单字符
     * \ 用于转义下一个字符，或指定八进制、十六进制字符
     * | 指定两项之间任选一项
     *
     * 正则表达式中的“通配符”---可以匹配多个字符的特殊字符（预定义字符）
     * . 可以匹配除\n和\r字符外的任何字符 无法匹配""
     * \d 匹配0-9所有数字
     * \D 匹配非数字 无法匹配""
     * \s 匹配所有的空白字符，包括空格、制表符、回车符、换页符、换行符
     * \S 匹配所有非空白字符 无法匹配""
     * \w 匹配所有的单词字符，包括0-9所有数字、26个英文字母和下划线(_)
     * \W 匹配所有非单词字符 无法匹配""
     *
     * [abc] 表示a、b、c其中任意一个字符
     * [a-f] 表示a~f范围内的任意字符
     * [a-cx-z] 表示a~c、x~z范围内的任意字符
     * [^abc] 表示非a、b、c的任意字符
     * [^a-f] 表示不是a~f范围内的任意字符
     * [a-z&&[def]] 表示a~z和[def]的交集，表示d、e或f
     * [a-z&&[^bc]] 表示a~z范围内的所有字符，除了b和c之外，即[ad-z]
     * [a-d[m-p]] 表示[a-dm-p]
     * [\u4e00-\u9fa5] 匹配所有中文字符
     * [. | \\ ? * + $ ^ - ( ) { } & \[ \] ] 都是普通字符，其中^不在[旁边则为普通字符，-不表示范围时为普通字符
     * [^...] 表示匹配一个未列出的字符
     * 一个字符组即使是排除型字符组，也需要匹配一个字符
     * 写正则表达式时，需要在对欲检索文本的了解程度与检索精确性之间求得平衡
     *
     * 正则表达式还支持圆括号表达式，用于将多个表达式组成一个子表达式，圆括号中可以使用或运算符(|)
     * 一个字符组只能匹配目标文本中的单个字符，而每个多选结构自身都可能是完整的正则表达式，都可以匹配任意长度的文本
     *
     * 边界匹配符
     * ^ 行的开头
     * $ 行的结尾
     * \b 单词的边界 字母数字符号的开始和结束
     * \B 非单词的边界
     * \A 输入的开头
     * \G 前一个匹配的结尾
     * \Z 输入的结尾，仅用于最后的结束符
     * \z 输入的结尾
     *
     * 数量标识符
     * X? 0或1次
     * X* 0次或多次
     * X+ 1次或多次
     * X{n} n次
     * X{n,} 最少出现n次
     * X{n,m}
     *
     * Greedy(贪婪模式): 数量标识符默认采用贪婪模式，除非另有标识，贪婪模式的表达式会一直匹配下去，直到无法匹配为止
     * Reluctant(勉强模式): 用问号后缀(?)表示，匹配最少的字符
     * Possessive(占有模式): 用加号后缀(+)表示，目前只有Java支持占有模式，通常比较少用
     *
     * 正则表达式字符串必须先被编译为Pattern对象，然后再利用该Pattern对象创建对应的Matcher对象。
     * 执行匹配所涉及的状态保留在Matcher对象中，多个Matcher对象可共享同一个Pattern对象
     *
     * Pattern是不可变类，可供多个并发线程安全使用
     * Matcher类
     * find()
     * group()
     * start()
     * end()
     * lookingAt() 只要字符串以Pattern开头就返回true
     * matches() 整个字符串和Pattern完全匹配时才返回true
     * reset() 将现有的Matcher对象应用于新的字符序列
     * 通过find()和group()可以从目标字符串中依次取出特定子串(匹配正则表达式的子串)
     *
     * CharSequence接口，代表一个字符序列，实现类：CharBuffer, String, StringBuffer, StringBuilder
     *
     * 国际化与本地化
     * 消息获取，编码转换，显示布局和数字、日期、货币的格式等
     * 用户提交数据的国际化和本地化
     *
     * 将程序中的标签、提示等信息放在资源文件中，程序需要支持哪些国家、语言环境，就对应提供相应的资源文件。资源文件是key-value对，
     * 每个资源文件中的key是不变的，但value则随不同的国家、语言而改变
     *
     * java.util.ResourceBundle 用于加载国家、语言资源包
     * java.util.Locale 用于封装特定的国家/区域、语言环境
     * java.text.MessageFormat 用于格式化带占位符的字符串
     *
     * 资源文件的命名：
     * baseName_language_country.properties
     * baseName_language.properties
     * baseName.properties
     * baseName是资源文件的基本名，用户可随意指定；而language和country都不可随意变化，必须是Java所支持的语言和国家
     *
     * native2ascii mess.properties mess_zh_CN.properties 将中文转为Unicode编码
     *
     * ResourceBundle读取配置文件及路径问题
     * 使用ResourceBundle读取配置文件，默认要把配置文件放在classpath下（默认的src目录下）
     * src路径下的文件在编译后会放到WEB-INF/classes路径下(默认的classpath)
     * 如果想把配置文件从src分离，可以新建一个src平级的文件夹config, 如果想读取config下的配置文件，只要让config下的输出也指定为和src一样的输出目录就可以了
     * 将config添加到java build path中
     *
     * src不是classpath, WEB-INF/classes, lib才是classpath, WEB-INF/是资源目录，客户端不能直接访问
     * WEB-INF/classes目录存放src目录java文件编译之后的class文件, xml、properties等资源配置文件，这是一个定位资源的入口
     * 引用classpath路径下的文件，只需在文件名前加classpath
     *
     * lib和classes同属classpath, 两者的访问优先级为: lib > classes
     *
     * classpath和classpath*的区别:
     * classpath: 只会到你的classes路径中查找文件
     * classpath*: 不仅包含classes路径，还包括jar文件中(classes路径)进行查找，会遍历所有的classpath
     *
     * ResourceBundle.getBundle(String baseName, Locale locale) Locale封装了一个国家、语言，将根据Locale加载资源文件
     * ResourceBundle根据不同的Locale加载语言资源文件，再根据指定的key取得已加载语言资源文件中的字符串
     *
     * MessageFormat 处理包含占位符的字符串
     * MessageFormat.format(String pattern, Object... values)
     *
     * 使用类文件来代替资源文件必须满足以下条件：
     * > 该类的类名必须是baseName_language_country
     * > 该类必须继承ListResourceBundle, 并重写getContents()方法，该方法返回Object数组, 该数组的每一项都是key-value对
     * > 类文件所在路径为src根路径下
     *
     * ResourceBundle搜索资源文件的顺序是：
     * baseName_zh_CN.class
     * baseName_zh_CN.properties
     * baseName_zh.class
     * baseName_zh.properties
     * baseName.class
     * baseName.properties
     *
     * 抽象类Format的子类：MessageFormat、NumberFormat和DateFormat
     * NumberFormat 抽象基类
     * format() 用于将数值格式化成字符串
     * parse() 用于将字符串解析成数值
     * getCurrencyInstance() 返回默认Locale的货币格式器 或者 传入指定的Locale获取指定Locale的货币格式器
     * getIntegerInstance()
     * getNumberInstance()
     * getPercentInstance()
     *
     * DateFormat 抽象基类
     * format()
     * parse()
     * getDateInstance() 可传入参数指定日期样式和Locale等参数，不指定则使用默认参数
     * getTimeInstance()
     * getDateTimeInstance()
     * 日期、时间样式参数: DateFormat.FULL, DateFormat.LONG, DateFormat.MEDIUM, DateFormat.SHORT
     *
     * DateFormat实例方法setLenient(boolean lenient) 设置该格式器是否采用严格语法
     * 如果采用不严格的日期语法(true), 对于字符串"2014-2-31"将会转换成2004年3月2日
     *
     * SimpleDateFormat是DateFormat的子类。创建SimpleDateFormat对象时需要传入一个pattern字符串(日期模板字符串)
     * format() 用于将Date格式化为String
     * parse() 用于将字符串解析成Date
     *
     * Java 8在java.time.format包下提供了一个DateTimeFormatter格式器类，该类相当于DateFormat和SimpleDateFormat的合体，功能非常强大
     * 获取DateTimeFormatter对象的三种方式：
     * > 直接使用静态常量创建DateTimeFormatter格式器, DateTimeFormatter.ISO_LOCAL_DATE, DateTimeFormatter.ISO_LOCAL_TIME, DateTimeFormatter.ISO_LOCAL_DATE_TIME
     * > 使用代表不同风格的枚举值来创建DateTimeFormatter格式器, 在FormatStyle枚举类中定义了FULL, LONG, MEDIUM, SHORT四个枚举值，它们代表日期、时间的不同风格
     *   DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL),
     *   DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
     *   DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)
     * > 根据模式字符串来创建创建DateTimeFormatter格式器
     *   DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
     *
     * 使用DateTimeFormatter完成格式化
     * 调用DateTimeFormatter的format(TemporalAccessor temporal)方法执行格式化，LocalDate, LocalTime, LocaleDateTime等类都是TemporalAccessor接口的实现类
     * 调用LocalDate, LocalTime, LocalDateTime等日期、时间对象的format(DateTimeFormatter formatter)方法执行格式化
     *
     * DateTimeFormatter提供了一个toFormat()方法，可以获取DateTimeFormatter对应的抽象类Format对象
     *
     * 使用DateTimeFormatter解析字符串
     * 通过日期、时间对象提供的parse(CharSequence text, DateTimeFormatter formatter)方法进行解析
     *
     */
}
