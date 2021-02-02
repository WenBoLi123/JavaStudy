package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //创建字符流输入对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\file.txt"));
        //创建ArrayList集合对象
        ArrayList<String> array= new ArrayList<String>();
        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
        //遍历集合
        for(String s :array){
            System.out.println(s);
        }
    }
}
