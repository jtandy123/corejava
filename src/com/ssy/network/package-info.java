/**
 * 使用UDP传输数据时是有大小限制的，每个被传输的数据报必须限定在64KB之内。
 * TCP没有这方面的限制，一旦连接建立起来，双方的socket就可以按统一的格式传输大量的数据。
 *
 * UDP是一个不可靠的协议，发送方所发送的数据报并不一定以相同的次序到达接收方。
 * TCP是一个可靠的协议，它确保接收方完全正确地获取发送方所发送的全部数据。
 *
 * UDP操作简单，且仅需要较少的监护，因此通常用于局域网高可靠性的分散系统中client/server应用程序
 *
 * 可靠的传输是需要付出代价的，对数据内容正确性的检验必然占用计算机的处理时间和网络带宽，因此TCP传输的效率不如UDP高。
 * 许多应用中并不需要保证严格的传输可靠性，比如视频会议系统，并不要求音频视频数据绝对的正确，只要保证连贯性就可以了，这种情况下显然使用UDP会更合理一些。
 *
 * 端口是一种抽象的软件结构（包括一些数据结构和I/O缓冲区）。应用程序通过系统调用与某端口建立连接（binding）后，传输层传给该端口的数据都被相应的进程所接收，
 * 相应进程发给传输层的数据都通过该端口输出。
 *
 * 端口号范围0-65535， 1024一下的端口号保留给预定义的服务。
 *
 * OSI参考模型中，对等层协议之间交换的信息单元统称为协议数据单元（PDU, Protocol Data Unit）.
 * OSI参考模型中每一层都要依靠下一层提供的服务。为了提供服务，下层把上层的PDU作为本层的数据封装，然后加入本层的头部（和尾部）。头部中含有完成数据传输所需的控制信息。
 *
 * TCP/IP模型包括4个层次：
 *   - 应用层（应用层、表示层、会话层）
 *   - 传输层
 *   - 网络层
 *   - 网络接口（数据链路层、物理层）
 *
 * 为获得URL的实际比特或内容信息，用它的openConnection()方法从它创建一个URLConnection对象。
 *
 * InetAddress类用来封装数字式的IP地址和该地址的域名。类的内部隐藏了地址数字。
 *
 * InetAddress类没有明显的构造函数，生成一个InetAddress对象，必须运用一个可用的工厂方法。
 * 工厂方法（factory method）仅是一个类中静态方法返回一个该类实例的约定。
 * InetAddress类的getLocalHost()，getByName()以及getAllByName()可以用来创建InetAddress的实例
 *
 * Socket是连接运行在网络上的两个程序间的双向通讯的端点
 *
 * 使用Socket进行网络通信的过程：
 * 1. 服务器程序将一个套接字绑定到一个特定的端口，并通过此套接字等待和监听客户的连接请求。
 * 2. 客户程序根据服务器程序所在的主机名和端口号发出连接请求。
 * 3. 如果一切正常，服务器接受连接请求。并获得一个新的绑定到不同端口地址的套接字。
 * 4. 客户和服务器通过读、写套接字进行通讯。
 *
 * 使用ServerSocket和Socket实现服务器端和客户端的Socket通信：
 *  1. 建立Socket连接
 *  2. 获得输入/输出流
 *  3. 读/写数据
 *  4. 关闭输入/输出流（关闭Socket的输入/输出流会导致Socket也被关闭）
 *  5. 关闭Socket
 *
 *
 * 数据报是网上传输的独立数据包，数据报是否能正确地到达目的地，到达的时间，顺序，内容的正确性均没有保障。
 * Java中使用Datagram与DatagramPacket类
 * DatagramSocket类利用UDP协议来实现客户与服务器的Socket。
 * send(): 发送数据报
 * receive(): 接收数据报
 *
 *
 */
package com.ssy.network;