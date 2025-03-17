package org.example;

import java.util.Scanner;

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){//b가 a보다 크냐?? 조건식
            System.out.println("<");//< 출력
        } else if (a > b) {//a가 b보다 크냐?? 조건식
            System.out.println(">");//> 출력
        } else {//위의 조건식에 안들어가면 다여기로와
            System.out.println("==");//==출력
        }
    }
}
//비교연산자를 이용한 조건식 a가 b보다 작으면 <를 출력하고
//a가 b보다 크면 >를 둘다 아니다 그러면 ==를 출력하게 한다.