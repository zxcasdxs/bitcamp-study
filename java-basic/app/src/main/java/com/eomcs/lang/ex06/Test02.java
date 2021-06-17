package com.eomcs.lang.ex06;



class Number{
  static int num = 0;
  int num2 = 0;
}

public class Test02 {

  public static void main(String[] args) {


    Number num1 = new Number();
    Number num2 = new Number();

    num1.num++;
    num1.num2++;
    System.out.println(num2.num);
    System.out.println(num2.num2);
  }

}
