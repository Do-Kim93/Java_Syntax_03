package org.example;
// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
//        //---문제1번 구구단 8단 출력. 반복문 사용금지---
        System.out.println("문제 1번");
        System.out.println("Hello world!");
        System.out.println("8 * 1 = " + 8*1);
        System.out.println("8 * 2 = " + 8*2);
        System.out.println("8 * 3 = " + 8*3);
        System.out.println("8 * 4 = " + 8*4);
        System.out.println("8 * 5 = " + 8*5);
        System.out.println("8 * 6 = " + 8*6);
        System.out.println("8 * 7 = 56");
        System.out.println("8 * 8 = 64");
        System.out.println("8 * 9 = 72");

        //---문제2번----
        // 문제 : dan 변수의 값에 따라 첫번째로 곱하는 수가 변하게 해주세요.
        System.out.println("문제 2번");
        int dan = 2;
        System.out.println("5 * 1 = 8");
        System.out.println("5 * 2 = 16");
        System.out.println("5 * 3 = 24");
        System.out.println("5 * 4 = 32");
        System.out.println("5 * 5 = 40");
        System.out.println("5 * 6 = 48");
        System.out.println("5 * 7 = 56");
        System.out.println("5 * 8 = 64");
        System.out.println("5 * 9 = 72");
        System.out.println(dan + " * 1 = 8");
        System.out.println(dan + " * 2 = 16");
        System.out.println(dan + " * 3 = 24");
        System.out.println(dan + " * 4 = 32");
        System.out.println(dan + " * 5 = 40");
        System.out.println(dan + " * 6 = 48");
        System.out.println(dan + " * 7 = 56");
        System.out.println(dan + " * 8 = 64");
        System.out.println(dan + " * 9 = 72");
        //---문제3번----
        // 문제 : dan 변수의 값에 따라 그에 해당하는 구구단이 출력 되도록 해주세요.
        System.out.println("문제 3번");
        System.out.println(dan + " * 1 = " + dan*1);
        System.out.println(dan + " * 2 = " + dan*2);
        System.out.println(dan + " * 3 = " + dan*3);
        System.out.println(dan + " * 4 = " + dan*4);
        System.out.println(dan + " * 5 = " + dan*5);
        System.out.println(dan + " * 6 = " + dan*6);
        System.out.println(dan + " * 7 = " + dan*7);
        System.out.println(dan + " * 8 = " + dan*8);
        System.out.println(dan + " * 9 = " + dan*9);
        //---문제4번---
        // 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
        System.out.println("문제 4번");
        System.out.println("5 * 1 = 8");
        System.out.println("5 * 2 = 16");
        System.out.println("5 * 3 = 24");
        System.out.println("5 * 4 = 32");
        System.out.println("5 * 5 = 40");
        System.out.println("5 * 6 = 48");
        System.out.println("5 * 7 = 56");
        System.out.println("5 * 8 = 64");
        System.out.println("5 * 9 = 72");
        System.out.println(dan + " * 1 = " + dan*1);
        System.out.println(dan + " * 2 = " + dan*2);
        System.out.println(dan + " * 3 = " + dan*3);
        System.out.println(dan + " * 4 = " + dan*4);
        System.out.println(dan + " * 5 = " + dan*5);
        System.out.println(dan + " * 6 = " + dan*6);
        System.out.println(dan + " * 7 = " + dan*7);
        System.out.println(dan + " * 8 = " + dan*8);
        System.out.println(dan + " * 9 = " + dan*9);

        // 수정가능지역 시작
        int i = 1;
        System.out.println("수정");

        System.out.println(dan + " * " + i + " = " + dan * 1);
        System.out.println(dan + " * " + ++i +  " = " + dan * 2);
        System.out.println(dan + " * " + ++i +  " = " + dan * 3);
        System.out.println(dan + " * " + ++i +  " = " + dan * 4);
        System.out.println(dan + " * " + ++i +  " = " + dan * 5);
        System.out.println(dan + " * " + ++i +  " = " + dan * 6);
        System.out.println(dan + " * " + ++i +  " = " + dan * 7);
        System.out.println(dan + " * " + ++i +  " = " + dan * 8);
        System.out.println(dan + " * " + ++i +  " = " + dan * 9);
        // 수정가능지역 끝

    }
}