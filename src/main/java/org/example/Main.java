package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a>b?a:b);
        //신기하게 경고가 떠서 눌러보니 Math.min이라는걸 사용하라고 한다
        // 써보니 입력받은 두수 중 작은 숫자를 출력해준다
        // 여기서 알수있는점은 min이 작은숫자니까 max는 큰숫자라를 출력해줄것이다.


    }
}


