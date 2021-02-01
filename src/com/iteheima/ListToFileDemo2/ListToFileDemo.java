package com.iteheima.ListToFileDemo2;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *    需求：键盘录入5个学生信息(姓名，语文成绩，数据成绩，英语成绩)。需求按照成绩总分从高到低写入文件
 *     格式：姓名，语文成绩，数学成绩，英语成绩，举个栗子：林青霞,98,99,100
 *   思路：
 *         1. 定义学生类
 *         2.创建TreeSet集合。通过比较器进行排序
 *         3.键盘录入学生成绩
 *         4，创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
 *         5.把学生对象添加到TreeSet集合
 *         6.创建字符缓冲输出流对象
 *         7.遍历集合，得到每一个学生对象
 *         8.把学生对象的数据拼接成指定的字符串
 *         9.调用字符缓冲输出流对象的方法写数据
 *         10.释放资源
 * */
/*
public class ListToFileDemo {
    public static void main(String[] args) {
        new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        })
        //键盘录入学生数据
        for(int i=0;i<5;i++){

        }
    }
}
*/
