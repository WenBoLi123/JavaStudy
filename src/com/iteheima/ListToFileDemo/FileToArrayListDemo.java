package com.iteheima.ListToFileDemo;
/*需求：把文件中的数据读取到集合中，并遍历集合。需求：文件中每一行数据是一个学生对象的成员变量值
 *    思路
 *        1.定义学生类
 *        2.创建字符缓冲输入流对象
 *        3.创建ArrayList集合对象
 *        4.调用字符缓冲输入流对象的方法读数据
 *        5.把读取到的字符串数据用split()进行分割，得到一个字符串数组
 *        6.创建学生对象
 *        7.把字符数组的每一个元素取出来赋值给对应的学生对象的成员变量值
 *        8.把学生对象添加到集合
 *        9.释放资源
 *        10.遍历集合*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\wboli\\IdeaProjects\\JavaStudy\\students.txt"));
        ArrayList<Student> array = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Student s = new Student();
            s.setSid(lines[0]);
            s.setName(lines[1]);
            s.setAge(Integer.parseInt(lines[2]));
            s.setAddress(lines[3]);
            array.add(s);
        }
        br.close();
        for (Student s : array) {
            System.out.println(s.toString());
//            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());

        }


    }
}
