
package basic;

import java.util.Scanner;

public class Out_Put_6789test {

  public static void main(String[] args) {

    //11 请输出如下字符串
    //my uncle's dog eats nothing \ . "what a strange dog"
    System.out.println("my my uncle's dog eats nothing \\ . \"what a strange dog\"");

    //12 有一个字符串"sdflskjdfw2234234l" 判断 字符大写A是否在该字符串中。
    //不区分大小写，比如字符串"abc"的话，大写B或者小写b都算在"abc"中
    String s1 = "sdflskjdfw2234234l";
    System.out.println(s1.contains("A"));

    //13 如何比较两个字符串 用== 可以判断吗，如果不能应该用什么方法，写出正确的比较方法
    String s2 = "sadkjaskd";
    //方法1，不为0则不相等
    System.out.println(s1.compareTo(s2));
    //方法2
    System.out.println(s1.equals(s2));

    //14 已知字符串"abcd...xyz"，26个字母都包括的一个字符串，键盘输入2个字符，比如第一次输入e ，第二次如数 m，
    //那么请返回 "fghijkl"这样的一个字符串，也就是 2个字母之前的字符串
    String s3 = "abcdefghijklmnopqrstuvwxyz";

    //从键盘中输入两个字母
    Scanner input = new Scanner(System.in);
    System.out.println("输入两个字母");
    String input1 = input.next();
    String input2 = input.next();
    //截取输入字母中间的字母
    System.out.println(
        "输入的两个字母中间的字母为\n" + s3.substring((s3.indexOf(input1) + 1), s3.indexOf(input2)));

    //15 转换数字类型123到字符类型， 转换字符类型"234"到数字类型
    String s4 = "20211007";
    //将字符串转化为数字类型
    int intValue = Integer.parseInt(s4);
    System.out.println(intValue);
    //将字符类型转换为数字类型
    System.out.println(Double.parseDouble(s4));
  }

}

