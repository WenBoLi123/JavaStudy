package com.iteheima.ListToFileDemo;

import java.io.File;

/*
 File:文件和目录路径的抽象表示
 1:文件和目录可以通过File封装成对象
 2：对于File而言，封装的并不是一个真正的文件，仅仅是一个路径名而已。它可以是存在的，也可以是不存在的。
 将来要通过具体的操作把这个路径的内容转换为具体存在的
 构造方法：
 File(String pathname)通过将给定的路径名字转换成为抽象路径来创建新的file实例
*/
public class FileDemo1 {
    public static void main(String[] args) {
        //File(String pathname);通过给的的路径名字转换为抽象路径的名字创建File实列
        File f1 = new File("E:\\test\\java.txt");
        System.out.println(f1);
        //File f2 = new File ("E:\\test","java.txt")
        File f2 = new File("E:\\test","java.txt");
        System.out.println(f2);
        //File(File parent, String child);从父抽象路径和子路径名字创建的File实例
        File f3 =new File("E:\\test");
        File f4 = new File(f3,"java.txt");
        System.out.println(f3);
        System.out.println(f4);

    }
}
