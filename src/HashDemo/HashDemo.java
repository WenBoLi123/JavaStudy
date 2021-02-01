package HashDemo;

import ListDemo.Student;



public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("林青霞",30);
        //对同一个对象多次调用HashCode()方法返回Hash值
        System.out.println(s.hashCode());//
        System.out.println(s.hashCode());
        System.out.println("-----------");
        Student s2  = new Student("林青霞",30);
        //默认情况下，不同对象的Hash值是不同的
        System.out.println(s2.hashCode());
        //通过方法重写，可以实现不同对象的哈希值是相同的

    }
}
