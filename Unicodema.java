package basic;

import java.util.Scanner;

public class Unicodema {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String ma = input.nextLine();
    char c = ma.charAt(0);

    System.out.println((int) c);
  }

}
