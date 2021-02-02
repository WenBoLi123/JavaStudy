package IO.ObjectOutputStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
*   对象序列化流
*     构造方法
*     ObjectOutPutStream(OutPutStream out):创建一个写入指定的OutputStream的ObjectOutPutStream
*     序列化对象的方法：
*     void wirteObject(object obj)：将指定的对象写入ObjectOutPutStream
* */
public class ObjectOutputStreamDemo {
    public static void main(String[] args)throws IOException {
         //ObjectOutPutStream(OutPutStream out):创建一个写入指定的OutputStream的ObjectOutPutStream
        ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\123.txt")));
        //创建对象
        Student s = new Student("林庆霞", 30);
        oos.writeObject(s);
        oos.close();

    }
}
