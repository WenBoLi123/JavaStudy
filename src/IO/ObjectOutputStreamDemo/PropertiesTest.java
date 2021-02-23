package IO.ObjectOutputStreamDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 需求：写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示:游戏已经结束，提示想玩请充值(www.itcast.cn)
 * 思路：1.写一个测试类，里面有一个猜数字的小游戏
 *   A：从文件读取数据到Properties集合，使用load()方法实现
 *   文件已经存在：game.txt
 *   里面有一个数据值：Count=0
 *   B:通过Properties集合获取到玩游戏的次数
 *   C:判断是否达到了3次
 *     如果到了,给出提示，游戏试玩结束，想玩请充值(www.itcast.cn)
 *     如果不到3次
 *     玩游戏
 *     次数+1，重新写会到文件用Properties的Store方法实现
 */

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
          //从文件读取数据到Properties集合,用Load()方法实现
        Properties prop = new Properties();
        FileReader fileReader = new FileReader("C:\\Users\\v_wboli\\IdeaProjects\\JavaStudy\\game.txt");
        prop.load(fileReader);
        fileReader.close();
        //通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        //判断游戏次数是否达到了3次
        if(number>=3){
            //如果到了，给出提示;游戏试玩结束，想玩请充值(www.itcast.cn)
            System.out.println("游戏试玩结束，想玩请充值(www.itcast.cn)");
        }else {
            //玩游戏
//            GuessNumber.start();
            System.out.println("玩游戏"+number);
            //次数+1,重新写回到文件,用Proerties的Store()方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fileWriter = new FileWriter("C:\\Users\\v_wboli\\IdeaProjects\\JavaStudy\\game.txt");
            prop.store(fileWriter,null);
            fileWriter.close();

        }
    }
}
