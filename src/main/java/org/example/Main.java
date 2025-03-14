package org.example;


import java.util.ArrayList;
import java.util.List;
//Exception e 예외처리 클래스중 가장 상위인 부모 클래스임 그래서 어떤오류가 발생할지 확실 모르면 이거를 catch문의 인자 값에 넣으면 됨
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 10;
            b = 0;
            c = a / b; // 10 나누기 0 → 산술오류 ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("c = -1");  // 예외가 발생하여 이 문장이 수행된다.
        }
    }
}