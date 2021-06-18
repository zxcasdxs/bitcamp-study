package com.eomcs.lang.ex07;

//# 메서드 : 레퍼런스 리턴
//
public class Exam0340 {

  // swap()에서 만든 int a와 int b의 값을 main() 에서 사용하기
  // primitive data type 값을 직접 넘기지 말고 
  // 객체에 담아 넘겨라!
  static class MyObject {
    int a;
    int b;
  }

  static MyObject swap(int a, int b) {
    MyObject ref = new MyObject();
    ref.a = b;
    ref.b = a;
    return ref;
  }

  public static void main(String[] args) {
    int a = 100;
    int b = 200;

    MyObject ref = swap(a, b);

    System.out.printf("main(): ref.a=%d, ref.b=%d\n", ref.a, ref.b);
  }
}
