/**
 *
 * InputStream
 *   FileInputStream
 *   ByteArrayInputStream
 *   FilterInputStream
 *     DataInputStream
 *     BufferedInputStream
 *     LineNumberInputStream
 *     PushbackInputStream
 *   ObjectInputStream
 *   PipedInputStream
 *   SequenceInputStream
 *   StringBufferInputStream
 *
 * OutputStream
 *   FileOutputStream
 *   ByteArrayOutputStream
 *   FilterOutputStream
 *     DataOutputStream
 *     BufferedOutputStream
 *     PrintStream
 *   ObjectOutputStream
 *   PipedOutputStream
 *
 * 过滤流的主要特点是在输入输出数据的同时能对所传输的数据做指定类型或格式的转换，即可实现对二进制字节数据的理解和编码转换。
 * 过滤流在读/写数据的同时可以对数据进行处理，它提供了同步机制，使得某一时刻只有一个线程可以访问一个I/O流，以防止多个线程同时对一个I/O流进行操作所带来的意想不到的结果。
 * 类FilterInputStream和FilterOutputStream分别作为所有过滤输入流和输出流的父类。
 *
 * 管道流用于线程间的通信。一个线程的PipedInputStream对象从另一个线程的PipedOutputStream对象读取输入。要使管道流有用，必须同时构造管道输入流和管道输出流。
 * PipedInputStream和PipedOutputStream总是成对出现的。
 *
 */

package com.ssy.io2;