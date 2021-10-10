package basic;

public class Shengming {

  public static void main(String[] args) {

    double b = 2;
    float f = 2;
    long l = 2;

    int x = 1, y = 2, z = 3;//定义变量并赋值
    System.out.println((x + y) * z);//输出变量

    int i = 1, j = 10;//定义变量i.j
    System.out.println(i++ * ++j);//测试前++、后++的功能
    System.out.println(i);//输出i后++的值
    System.out.println(j);//输出j前++的值

    int q=3/(int)1.0;//显示转型
    double w=2.0/1;//自动转型
  }

}


