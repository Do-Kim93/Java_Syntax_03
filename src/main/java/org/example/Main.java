package org.example;
//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//정수형 변수 a 에 스캐너의 nextInt() 매서드 리턴값을 저장 당연히 int형으로 나옴
        int b = sc.nextInt();//정수형 변수 b 에 스캐너의 nextInt() 매서드 리턴값을 저장 당연히 int형으로 나옴
        int c = sc.nextInt();//정수형 변수 c 에 스캐너의 nextInt() 매서드 리턴값을 저장 당연히 int형으로 나옴
        System.out.println((a+b)%c); // a에 있는 값과 b에 있는 값을 더하고 c에있는 값으로 나눴을때의 나머지를 출력하라
        System.out.println(((a%c)+(b%c))%c);//a값을 c값으로 나눴을때나머지와 b값을c값으로 나눴을때의 나머지를 먼저 더하고 그 값을 c값으로 다시 나눠을때의 나머지를 출력하라
        System.out.println((a*b)%c);// 첫번째 출력문과 다른점은 사칙연산만 다름
        System.out.println(((a%c)*(b%c))%c);// 위와 동일
    }
}
