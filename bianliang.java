package basic;

import java.util.Scanner;

public class bianliang {

  //数值计算
  public static void main(String[] args) {
    int a = 5, b = 6;

    int sum = a + b;
    System.out.println("sum" + sum);

    int dis = a - b;
    System.out.println("dis" + dis);

    int mul = a * b;
    System.out.println("mul" + mul);

    int div = a / b;
    System.out.println("div" + div);
    System.out.println((double) 5 % 3);
//声明常量赋值
    final double pi = 3.14;
    System.out.println(pi);
//键盘输入值
    Scanner input = new Scanner(System.in);
    byte byteValue = input.nextByte();
    System.out.println("jiayou" + byteValue);

  }

}
