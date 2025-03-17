package org.example;
// 문제 : 아래가 실행되도록 해주세요.

import java.util.Scanner;
//7번 문제
//준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
// 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때,
// 놀람을 표현하는 프로그램을 작성하시오.
class Main {
    public static void main(String[] args) {
        String id = "joonas";//문자열 변수 id에 값 "joonas"를 저장 정확히는 변수명은 스택에 저장되고 값은 힙에 저장됨 이미 등록된 아이디 역활
        Scanner sc = new Scanner(System.in);//스캐너 sc에 Scanner이라는 객체의 리모컨을 넘김 스캐너 사용할수 있게하는 역활
        String newid = sc.next();//문자열 변수 newid에 sc.next()라는 메서드 리턴 값을 전달 새로 가입할 아이디 적는 역활
        if (id.equals(newid)) {//만약 newid와enwid가 같은지 검사
            System.out.println(newid + "??!");//위의 검사결과가 참이면 문자열 newid에 ??!를 추가해서 출력
        }
    }
}
//
//우선 입력받는 값을 사용하기위해 Scanner sc에 Scanner라는 클래스명을 가지고 매개변수를 하나가지는 Scanner을 new로 선언
// 문자열 모양의 변수 newid에 스캐너클래스 안에있는 next()라는 메서드의 리턴값을 저장
// 조건문 안의 조건 기존에 만들어 놓은 id "joonas"와 새로 입력 받는 아이디 값을 비교하기위한 조건 왜 ==을 쓰지않는가?
// 우리는 문자열 변수 id 가 가지는 문자열 과 새로 입력받을 문자열 newid가 가지는 문자열 값 을 비교해야하는데 ==를 쓰면 주소값을 비교함
// 그래서 equals를 사용해 그 주소 안에 있는 값을 꺼내서 비교함(참조형변수 또한 객체라고 볼수있음)
// 조건식 안의 조건이 참이면 newid변수 안의 값에 문자열 ??!를 이어붙여서 출력함 거짓이면 그냥 끝남 왜냐면 거짓일때 해야할 행동을 만들어주지 않아서