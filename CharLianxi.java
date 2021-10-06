package basic;

public class CharLianxi {

  public static void main(String[] args) {
    String s1 = "Welcom";
    String s2 = "welcom";

    boolean isEqual = s1.equals(s2);//比较两个字符是否相等
    System.out.println(isEqual);

    boolean isEqual2 = s1.equalsIgnoreCase(s2);//忽略大小写比较字符是否相等
    System.out.println(isEqual2);

    int x1 = s1.compareTo(s2);
    System.out.println(x1);//比较大小将值赋给x1

    int x2 = s1.compareToIgnoreCase(s2);
    System.out.println(x2);//无视大小写比较大小将值赋给x2

    boolean b1 = s1.startsWith("We");
    System.out.println(b1);//检测是否含有前缀We

    boolean b2 = s2.endsWith("We");
    System.out.println(b2);//检测是否含有后缀We

    int x3 = s1.length();
    System.out.println(x3);//计算长度

    char x4 = s1.charAt(0);
    System.out.println(x4);//将第一个字符赋给x4

    String s3 = s1.concat(s2);
    System.out.println(s3);//连接字符串

    String s1zichuan = s1.substring(1);
    System.out.println(s1zichuan);//从1位开始截取

    String s114 = s1.substring(1, 4);
    System.out.println(s114);//截取1-4位

    String s4 = s1.toUpperCase();
    System.out.println(s4);//全大写

    String s5 = s1.toLowerCase();
    System.out.println(s5);//全小写

    String s6 = s1.trim();
    System.out.println(s6);//去空格

    int x5 = s1.indexOf("e");
    System.out.println(x5);//将第一次出现的e的下标赋值给x5

    int x6 = s1.lastIndexOf("com");
    System.out.println(x6);//将第一次出现的com下标赋给x6

  }

}
