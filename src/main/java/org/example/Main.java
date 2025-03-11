package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //1 자동차 클래스안의 달리다 메서드를 호출하기 위한 기본형
        자동차 a = new 자동차();
        a.달리다();
        //2 자동차 클래스안의 달리다 메서드를 호출하기 위한 기본형
        new 자동차().달리다();
        //3 자동차 클래스의 달리다 메서드가 스테틱 메서드로 선언되어 객체 생성없이도 호출이 가능하다.
        자동차.달리다();
//        System.out.println(서다(1,2));
    }
}

class 자동차 {
    //static으로 변수나 메서드를 선언하면 main 클래스가 실행될때 생성된다.
    static void 달리다() {
        System.out.println("달리다");
    }
}
//클래스 외부에서는 아무리 스테틱으로 선언한다 하더라도 호출이 불가능하다. 결과 아무리 스테틱을 쓴다 하여도 class 안에 선언되어야 사용이 가능하다.
//고로 스테틱은 클래스명을 찾아간다는걸 알수있음
//static int 서다(int x, int y) {
//   return (x+y);}

















//        MyClass a = new MyClass();
//        a.hi();//이 메서드를 호출 하기 위해서는 MyClass 객체를 생성해 메서드 호출을 해야함
//
//        new MyClass().hi();
//
//        funA();
//    }
//
//    static void funA(){
//        System.out.println("실행1");
//    }
//}
//
//class MyClass{
//    void hi(){
//        System.out.println("실행2");
//    }
//}