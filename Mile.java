package basic;

public class Mile {

  public static void main(String[] args) {

    //千米和英里的转换比
    float beilv = (float) 1.609;
    System.out.println("千米           英里");
    //输出5千米以内的转换的值
    for (int kilometer = 0; kilometer < 5; kilometer++) {
      float mile = kilometer * beilv;
      System.out.printf("%-13d%-10.3f%n", kilometer, mile);

      System.out.println("test");

    }
  }

}
