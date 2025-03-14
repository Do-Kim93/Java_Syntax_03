package org.example;


import java.util.ArrayList;
import java.util.List;
//getter setter 사용법
public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.setId(20);
//        a사람.id =20;// 사람클래스의 전역변수 id가 private 으로 선언되있어서 못씀

        System.out.println("번호 : " + a사람.getId());
//        System.out.println("번호 : " + a사람.id);
    }
}
class 사람 {
    private int id = 11;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}