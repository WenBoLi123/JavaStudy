package IO.CopyFolderDemo;

import java.io.*;


/*
*  需求
*      把E:\\itcast这个文件复制到模块目录下
*  思路：
*      1:创建数据源目录File对象，路径是E:\\itcast
*      2:获取数据源目录是File对象的名称(itcast)
*      3:创建目的地目录File对象,路径名是模块名+itcast组成(myCharStream\\itcast)
*      4:判断目的地目录对应的File是否存在，如果不存在，就创建
*      5:获取数据源目录下的所有文件的File数组
*      6:遍历File数组,得到每一个File对象,该File对象,其实就是数据源文件
*      7：获取数据源文件File对象的名称(mn.jpg)
*      8:创建目的地File对象，路径名是目的地目录+mn.jpg组成(myCharStream\\itcast\\mn.jpg)
*      9:复制文件
*        由于文件不仅仅是文本，还有图片，视频等文件，所以采用字节流复制文件
*
* */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
         //创建数据源目录File对象，路径是E:\\itcast
        File srcFolder = new File("E:\\123");
        //获取数据源目录File对象的名称(itcast)
        String srcFolderName = srcFolder.getName();
        //创建目的地目录File对象，路径名是模块名+itcast组成(JavaStudy)
        //判断目的地对于的File是否存在，如果不存在就创建
        File destFolder = new File("C:\\Users\\wboli\\IdeaProjects\\JavaStudy\\test", srcFolderName);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取数据源目录下文件所以文件的File数组
        File[] listFiles = srcFolder.listFiles();
        for(File scrFile:listFiles){
            //数据源文件：E:\\itcast\\
            String srcFileName=scrFile.getName();
            File destFile =new File(destFolder,srcFileName);
            //复制文件
            copyFile(scrFile,destFile);
        }
    }

    private static void copyFile(File scrFile, File destFile) throws IOException {
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(scrFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys =new byte[1024];
        int len ;
        while ((len= bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }

}
