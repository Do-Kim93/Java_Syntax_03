package org.example;

public class Main {
    public static void main(String[] args) {
        사람 사람1 = new 사람("김철수");
//        사람1.이름 = "김철수";
//        사람1.나이 = 22;
//        사람1.나이를_22로_설정();
        System.out.println("==사람1 정보==");
        System.out.printf("이름 : %s\n", 사람1.이름);
        System.out.printf("나이 : %d\n", 사람1.나이);
        사람 사람2 = new 사람();
        사람2.이름 = "이영희";
//        사람2.나이 = 22;
//        사람2.나이를_22로_설정();
        System.out.println("==사람1 정보==");
        System.out.printf("이름 : %s\n", 사람2.이름);
        System.out.printf("나이 : %d\n", 사람2.나이);
        사람 사람3 = new 사람();
    }
}
class 사람 {
    String 이름;
    int 나이;

//    void 나이를_22로_설정(){
//        this.나이 = 22;
//    }
    사람() {//사람이라고 쓴이유는 생성자이름은 클래스명이랑 동일해야함
        System.out.println("매개변수 0");
        this.나이 = 22;
    }
    사람(String 이름) {//사람이라고 쓴이유는 생성자이름은 클래스명이랑 동일해야함
        System.out.println("매개변수 1");
        this.이름 = 이름;
    }
}