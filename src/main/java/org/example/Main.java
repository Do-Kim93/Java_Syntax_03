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
    }
}

class 자동차 {
    //static으로 변수나 메서드를 선언하면 main 클래스가 실행될때 어디에 있든 생성된다.
    static void 달리다() {
        System.out.println("달리다");
    }
}


















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