package basic;

import java.util.Scanner;

public class Xuefei {

  public static void main(String[] args) {

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    double xuefei = input1.nextDouble();
    int nianfen = input2.nextInt();
    double lilv = input3.nextDouble();

    while (nianfen > 0) {

      xuefei = xuefei * lilv;
      nianfen--;
    }
    System.out.printf("%6.2f",xuefei);

  }

}
