package basic;

import java.util.Scanner;

public class PoundKilogram {

  public static void main(String[] args) {

    System.out.println("请输入千克");
    Scanner input = new Scanner(System.in);

    double k = input.nextDouble();

    double p = (2.2 * k);

    System.out.println(k+"千克为"+p+"磅。");
    /*System.out.println("千克              磅");
    for (int i = 1; i <= 199; i += 2) {
      double pounds = (double) i * 2.2;
      System.out.printf("%-4s          %5.1f%n", Integer.toString(i), pounds);*/
    }

  }
