package org.example;
// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
//        while문을 for 문으로 변환하기
//        문제 - 1부터 5까지 출력해주세요.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
//        문제 - -100부터 25까지 출력해주세요.
        for (int i = -100; i <= 25; i++) {
            System.out.println(i);
        }
//        문제 - 구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.
        for (int i = 1; i <= 9; i++) {
            int dan = 8;
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
//        문제 - 구구단 8단을 출력해주세요. 1000부터 -500까지 곱해주세요.
        for (int i = -500; i <= 1000; i++) {
            int dan = 8;
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
//        문제 - 1부터 5까지의 합을 출력해주세요.
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println(sum);
//        문제 - -100부터 25까지의 합을 출력해주세요.
        int sum1 = 0;
        for (int i = -100; i <= 25; i++){
            sum1 += i;
        }
        System.out.println(sum1);
//        문제 - 1부터 3까지 출력하는 작업을 10번 해주세요. 2중 for문 사용
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "번째 출력");
            for (int j =1; j<=3; j++){
                System.out.println(j);
            }
        }
    }
}