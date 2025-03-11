package org.example;

// Main 클래스 안의 내용을 올바르게 수정해주세요.

class Main {
    public static void main(String[] args) {
//        int 자동차 = new 자동차; 틀린구문 틀린이유 타입도 맞지않고 ()도 없음
        자동차 붕붕이 = new 자동차();
//        자동차.달립니다(); 틀린이유 매서드명도 다르고 자동차 class에 있는 메서드는 스태틱이 아니라서 객체 생성없이는 호출 불가능 해결 방벙 2개 있음
        //1번 해결방법
        붕붕이.달리다();
        //2번 해결방법
        자동차.달립니다();
    }
}

class 자동차 {
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
    //스태틱 매서드로 선언하면 객체 생성없이 클래스명으로 접근이 가능해져서 별도의 객체 생성없이 사용가능
    static void 달립니다() {
        System.out.println("자동차가 달립니다.1");
    }
}