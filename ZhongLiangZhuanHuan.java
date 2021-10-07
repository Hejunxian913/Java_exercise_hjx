package basic;

public class ZhongLiangZhuanHuan {

  public static void main(String[] args) {

    //1千克=2.2英镑
    final double beilv = 2.2;

    //输出200以内英镑千克互相转换的值
    System.out.println("千克             英镑     |    英镑              千克");
    for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
      System.out.printf("%-12d%7.1f", k, (k * beilv));
      System.out.print("     |     ");
      System.out.printf("%-9d%12.2f\n", p, (p / beilv));
    }
  }
}
