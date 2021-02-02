package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayLIstToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        //创建字符缓冲输出流对象
//        BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\file.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\v_wboli\\\\IdeaProjects\\\\spark_p\\file.txt"));
        for(String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
          bw.close();

    }
}
