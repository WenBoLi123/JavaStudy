package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*   public static final InputStream in :标准输入流
*  InputStream is = System in ;
*  int by ;
*  while((br = is.read())!=-1){
*   System.out.println((char)by);
* }
*  //如何把字节流转换成字符流？用转换流
*   InputStreamReader isr = new InputStreamReader(is);
*  //一次读取一行数据的方法是字符缓冲输入流的特有方法
*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*
*
* */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);
        System.out.println("请输入整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是"+i);

    }
}
