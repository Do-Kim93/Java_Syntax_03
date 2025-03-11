package org.example;

import java.awt.*;
import java.util.Arrays;

        class Main {
            public static void main(String[] args) {
                String msg = greet("Jin"); //문자열 타입의 변수명 msg에 greet 메서드를 할당
                System.out.println(msg);// msg 출력

                Point point = createPoint(5, 10); //Point 타입의 변수명 point에 인자값이 5랑 10을 가지는 createPoint라는 매서드를 할당
                System.out.println("Point create at (" + point.x + ", " + point.y + ")");// 출력

                int[] evens = firstNEvenNumbers(5);//int타입의 배열 변수명 evens에 인자값 5를 가지는 firstNEvenNumbers라는 메서드를 할당
                System.out.println("first 5 even numbers : " + Arrays.toString(evens));//출력
            }

            public static String greet(String name) {//스태틱변수로 린턴값이 존재하고 문자열로 된 매개변수 1개를 가지는 매서드 greet 선언
                return "Hello, " + name + "!";//리턴값 "Hello, " + name(인자로 전달 받을거임) + "!" 를 반환함
            }

            public static Point createPoint(int x, int y) {// 스태틱변수로 린턴값이 존재하고 인트형 으로된 매개변수2개를 가지는 매서드 생성
                return new Point(x, y);// 받은 인자값으로 객체를 만들어서 리턴 여기서 객체로 재생성하는 이유는 return 값이 두개의 값을 할당 받을수 없어서
            }

            public static int[] firstNEvenNumbers(int n) {//스태틱변수로 린턴값이 존재하고 정수형 매개변수1개를 가지는 매서드 생성
                int[] evenNumbers = new int[n];// 받은 인자값으만큼 배열생성

                for (int i = 0, num = 2; i < n; i++, num += 2) {//배열 처음부터 마지막까지 2의 배수를 할당
                    evenNumbers[i] = num;//배열 처음부터 마지막까지 2의 배수를 할당
                }
                return evenNumbers;//값이 할당된 배열 전체를 리턴
            }
        }

