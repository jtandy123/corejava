/**
 * Reader
 *   BufferedReader
 *     LineNumberReader
 *   CharArrayReader
 *   FilterReader
 *     PushbackReader
 *   InputStreamReader
 *     FileReader
 *   PipedReader
 *   StringReader
 *
 * Writer
 *   BufferedWriter
 *   CharArrayWriter
 *   FilterWriter
 *   OutputStreamWriter
 *     FileWriter
 *   PipedWriter
 *   PrintWriter
 *   StringWriter
 *
 * InputStreamReader和OutputStreamWriter用于处理字符流的基本类，用来在字节流和字符流之间搭一座“桥”。这里字节流的编码规范与具体的平台有关，
 * 可以在构造流对象时指定规范，也可以使用当前平台的缺省规范。
 *
 * An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
 *
 * An OutputStreamWriter is a bridge from character streams to byte streams: Characters written to it are encoded into bytes using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
 *
 * BufferedWriter可以通过减小数据被实际的写到输出流的次数而提高程序的性能。flush()方法可以用来确保数据缓冲区确实被写到实际的输出流。
 *
 * ASCII American Standard Code for Information Interchange
 * 每一个ASCII码与一个8位二进制数对应。其最高位是0，相应的十进制数是0-127。另有128个扩展的ASCII码，最高位都是1，由一些制表符和其它符号组成。ASCII是现今最通用的单字节编码系统。
 *
 * GB2312 一个中文字符用两个字节的数字来表示，为了和ASCII码有所区别，将中文字符每一个字节的最高位置都用1来表示。
 *
 * GBK 为了对更多的字符进行编码，国家又发布了新的编码系统GBK（K是“扩展”的汉语拼音第一个字母）。在新的编码系统里，除了完全兼容GB2312外，还对繁体中文、一些不常用的汉子和许多符号进行了编码。
 *
 * ISO-8859-1 是西方国家所使用的字符编码集，是一种单字节的字符集，而英文实际上只用了其中数字小于128的部分。
 *
 * Unicode 通用的字符集，多所有语言的文字进行了统一编码，对每一个字符都用2个字节来表示（在Internet上传输效率较低）
 *
 * UTF-8 Eight-bit UCS Transformation Format, (UCS, Universal Character Set, 通用字符集， UCS是所有其他字符集标准的一个超集)。
 * 一个7位的ASCII码值，对应的UTF码是一个字节
 * 如果字符是0x0000, 或在0x0080与0x007F之间，对应的UTF码是两个字节
 * 如果字符在0x0800与0xFFFF之间，对应的UTF码是三个字节（汉字为3个字节）
 *
 * RandomAccessFile包装了一个随机访问的文件。它不是派生于InputStream和OutputStream，而是实现定义了基本输入/输出方法的DataInput和DataOutput接口。
 * 它支持定位请求，可以在文件内部放置文件指针。
 *
 * 将对象转换为字节流保存起来，并在以后还原这个对象，这种机制叫做对象序列化。
 * 将一个对象保存到永久存储设备上称为持久化。
 * 序列化（serialization）是把一个对象的状态写入一个字节流的过程。当想要把程序状态存到一个固定的存储区域例如文件时，就可以运用序列化过程存储这些对象。
 *
 * 当一个对象被序列化时，只保存对象的非静态成员变量，不能保存任何的成员方法和静态的成员变量。
 * 如果一个对象的成员变量是一个对象，那么这个对象的数据成员也会被保存。
 * 如果一个可序列化的对象包含对某个不可序列化的对象的引用，那么整个序列化操作将会失败，并且会抛出一个NotSerializableException。可以将这个引用标记为transient，那么对象仍然可以序列化。
 * 使用transient修饰的变量，不会被序列化到文件中。
 *
 * 如果一个类可以序列化，它的所有子类都可以序列化。
 *
 * 在序列化和反序列化进程中需要特殊处理的Serializable类应该实现以下方法：
 *   private void writeObject(java.io.ObjectOutputStream stream) throws IOException;
 *   private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException;
 *   private void readObjectNoData() throws ObjectStreamException
 * 这两个方法不属于任何一个类和任何一个接口，是非常特殊的方法。
 *
 * serialVersionUID: static final long
 * private static final long serialVersionUID = 1l;
 * 或者根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段
 *
 * serialVersionUID是为了让该类别Serializable向后兼容。
 * 如果对象序列化后存到硬盘上后，后来修改了类的field（增加或减少或改名），当你反序列化时，就会出现Exception，这样就会造成不兼容性的问题。
 * 但当serialVersionUID相同时，它就会将不一样的field以type的缺省值Deserialize，这个可以避开不兼容性的问题。
 *
 *
 *
 *
 *
 *
 */

package com.ssy.io3;