package org.example;

import java.util.Scanner;

//리턴 값이 있는 매서드
class Main {

    static int a = 20; //전역변수

    public static void main(String[] args) {
//        System.out.println(a);

        int a = 30; //지역변수
        System.out.println(계산기.합(10, 20));//이코드를 실행하면 합 매서드의 출력문이 출력되고 리턴 값으로 30을 가져와서 다시 한번 30이 출력돼 총 2번이 출력된다.
        System.out.println("===================================");
        계산기.합(20, 20);//이코드를 실행하면 합 매서드의 출력문이 출력되고 리턴 값으로 40을 가져오지만 출력문이 없어 총 한번만 출력된다.

    }
}

class 계산기 {
    int a = 50;
    static int 합(int a, int b) {// void가 없으면 어떠한 타입이든 리턴 값이 있어야한다.
//        int a = 50;
        System.out.println(a + b);

        return a+b;
    }
}