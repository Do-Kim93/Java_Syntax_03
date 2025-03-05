package org.example;
// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
        int i =1; //1.번 재료 만들기
        //while 반복문
        while (i <= 10) {//2번 조건넣기
            System.out.println(i); // 필요한거 넣기
            i++; // 증감연산자로 무한반복 안되게 하기
        }

        System.out.println("i : " + i);

        int j = 10;
        //while 반복문
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        System.out.println("j : " + j);
    }
}