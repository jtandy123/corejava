/**
 * I/O: Input/Output
 * NIO: New I/O
 * 一个File类的对象，表示了磁盘上的文件或目录
 * File类提供了与平台无关的方法来对磁盘上的文件或目录进行操作
 * File类直接处理文件和文件系统
 * File类没有指定信息怎样从文件读取或向文件存储
 * File类描述了文件本身的属性
 * File对象用来获取或处理与磁盘文件相关的信息，例如权限，时间，日期和目录路径
 * File类还可以浏览子目录层次结构
 * File类提供了与具体平台无关的方式来描述目录和文件对象的属性功能。
 * 其中包含大量的方法可用来获取路径、目录和文件的相关信息，并对它们进行创建、删除、改名等管理工作。
 * 因为不同的系统平台，对文件路径的描述不尽相同，为做到平台无关，在Java语言中，使用抽象路径等概念。
 * Java自动进行不同系统平台的文件路径描述与抽象文件路径之间的转换。
 * File类的直接父类是Object类。
 *
 */

package com.ssy.io;