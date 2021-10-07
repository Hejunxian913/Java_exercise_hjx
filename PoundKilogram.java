package basic;

import java.util.Scanner;

public class PoundKilogram {

  public static void main(String[] args) {

    //输入转换的千克的值
    System.out.println("请输入千克");
    Scanner input = new Scanner(System.in);

    double k = input.nextDouble();
    //计算对应的英镑值
    double p = (2.2 * k);
    //输出
    System.out.println(k+"千克为"+p+"磅。");
    /*System.out.println("千克              磅");
    for (int i = 1; i <= 199; i += 2) {
      double pounds = (double) i * 2.2;
      System.out.printf("%-4s          %5.1f%n", Integer.toString(i), pounds);*/
    }

  }
