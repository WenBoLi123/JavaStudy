package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\file.txt");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_wboli\\IdeaProjects\\spark_p\\file.txt");
        //读写数据，复制文本文件
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
