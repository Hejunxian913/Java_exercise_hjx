package basic;

import java.util.Scanner;

public class ZuiGaoFen {

  public static void main(String[] args) {
    System.out.println("输入学生个数：");
    Scanner student = new Scanner(System.in);
    int input = student.nextInt();

    int score, highscore = 0;
    String name = "", highname = "";
    for (int i = 0; i < input; i++) {
      System.out.println("输入学生名字");
      name = student.next();
      System.out.println("该学生分数");
      score = student.nextInt();

      if (score > highscore) {
        highscore = score;
        highname = name;
      }
      
    }
    System.out.println("最高分为" + highname + highscore);
  }

}
