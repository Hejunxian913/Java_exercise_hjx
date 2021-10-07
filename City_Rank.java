package basic;

import java.util.Scanner;

public class City_Rank {

  public static void main(String[] args) {

    //输入三个城市的名字
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    String city1 = input1.nextLine();
    String city2 = input2.nextLine();
    String city3 = input3.nextLine();

    //排列名称顺序
    String temp;
    if ((city1.compareTo(city2) > 0) && (city3.compareTo(city2) > 0)) {
      temp = city1;
      city1 = city2;
      city2 = temp;
    } else if ((city1.compareTo(city3) > 0) && (city3.compareTo(city2) > 0)) {
      temp = city1;
      city1 = city3;
      city3 = temp;
    }if (city2.compareTo(city3) > 0) {
      temp = city2;
      city2 = city3;
      city3 = temp;
    }
    System.out.println(city1 + "\t" + city2 + "\t" + city3);

  }

}
