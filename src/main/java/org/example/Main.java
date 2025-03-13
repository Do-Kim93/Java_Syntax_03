package org.example;

public class Main {
    public static void main(String[] args) {
        사람 사람1 = new 김철수("김철수2");
//        사람1.이름 = "김철수";
        System.out.println("==사람1 정보==");
        System.out.printf("이름 : %s\n", 사람1.이름);
        System.out.printf("나이 : %d\n", 사람1.나이);
        사람 사람2 = new 사람();
        사람2.이름 = "이영희";
        System.out.println("==사람1 정보==");
        System.out.printf("이름 : %s\n", 사람2.이름);
        System.out.printf("나이 : %d\n", 사람2.나이);

        전사 전사 = new 전사();
    }
}
class 전사{

}

class 사람 {
    String 이름;
    int 나이;

    사람() {//사람이라고 쓴이유는 생성자이름은 클래스명이랑 동일해야함
        System.out.println("사람 생성자 실행됨");
        this.나이 = 22;
    }
}

class 김철수 extends 사람 {//상속받은 클래스의 생성자를 생성하면 부모클래스의 생성자도 자동으로 생성된다.

    김철수() {
        System.out.println("김철수 생성자 실행됨");
        this.이름 = "김철수";
    }

    김철수(String 이름) {
        System.out.println("김철수2 생성자 실행됨");
        this.이름 = 이름;
    }
}