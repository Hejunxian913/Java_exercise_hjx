package basic;

import java.util.Scanner;

public class ZuiGaoFen {

  public static void main(String[] args) {

    //输入学生个数
    System.out.println("输入学生个数：");
    Scanner student = new Scanner(System.in);
    int input = student.nextInt();

    //输入学生名字以及分数
    int score, highscore = 0;
    String name , highname = "";
    for (int i = 0; i < input; i++) {
      System.out.println("输入学生名字");
      name = student.next();
      System.out.println("该学生分数");
      score = student.nextInt();
      //比较出分数最高的学生
      if (score > highscore) {
        highscore = score;
        highname = name;
      }

    }
    System.out.println("最高分为" + highname + highscore);
  }

}
