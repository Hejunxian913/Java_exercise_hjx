package basic;

import java.util.Scanner;

public class Exercise_9_5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //设置一个5位数的数组
    double[] numbers = new double[5];

    // 输入5位数存入数组
    System.out.print("输入5个数: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }
    // 输出最小值
    System.out.println("最小值为: " + min(numbers));
  }

  //比较最小值
  public static double min(double[] array) {
    double min = array[0];
    for (double i : array) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }
}