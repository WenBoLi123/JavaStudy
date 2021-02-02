package Exception;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int Score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.checkScore(Score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
