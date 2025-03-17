package org.example;

import java.util.Scanner;
//"45분 일찍 알람 설정하기"이다.
//첫째 줄에 두 정수 H와 M이 주어진다.
// (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다.
// 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
// 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//0시 45분을 입력하면 24시 00분이 출력 되어야한다
//45분 미만의 숫자로 알람을 하면 시간에서 1을 빼야함
//시간의 표시는 24로 제한 되어있다 0시 30분을 입력하면
//23시 45분이라고 출력 되어야한다.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(0<=h&&h<=23&&0<=m&&m<=59) {
            if(m >= 45) {
                System.out.printf("%d %d", h, m-45);
            }else if(h-1 < 0) {
                System.out.printf("%d %d",h+23, m+15);
            }else if(m <= 45) {
                System.out.printf("%d %d",h-1, m+15);
            }
            sc.close();
        }
    }
}