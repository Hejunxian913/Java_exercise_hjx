package basic;

import java.util.Scanner;

public class Reverse_Output_9_2 {

  public static void main(String[] args) {
    //数组的长度为10
    int[] array = new int[10];

    System.out.print("输入10个整数:");

    //填充数组
    fill(array);

    // 逆序输出数组中的内容
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  //填充数组程序
  public static void fill(int[] array) {
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }
  }
}


