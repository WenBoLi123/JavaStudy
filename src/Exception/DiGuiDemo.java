package Exception;

import java.io.File;

public class DiGuiDemo {
    public static void main(String[] args) {
        //根据指定的路径创建一个文件对象
        File scrFile = new File("D:\\bak");
        //定义一个方法，用于获取指定目录下所有内容,参数为第一步创建的file对象
        getAllFilePath(scrFile);
    }
    public static  void getAllFilePath(File srcFile){
        File[] fileArray = srcFile.listFiles();
        if(fileArray !=null){
            for(File file:fileArray){
                //判断File对象是否为目录
                if(file.isDirectory()){
                    //是：递归调用
                    getAllFilePath(file);
                }
                else {
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
