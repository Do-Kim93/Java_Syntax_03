package org.example;
// 문제 : 아래가 실행되도록 해주세요.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // 철수나이 20
        // 영희나이 22
        // 영수나이 33 로 저장하기 여러가지 표현방법
        //맵은 넣을땐 불편하지만 가져올 땐 편함
        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("철수 나이", 20); //index : 철수(key)
        agesMap.put("영희 나이", 22);
        agesMap.put("영수 나이", 33);
        System.out.println("map철수 나이 : " + agesMap.get("철수 나이"));
        System.out.println("map영희 나이 : " + agesMap.get("영희 나이"));
        System.out.println("map영수 나이 : " + agesMap.get("영수 나이"));

        //ArrayList<>()는 공백을 허용하지 않는다. 즉 remove를 하면 한자리씩 밀려와서 빈자리를 채운다.
        //ArrayList<>()는 넣을땐 편한데 가져올땐 불편함
        List<Integer> ages = new ArrayList<>();
        ages.add(20); // index : 0
        ages.add(22);
        ages.add(33);

        System.out.println("철수 나이 : " + ages.get(0));
        System.out.println("영희 나이 : " + ages.get(1));
        System.out.println("영수 나이 : " + ages.get(2));

    }
}

