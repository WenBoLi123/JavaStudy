package IO;

import java.io.*;

/*
 *  需求：
 *   把模块目录下的PrintStreamDemo.java复制到模块目录下 Copy.java
 * 思路：
 *       1.根据数据源创建字符输入流对象
 *       2.根据目的地创建字符输出流对象
 *       3.读写数据，复制文件
 *       4.释放资源
 * */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
//        //创建字符输入流对象
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\JavaStudy\\src\\main\\java\\com\\study\\java\\exetend\\CopytxtDemo\\CopyFoldersDemo.java"));
//       //根据目的地创建字符输出流对象
//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\JavaStudy\\src\\main\\java\\com\\study\\java\\exetend\\CopytxtDemo\\CopyFoldersDemo2.java"));
//        //读写数据，复制文件
//        String line;
//        while ((line=br.readLine())!=null){
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//        //释放资源
//        bw.close();
//        br.close();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\JavaStudy\\src\\main\\java\\com\\study\\java\\exetend\\CopytxtDemo\\CopyFoldersDemo.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\\\Users\\\\v_wboli\\\\IdeaProjects\\\\spark_p\\\\JavaStudy\\\\src\\\\main\\\\java\\\\com\\\\study\\\\java\\\\exetend\\\\CopytxtDemo\\\\CopyFoldersDemo2.java"),true);
        String line ;
        while ((line =br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
