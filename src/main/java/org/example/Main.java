package org.example;

import org.w3c.dom.ls.LSOutput;

//글자 주황색은 예약어, 키워드
class Main {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓1");
        }

        if ( a > 10 ) {
            System.out.println("거짓2");
        }

        if ( a >= 10 ) {
            System.out.println("참2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓3");
        }

        if ( c == false ) {
            System.out.println("참4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓5");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {// and 연산자 임!
            System.out.println("거짓6");
        }

        if ( 10 != 10 || 10 < 2 ) {// or 연산자임!! && = and || = or 헷갈리지 말것!!!
            System.out.println("거짓7");
        }
    }
}

