package basic;

import java.util.Scanner;

public class Tongji {

  public static void main(String[] args) {
    System.out.println("请选择生成随机数的数量");

    Scanner input = new Scanner(System.in);//键盘输入随机数的个数
    int number = input.nextInt();

    double[] randomList = new double[number];//转化随机数为浮点数

    for (int i = 0; i < randomList.length; i++) {
      int x = (int) (1 + Math.random() * 2);//x范围1-2
      randomList[i] = Math.random() * 100 * ((x == 1) ? 1 : -1);//生成一半的负数
    }

    int positiveCount = 0;
    int negativeCount = 0;
    double sum = 0;

    for (int i = 0; i < randomList.length; i++) {
      if (randomList[i] < 0) {
        negativeCount++;//统计负数个数
      } else if (randomList[i] > 0) {
        positiveCount++;//统计正数个数
      }

      sum += randomList[i];//求和
    }

    double average = sum / randomList.length;//取平均数

    System.out.println("你选择生成" + number + "个随机数。");
    System.out.println("其中有" + positiveCount + "个正数，以及" + negativeCount + "个正数。");
    System.out.println("它们的合为" + sum + "，平均数为" + average);

  }

}
