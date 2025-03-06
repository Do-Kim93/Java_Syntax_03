package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //코드업 1023문제 문자열로 받아서 자르면 간단하지만 문제 요구사항 만족이 안됨
        //테스트 케이스 있는 실수를 float으로 받으면 제대로 값이 안들어옴
        //double를 사용해서 풀면 가능함
        Scanner sc = new Scanner(System.in);
        Double a;
        a = sc.nextDouble();
//        System.out.printf("%.5f",a);// 애초에 입력값을 제대로 가져오지 못함
        String s = Double.toString(a);
        String[] b = s.split("\\.");
        System.out.print(b[0]+"\n"+b[1]);
    }
}
