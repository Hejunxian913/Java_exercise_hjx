package basic;

import java.util.Scanner;

public class Xuefei {

  public static void main(String[] args) {

    //输入第一年学费、年数以及利率
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    double xuefei = input1.nextDouble();
    int nianfen = input2.nextInt();
    double lilv = input3.nextDouble();

    //计算最后一年利率
    while (nianfen > 0) {
      xuefei = xuefei * lilv;
      nianfen--;
    }
    System.out.printf("%6.2f",xuefei);

  }

}
