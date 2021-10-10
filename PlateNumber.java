package basic;

import java.util.Scanner;

public class PlateNumber {

  public static void main(String[] args) {

    //随机生成四位数
    int number = (int) (Math.random() * 10000);
    String zimu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int zimunumber1 = (int) (Math.random() * 26);
    int zimunumber2 = (int) (Math.random() * 26);
    int zimunumber3 = (int) (Math.random() * 26);

    //随机抽取3个字母
    char zimu1 = zimu.charAt(zimunumber1);
    char zimu2 = zimu.charAt(zimunumber2);
    char zimu3 = zimu.charAt(zimunumber3);

    String plate = (zimu1 + "  " + zimu2 + "  " + zimu3 + "  " + number);

    System.out.println(plate);

  }
}