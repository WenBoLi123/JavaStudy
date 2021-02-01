package com.iteheima.ListToFileDemo;

import java.io.File;
import java.io.IOException;

/*
File文件类功能
public boolean createNewFile();当具有该名称的文件不存在时，创建一个由该抽象路径命名的新空文件
如果文件不存在，就创建文件 返回true 否则false
public boolean mkdir();创建由此抽象路径命名的目录
public boolean mkdirs();创建此抽象路径命名的目录，包括任务必须但不存在的父目录
* */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\test目录下创建一个java.txt文件
        File f1 = new File("E:\\test\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------");
        //需求2：我要在E:\\test目录下创建一个JavaSE目录
        File f2 = new File("E:\\test\\JavaSE");
        System.out.println(f2.mkdir());
        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWeb\HTML
        File f3 = new File("E:\\test\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("E:\\test\\javase.txt ");
        System.out.println(f4.createNewFile());
    }
}
