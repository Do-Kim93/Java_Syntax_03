package org.example;

import java.util.Scanner;

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90){//a가 90이상임???
            System.out.println("A");//A 출력
        } else if (a>=80) {//a가 80이상임????
            System.out.println("B");//B 출력
        } else if(a>=70){//a가 70이상임????
            System.out.println("C");//C 출력
        } else if(a>=60){//a가 60이상임????
            System.out.println("D");//D 출력
        }else {//위에서 아무것도 안걸린거 다 여기로
            System.out.println("F");//F 출력
        }
    }
}
// else if와 그냥 if의 차이점은 그냥 if로 만들면 90이상의 숫자를 넣으면
// else 빼고 다 출력된다. 임의의 숫자 95를 넣었다고 생각해보자.
// 그러면 95는 90이상이니까 첫번째 걸리고 80이상이니까 두번째 걸리고 이런식으로
// A부터 D까지 다출력된다. else문에는 들어가지 않는다.
// 근데 else if 문은 만약 저 위의 조건식중 하나라도 참이어서 들어갔다면
// 그밑의 조건문은 실행 하지 않는다. 그래서 else if 문을 사용한 것이다.