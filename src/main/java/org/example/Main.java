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
            System.out.println("거짓4");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {// and 연산자 임!
            System.out.println("거짓5");
        }

        if ( 10 != 10 || 10 < 2 ) {// or 연산자임!! && = and || = or 헷갈리지 말것!!!
            System.out.println("거짓6");
        }
        int age = 9;

        if (age >= 1 && age <= 9) {
            System.out.println("유아/아동");
        }
        if (age >= 10 && age <= 19) {
            System.out.println("10대");
        }
        if (age >= 20 && age <= 29) {
            System.out.println("20대");
        }
        if (age >= 30 && age <= 39) {
            System.out.println("30대");
        }
        if (age >= 40) {
            System.out.println("40대 이상");
        }
//------------양립할수 없는 다중 if문 ------------------
        int ageone = 22;

        if (ageone >= 1 && ageone <= 9) {
            System.out.println("유아/아동");
        }
        else if (ageone >= 10 && ageone <= 19) {
            System.out.println("10대");
        }
        else if (ageone >= 20 && ageone <= 29) {
            System.out.println("20대");
        }
        else if (ageone >= 30 && ageone <= 39) {
            System.out.println("30대");
        }
        else {
            System.out.println("40대 이상");
        }
    }
}

