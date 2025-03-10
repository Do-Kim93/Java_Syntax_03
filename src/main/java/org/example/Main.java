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
        car1.max_speed = 10;
        car1.run(10);
    }
}

//문제 - 자동차 설계도를 만들어주세요.
class Car {
    public String car_model;
    public String car_price;
    public String car_color;
    public String car_year;
    public int max_speed;
    //메서드 부분
    public void run(int time){
        System.out.println(this.car_color + " " + this.car_model + "이 " + this.max_speed + "/s의 속도로" + time + " 초간 달려 " + this.max_speed * time + "미터 달렸습니다.");
    }

}


