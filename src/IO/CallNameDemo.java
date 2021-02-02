package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\file.txt"));
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();
        //调用字符缓冲输入流对象的方法读数据
        String line ;
        while ((line=bf.readLine())!=null){
            array.add(line);
        }
        bf.close();
        Random r = new Random();
        int index = r.nextInt(array.size());
        String name = array.get(index);
        System.out.println("幸运者是"+name);



    }
}
