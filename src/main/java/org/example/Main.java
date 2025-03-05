package org.example;
// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
//        1번문제 1부터 5까지 출력해주세요
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        //2번문제 -100부터 25까지 출력해주세요
        int j = -100;

        while (j <= 25) {
            System.out.println(j);
            j++;
        }
        //구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.
        int dan = 8;
        int k = 1000;

        while (k >= 1){
            System.out.println(dan + " * " + k + " = " + dan*k);
            k--;
        }
//        구구단 8단을 출력해주세요. 1000부터 -500까지 곱해주세요.
        int dan2 = 8;
        int h = 1000;

        while (h >= -500){
            System.out.println(dan2 + " * " + h + " = " + dan2*h);
            h--;
        }
//         1부터 5까지의 합을 출력해주세요.
        int a=1;
        int sum=0;
        while (a<=5){
            sum += a;
            a++;
        }
        System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);
//        -100부터 25까지의 합을 출력해주세요.
        int s = -100;
        int sum1 = 0;
        while (s <= 25) {
            sum1 += s;
            s++;
        }
        System.out.println("-100부터 25까지의 합 " + sum1);
    //1부터 3까지 출력하는 작업을 10번 해주세요. 2중 while문 사용
    int m = 1;
    int n = 1;
    while (m <= 10){
        while (n <= 3) {
            System.out.println(n);
            n++;
        }
        n = 1;/* 첫 반복후 n값은 4로 증가 되어 있다.
         고로 첫번째 반복이 끝난 시점에서 다시 1로 초기화 하지 않으면
         두번째 반복문은 첫 한번 밖에 실행 하지않음
         */
        m++;
    }
    }
}