package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0110 {

  static int p() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();
  }


  static void printSpace() {
    int count = 1;
    while (count <= len) {
      // 별 앞에 공백 출력
      int spaceCnt = 1;
      int spaceLen = (len - count) / 2;
      while (spaceCnt <= spaceLen) {
        System.out.print(" ");
        spaceCnt++;
      }

      static void printStar() {
        // 별 출력
        int starCnt = 1;
        while (starCnt <= count) {
          System.out.print("*");
          starCnt++;


          // 출력 줄 바꾸기
          System.out.println();
          count += 2;

        }
      }

      public static void main(String[] args) {
        int len = p();




      }
    }
  }
}
