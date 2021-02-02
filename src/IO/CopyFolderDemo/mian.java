package IO.CopyFolderDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class mian {
    public static void main(String[] args) throws IOException {
        String str ="abc";
        byte[] sb = str.getBytes();
        char[] sb1 = str.toCharArray();
        for (byte i : sb){
            System.out.println(i);
        }
        System.out.println("-------------------");
        for(char j:sb1){
            System.out.println(j);
        }
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\wboli\\IdeaProjects\\JavaStudy\\students.txt");
        int j=fileInputStream.read(sb);
        System.out.println(j);
    }
}
