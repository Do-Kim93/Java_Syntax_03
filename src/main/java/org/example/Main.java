package org.example;

import java.util.Scanner;

//
class Main {
    public static void main(String[] args) {
        계산기.합(10, 20);
        계산기.합(20, 50);
        계산기2 a = new 계산기2();
        a.합(1,2);
    }
}

class 계산기 {
    static void 합(int a, int b) {//이럼 모양을 매개변수가 있는 메서드라고 한다.()안에 있는 데이터를 인자라고 한다.
        System.out.println(a + b);
    }

}
class 계산기2 {
    void 합(int a, int b) {
        System.out.println(a + b);
    }

}