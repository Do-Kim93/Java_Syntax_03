package org.example;
// 문제 : 아래가 실행되도록 해주세요.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //대기,숫자를 입력할 때까지
        int a = 0;

        while (true){
            System.out.println("숫자 : ");
            try {
                a = sc.nextInt();//nextInt()정수형만 입력가능
                sc.nextLine();//이거 없으면 잘못된 값을 넣었을때 문한 루프에 빠진다.
                break;
            }catch (InputMismatchException e){
                sc.nextLine();//저장 해놓은 버퍼(어떠한 값이 전달되면서 사용한 공간)를 비운다는 뜻이다
                System.out.println("숫자 똑바로 써");
            }
        }


        System.out.printf("입력된 숫자 %d\n", a);

        sc.close();
    }
}

