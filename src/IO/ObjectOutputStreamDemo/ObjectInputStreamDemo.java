package IO.ObjectOutputStreamDemo;


/*
 * 构造方法：
 *  objectInputStream(InputStream in ):创建从指定的InputStream读取的ObjectInputStream
 *  反序列化对象的方法
 *  object readObject(); 从ObjectInputStream读取一个对象
 *
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {


    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\123.txt"));
        //Object readObject();从ObjectInputStream读取一个对象
        Object obj = ois.readObject();
        Student s=(Student) obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();

    }
}
