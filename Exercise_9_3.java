package basic;

import java.util.Scanner;

public class Exercise_9_3 {

  public static double Average(int[] array, double i) {

    //计算平均分
    int sum = 0;
    for (int j = 0; j < i; j++) {
      sum += array[j];
    }
    System.out.print("平均分为:");
    return (sum / i);
  }

  public static void main(String[] args) {

//输入任意个成绩
    Scanner input = new Scanner(System.in);
    System.out.println("输入学生成绩：");

//存放输入的成绩，若输入的值不处于1-100则结束输入
    int[] grade = new int[100];
    int i, j;
    for (i = 0; i < grade.length; i++) {
      grade[i] = input.nextInt();
      int temp = grade[i];
      if (temp > 0 && temp < 100) {
        grade[i] = temp;
      } else {
        break;
      }
    }
//统计大于平均数和小于平均数的个数
    int count1 = 0;
    int count2 = 0;
    if (i != 0) {
      double ave = Average(grade, i);
      System.out.println(ave);
      for (j = 0; j < i; j++) {
        if (grade[j] >= ave) {
          count1++;
        } else if (grade[j] < ave) {
          count2++;
        }
      }
    }
    System.out.println("大于平均数的有" + count1 + "个。");
    System.out.println("小于平均数的有" + count2 + "个。");
  }

}