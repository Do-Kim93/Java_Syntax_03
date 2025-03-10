package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//  문제 - 자동차 객체를 담을 변수를 만들어주세요.
        Car car1 = new Car();
//  문제 - 자동차 객체를 만들고 변수에 담아주세요.
        car1.car_color = "black";
        car1.car_model = "k9";
        car1.car_price = "1억";
        car1.car_year = "25년식";
        car1.max_speed = 250;
        car1.run(10);

        Car car2 = new Car();
//  문제 - 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
        car2.car_color = "red";
        car2.car_model = "k5";
        car2.car_price = "4500";
        car2.car_year = "25년식";
        car2.max_speed = 220;
        car1.run(30);

        사람 a = new 사람();
        a.age =23;
        a.name = "김철수";
        a.isMarried = false;
        a.introduce();

        사람 b = new 사람();
        b.age =24;
        b.name = "홍길동";
        b.isMarried = true;
        b.introduce();
    }
}
class 사람 {
    int age;
    String name;
    boolean isMarried;

    void introduce(){
        System.out.println("===자기소개===");
        System.out.printf("나의 이름은 : %s\n", this.name);
        System.out.printf("나의 나이는 : %d\n", this.age);
        System.out.printf("나의 결혼 여부는 : %b\n", this.isMarried);

    }
}

//문제 - 자동차 설계도를 만들어주세요.
class Car {
    String car_model;
    String car_price;
    String car_color;
    String car_year;
    int max_speed;

    // 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
    void run(int time) {
        System.out.println(this.car_color + " " + this.car_model + "이 " + this.max_speed + "/s의 속도로" + time + " 초간 달려 " + this.max_speed * time + "미터 달렸습니다.");
    }

}



