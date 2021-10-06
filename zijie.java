package basic;

import sun.text.normalizer.UCharacter;

public class zijie {

  public static void main(String[] args) {
    char c1='\u4E2d';
    System.out.println(c1);
    char[] c2= Character.toChars(0x10000);//扩充65536以上的编码
    System.out.println(c2);
  }

}
