package basic;

import java.util.Scanner;

public class Exercise_9_4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //输入5个数
    double[] values = new double[5];
    System.out.println("输入5个数");
    for (int i = 0; i < values.length; i++) {
      values[i] = input.nextDouble();
    }

    // 输出平均数
    System.out.println("平均数为 : " + average(values));
  }

  //使用重载方法计算整型数组平均数
  public static int average(int[] array) {
    int average = 0;
    for (int i : array) {
      average += i;
    }
    return average / array.length;
  }
  //使用重载方法计算浮点型数组平均数
  public static double average(double[] array) {
    double average = 0;
    for (double i : array) {
      average += i;
    }
    return average / array.length;
  }
}
