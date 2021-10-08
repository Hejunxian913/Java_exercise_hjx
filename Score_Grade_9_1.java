package basic;

import java.util.Scanner;

public class Score_Grade_9_1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //输入学生个数
    System.out.println("输入学生个数");

    int[] scores = new int[input.nextInt()];
    char[] grades = new char[scores.length];

    //输入分数
    System.out.println("输入" + scores.length + "位学生的分数");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
    }

    //显示学生的分数和等级
    getGrades(scores, grades);
    for (int i = 0; i < scores.length; i++) {
      System.out.println("学生" + i + "的分数为" + scores[i] + "，等级为" + grades[i]);

    }
  }

  //输出成绩最高的学生
  public static int max(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  //判定等级
  public static void getGrades(int[] scores, char[] grades) {
    int best = max(scores);
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= best - 10) {
        grades[i] = 'A';
      } else if (scores[i] >= best - 20) {
        grades[i] = 'B';
      } else if (scores[i] >= best - 30) {
        grades[i] = 'C';
      } else if (scores[i] >= best - 40) {
        grades[i] = 'D';
      } else {
        grades[i] = 'F';
      }
    }
  }
}

