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

        Car car2 = new Car();
//  문제 - 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
        car2.car_color = "red";
        car2.car_model = "k5";
        car2.car_price = "4500";
        car2.car_year = "25년식";
        car2.max_speed = 220;


        Car car3 = new Car();
        car3.car_color = "blue";
        car3.car_model = "k3";
        car3.car_price = "3000";
        car3.car_year = "25년식";
        car3.max_speed = 200;


        Player player1 = new Player();
        player1.name = "홍삼동";
        player1.age = 2500;
        player1.job = "신선";

        car1.run(10);
        car2.run(10);
        car3.run(10);

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

class Player {
    String name;
    int age;
    String job;
}



