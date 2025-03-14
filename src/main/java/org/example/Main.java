package org.example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1 == p2 : " + (p1 == p2)); // 리모컨끼리 비교, 당연히 false
        System.out.println("p1.equals(p2) : " + p1.equals(p2));// 서로다른 메모리에 위치해서 false가 반환됨
        // f -> 어떤 내용이 같을 때 같다는 취급을 할건지에 대한 명시 x
        // 객체끼리 비교, Person 클래스에 equals 메서드를 오버라이드 하지 않아서 false
        // 즉, 객체 비교를 하려면 해당 클래스에 equals 메서드를 오버라이드 해야함

        String s1 = "하하"; // 문장 객체 생성됨
        String s2 = "하하"; // 객체의 리모컨만 리턴, 이유 : 메모리 절약

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        String s3 = new String("하하"); // 재활용 x
        String s4 = new String("하하"); // 재활용 x

        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);

        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3.equals(s4) : " + s3.equals(s4));

    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

}