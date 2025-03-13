package org.example;
// 문제 : 아래가 실행되도록 해주세요.

class code {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.이름 = "철수";
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
    void 공격()   {
        a무기.공격자명 =this.이름;//인자값 전달이 아닌 저장해놓고 쓰는방식
        a무기.작동();
    }
}

class 무기 {
    String 공격자명;// 인자값 전달이 아닌 저장해놓고 쓰는방식

    void 작동(){

    };//오버라이딩을 위해서 필요함 없으면 작동 불가
}

class 칼 extends 무기 {
    void 작동() {
        System.out.println(공격자명 + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 작동() {
        System.out.println(공격자명 + "가 활로 공격합니다.");
    }

}


//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격("활");
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격("칼");
//        // 출력 : 카니가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//
//    void 공격(String i) {
//        System.out.println("카니가 " +i+ "로 공격합니다");
//    }
//}
//
//class 무기 {
//
//}
//
//class 칼 extends 무기 {
//
//}
//
//class 활 extends 무기 {
//
//}

//public class code {
//// 문제 : 아래가 실행되도록 해주세요.
//
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();
//    }
//}
//class 전사{
//    int 나이;
//    Object a무기;
//
//}
//class 활{
//
//}
//class 칼{
//
//}