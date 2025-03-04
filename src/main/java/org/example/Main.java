package org.example;

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main {
    public static void main(String[] args) {
        int age = 65; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        //-----------방법1--------------
        if (age <= 19 || age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
        //-----------방법2--------------

        if (age > 0 && age <= 19 || age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
//        -----------방법3--------------
        if (age < 20) {
            System.out.println("할인대상입니다.");
        } else if (age > 59) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
//        -----------방법4--------------
        if (age < 20) {
            System.out.println("할인대상입니다.");
        } else if (age < 30) {
            System.out.println("할인 대상이 아닙니다.");
        } else if (age < 40) {
            System.out.println("할인 대상이 아닙니다.");
        } else if (age < 50) {
            System.out.println("할인 대상이 아닙니다.");
        } else if (age < 60) {
            System.out.println("할인 대상이 아닙니다.");
        } else {
            System.out.println("할인대상입니다.");
        }

    }
}

