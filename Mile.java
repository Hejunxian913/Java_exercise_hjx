package basic;

public class Mile {

  public static void main(String[] args) {
    float beilv = (float) 1.609;
    System.out.println("千米           英里");

    for (int kilometer = 0; kilometer < 5; kilometer++) {
      float mile = kilometer * beilv;
      System.out.printf("%-13d%-10.3f%n", kilometer, mile);

    }
  }

}
