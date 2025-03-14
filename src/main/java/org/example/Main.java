package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> l = new ArrayList<>(); // 동적 할당(dynamic allocation)
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        System.out.println(l.size());
        l.remove(3);//이러면 3번 인덱스에 있는 요소가 지워짐
        l.add(1);//이렇게 하면 제일 뒷자리에가서 붙는다
        l.add(2,55);//이렇게하면 원하는 자리에 삽입가능
        l.set(1,66);//이러면 1번 인덱스에 있는 값이 66으로 바뀐다
        //원하는 자리에 삽입할때는 한칸 건너 뛰기 불가능
        System.out.println(l);
        System.out.println(l.get(0));//이러면 입력한 입력한 값에있는 인덱스의 요소를 가져올수있다
        System.out.println(l.subList(0,2));//이러면 인덱스0부터2에있는 값을 다가져올수있다.


    }
}