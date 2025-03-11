package org.example;

import java.util.Scanner;
// 표준 입력장치로 숫자를 입력받아 합을 구하는 함수 만들기
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a = sc.nextInt();
        System.out.println(sum.sum1(a));
        System.out.println("숫자를 입력하세요");
        int b = sc.nextInt();
        System.out.println("숫자를 입력하세요");
        int c = sc.nextInt();
        System.out.println(sum.sum2(b, c));

    }
}

//        문제 - 1부터 n까지의 합을 반환하는 함수
class sum {

    static int sum1(int i) {
        int sum = 0;
        for (int a = 1; a <= i; a++) {
            sum += a;
        }
        System.out.println("1부터" + i + "까지 더한 합은");
        return sum;
    }

    //        문제 - n부터 m까지의 합을 반환하는 함수
    static int sum2(int b, int i) {
        int sum = 0;
        if (b > i) {
            for (int l = b; i <= l; i++) {
                sum += i;
            }
        } else {
            for (int l = i; b <= l; b++) {
                sum += b;
            }
        }
        System.out.println("1부터" + i + "까지 더한 합은");
        return sum;
    }
}