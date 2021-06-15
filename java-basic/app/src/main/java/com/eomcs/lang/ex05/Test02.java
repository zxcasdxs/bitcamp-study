package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 II
//
public class Test02 {
  public static void main(String[] args) {
  
    // 비트 연산자 사용 후
    // => 4바이트 변수 한 개만 있으면
    //    최대 32개의 데이터를 저장할 수 있다.
    // 어떻게?
    int lang2 = 0;
    // 00000000 00000000 00000000 00000000

    // 32비트에서 뒤에 8비트를 사용하여 8개의 true/false 값을 저장할 수 있다.
    // 8 비트에서 각 언어에 값을 저장할 비트를 다음과 같다고 가정하자.
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c

    final int LANG_C      = 0b10000000;
    final int LANG_CPP    = 0b01000000;
    final int LANG_JAVA   = 0b00100000;
    final int LANG_JS     = 0b00010000;
    final int LANG_PYTHON = 0b00001000;
    final int LANG_PHP    = 0b00000100;
    final int LANG_HTML   = 0b00000010;
    final int LANG_CSS    = 0b00000001;
    
    // lang2 |= LANG_C;
    // lang2 |= LANG_JAVA; 
    // lang2 |= LANG_PYTHON; 
    // lang2 |= LANG_HTML; 

    lang2 = LANG_C | LANG_JAVA | LANG_PYTHON | LANG_HTML;

    lang2 = lang2 - LANG_JAVA; // 빼기
    
    System.out.println(Integer.toBinaryString(lang2));
    //0460번 예제 테스트
  }
}
