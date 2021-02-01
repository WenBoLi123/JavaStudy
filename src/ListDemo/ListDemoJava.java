package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemoJava {
    public static void main(String[] args) {
        List<Student> aa = new ArrayList<Student>();
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("风清杨",20);
        Student s3 = new Student("张三风",10);
        aa.add(s1);
        aa.add(s2);
        aa.add(s3);
        Iterator<Student> it = aa.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("----------");
        for(int i=0;i<aa.size();i++){
            Student s = aa.get(i);
            System.out.println(s);
        }
    }



}
